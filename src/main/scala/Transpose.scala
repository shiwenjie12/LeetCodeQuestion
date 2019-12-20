object Transpose {
  def transpose(A: Array[Array[Int]]): Array[Array[Int]] = {
    val leni = A.length
    val lenj = A(0).length
    val ans = Array.ofDim[Int](lenj, leni)
    for (i <- 0 until leni){
      for (j <- 0 until lenj)
        ans(j)(i) = A(i)(j)
    }
    ans
  }
}
