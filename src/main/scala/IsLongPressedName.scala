object IsLongPressedName {
  def isLongPressedName(name: String, typed: String): Boolean = {
    if (name.equals(typed)) true
    if (name.length > typed.length) false
    var i, j = 0
    while (i < name.length && j < typed.length) {
      if (name.charAt(i) == typed.charAt(j)) {
        i += 1
        j += 1
      } else {
        j += 1
      }
    }
    i == name.length
  }

  def main(args: Array[String]): Unit = {
    println(isLongPressedName("alex",
      "aaleex"))
  }
}
