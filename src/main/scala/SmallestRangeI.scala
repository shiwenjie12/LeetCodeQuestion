object SmallestRangeI {
  def smallestRangeI(A: Array[Int], K: Int): Int = {
    math.max(0, A.max - A.min - 2 * K)
  }
}
