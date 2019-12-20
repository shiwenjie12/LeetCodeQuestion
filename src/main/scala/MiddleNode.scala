object MiddleNode {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def middleNode(head: ListNode): ListNode = {
    var slow, fast = head
    while (fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
    }
    slow
  }

  def main(args: Array[String]): Unit = {

  }
}
