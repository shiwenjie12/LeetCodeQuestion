

class RecentCounter {

  import scala.collection.mutable.ListBuffer

  val waitingForVisit = new ListBuffer[Int]

  def ping(t: Int): Int = {
    waitingForVisit += t
    waitingForVisit.count(_ >= t - 3000)
  }

}

object RecentCounter {
  def main(args: Array[String]): Unit = {
    val counter = new RecentCounter
    println(counter.ping(1))
    println(counter.ping(100))
    println(counter.ping(3001))
    println(counter.ping(3002))
  }
}
