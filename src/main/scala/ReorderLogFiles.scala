object ReorderLogFiles {
  def reorderLogFiles(logs: Array[String]): Array[String] = {
    var (nums, strs) = logs.partition(log => {
      val ch = log.charAt(log.length - 1)
      ch >= '0' && ch <= '9'
    })
    Array.concat(strs.sortWith((str1, str2) =>
      str1.substring(str1.indexOf(" ") + 1) <= str2.substring(str2.indexOf(" ") + 1)), nums)
  }

  def main(args: Array[String]): Unit = {
    println(reorderLogFiles(Array("g1 act car", "a2 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7")).toList)
  }
}
