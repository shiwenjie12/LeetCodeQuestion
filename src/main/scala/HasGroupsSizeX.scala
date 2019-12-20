object HasGroupsSizeX {
  def hasGroupsSizeX(deck: Array[Int]) = {
    val cc = deck.map((_, 1)).groupBy(_._1).map(a => (a._1, a._2.length)).values.toList
    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    var gcdNum = cc.head
    for (elem <- cc) gcdNum = gcd(gcdNum, elem)
    gcdNum != 1
  }

  def main(args: Array[String]): Unit = {
    hasGroupsSizeX(Array(1, 2, 3, 4, 4, 3, 2, 1))
  }
}
