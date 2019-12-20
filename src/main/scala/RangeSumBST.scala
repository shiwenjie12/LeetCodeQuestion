object RangeSumBST {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  def rangeSumBST(root: TreeNode, L: Int, R: Int): Int = {
    if (root == null) return 0

    if (root.value >= L && root.value <= R) {
      root.value + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R)
    } else if (root.value < L) {
      rangeSumBST(root.right, L, R)
    } else {
      rangeSumBST(root.left, L, R)
    }
  }
}
