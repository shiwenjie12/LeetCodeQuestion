object LemonadeChange {
  def lemonadeChange(bills: Array[Int]): Boolean = {
    var num5 = 0
    var num10 = 0
    var num20 = 0
    for (elem <- bills) {
      elem match {
        case 5 => num5 += 1
        case 10 =>
          if (num5 == 0) return false
          num5 -= 1
          num10 += 1
        case 20 =>
          if (num5 >= 1 && num10 >= 1) {
            num5 -= 1
            num10 -= 1
            num20 += 1
          } else if (num10 == 0 && num5 >= 3) {
            num5 -= 3
            num20 += 1
          } else {
            return false
          }
      }
    }
    true
  }
}
