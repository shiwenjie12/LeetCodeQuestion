public class SortedArrayToBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) return null;
        return order(nums,0,nums.length - 1);
    }

    public TreeNode order(int[] nums,int start,int end){
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = order(nums,start,mid - 1);
        treeNode.right = order(nums,mid + 1, end);
        return treeNode;
    }

    public static void main(String[] args) {
        new  SortedArrayToBST().sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
