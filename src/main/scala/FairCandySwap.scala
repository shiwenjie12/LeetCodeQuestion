object FairCandySwap {
  def fairCandySwap(a: Array[Int], b: Array[Int]): Array[Int] = {
    val diff = (a.sum - b.sum) / 2
    var cc = a.map(elem => (elem, elem - diff))
      .find(elem => b.contains(elem._2))
      .get
    Array(cc._1, cc._2)
  }
}
