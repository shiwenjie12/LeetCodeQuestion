

object RobotSim {
  def robotSim(commands: Array[Int], obstacles: Array[Array[Int]]): Int = {
    import scala.collection.mutable
    val direction = Array[Array[Int]](Array(0, 1), Array(1, 0), Array(0, -1), Array(-1, 0))
    val map = new mutable.HashMap[Int, mutable.HashSet[Int]]()
    obstacles.foreach(obstacle => {
      map.getOrElseUpdate(obstacle(0), new mutable.HashSet[Int]()) += obstacle(1)
    })
    var x, y, dir, max = 0
    for (elem <- commands) {
      elem match {
        case -2 => dir = (dir + 3) % 4
        case -1 => dir = (dir + 1) % 4
        case other =>
          var count = 0
          var flag = true
          while (count < other && flag) {
            if (map.contains(x + direction(dir)(0)) &&
              map(x + direction(dir)(0)).contains(y + direction(dir)(1))) {
              flag = false
            } else {
              x += direction(dir)(0)
              y += direction(dir)(1)
            }
            count += 1
          }
          max = math.max(max, x * x + y * y)
      }
    }
    max
  }

  def main(args: Array[String]): Unit = {
    println(robotSim(Array(4, -1, 4, -2, 4), Array[Array[Int]](Array(2, 4))))
  }
}
