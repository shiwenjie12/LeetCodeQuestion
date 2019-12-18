
class MaxDistToClosest {
  def maxDistToClosest(seats: Array[Int]): Int = {
    var currentCount = 0
    var maxCount = 0
    val first1: Int = seats.indexOf(1)
    val last1: Int = seats.lastIndexOf(1)
    for (s <- seats.slice(first1, last1 + 1)) {
      if (s == 1) {
        maxCount = math.max(maxCount, currentCount)
        currentCount = 0
      } else if (s == 0) {
        currentCount += 1
      }
    }

    List((maxCount - 1) / 2 + 1, first1, seats.length - last1 - 1).max
  }
}

object MaxDistToClosest{
  def main(args: Array[String]): Unit = {
    var z = Array(1, 0, 0, 0, 1, 0, 1)
    new MaxDistToClosest().maxDistToClosest(z)
  }

}
