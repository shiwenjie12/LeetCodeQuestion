object PeakIndexInMountainArray {
  def peakIndexInMountainArray(A: Array[Int]): Int = {
    var result = 0
    var flag = true
    for (i <- 0 to A.length - 2) {
      if (flag && A(i) > A(i + 1)) {
        result = i
        flag = false
      }
    }
    result
  }


  def main(args: Array[String]): Unit = {

  }
}
