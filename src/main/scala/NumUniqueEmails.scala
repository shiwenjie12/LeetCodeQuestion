object NumUniqueEmails {
  def numUniqueEmails(emails: Array[String]) = {
    println(emails.map(e => (e.split("@")(0), e.split("@")(1)))
      .map(elem => (elem._1.replace(".", ""), elem._2))
      .map(elem =>
        if (elem._1.contains("+"))
          elem._1.substring(0, elem._1.indexOf('+')) + "@" + elem._2
        else
          elem._1 + "@" + elem._2
      )
      .toSet.toList)
  }

  def main(args: Array[String]): Unit = {
    numUniqueEmails(Array("test.email+alex@leetcode.com", "test.email@leetcode.com"))
  }
}
