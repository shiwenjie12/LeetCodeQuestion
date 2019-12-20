object UncommonFromSentences {
  def uncommonFromSentences(a: String, b: String) = {
    (a + " " + b)
      .split(" ")
      .map((_, 1))
      .groupBy(_._1)
      .filter(_._2.length == 1)
      .keys
      .toArray
  }

  def main(args: Array[String]): Unit = {
    uncommonFromSentences("apple apple",
      "banana")
  }
}
