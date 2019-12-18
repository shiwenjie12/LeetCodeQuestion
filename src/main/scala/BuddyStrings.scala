object BuddyStrings {
  def buddyStrings(A: String, B: String): Boolean = {
    if (A.length != B.length)
      false
    if (A equals B) {
      for (i <- A.indices) {
        if (A.indexOf(A.charAt(i)) != i)
          return true
      }
    }
    var count = 0
    var strA1 = 0
    var strA2 = 0
    var strB1 = 0
    var strB2 = 0
    for (i <- A.indices) {
      if (A.charAt(i) != B.charAt(i)) {
        count += 1
        if (count == 1) {
          strA1 = A.charAt(i)
          strB1 = B.charAt(i)
        }
        if (count == 2) {
          strA2 = A.charAt(i)
          strB2 = B.charAt(i)
        }
      }
      if (count > 2) false
    }
    count == 2 && strA1 == strB2 && strA2 == strB1
  }

  def main(args: Array[String]): Unit = {
    print(buddyStrings("ab", "ba"))
  }
}
