

object SortArrayByParityII {
  def sortArrayByParityII(a: Array[Int]) = {
    var (arr1, arr2) = a.partition(p => p % 2 == 0)
    import scala.collection.mutable
    var result = new mutable.ArrayBuffer[Int]
    for (i <- arr1.indices) {
      result += arr1(i)
      result += arr2(i)
    }
    result.toArray
  }

  def main(args: Array[String]): Unit = {
    sortArrayByParityII(Array(4, 2, 5, 7))
  }
}
