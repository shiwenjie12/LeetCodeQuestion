object IsMonotonic {
  def isMonotonic(a: Array[Int]): Boolean = {
    (a sameElements a.sorted) || (a sameElements a.sorted.reverse)
  }

  def main(args: Array[String]): Unit = {
    isMonotonic(Array(1, 2, 2, 3))
  }
}
