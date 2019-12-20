object validMountainArray {
  def validMountainArray(a: Array[Int]): Boolean = {
    var l = 0
    var r = a.length - 1
    while ((l < r) && (a(l) < a(l + 1))) l += 1
    while ((r > l) && (a(r) < a(r + 1))) r -= 1
    l == r && l != 0 && r != a.length - 1
  }

  def main(args: Array[String]): Unit = {
    println(validMountainArray(Array(2, 1)))
  }
}
