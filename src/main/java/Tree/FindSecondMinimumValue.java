package Tree;

public class FindSecondMinimumValue {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int rootVal;
    int secondMin = -1;

    public int findSecondMinimumValue(TreeNode root) {
        rootVal = root.val;
        traserval(root);
        return secondMin;
    }

    public void traserval(TreeNode node) {
        if (node == null)
            return;
        if (node.val == rootVal) {
            traserval(node.left);
            traserval(node.right);
            return;
        }
        if (node.val < secondMin || secondMin == -1) {
            secondMin = node.val;
        }
    }

    public static byte[] intToByteArray(int a) {
        return new byte[]{
                (byte) ((a >> 24) & 0xFF),
                (byte) ((a >> 16) & 0xFF),
                (byte) ((a >> 8) & 0xFF),
                (byte) (a & 0xFF)
        };
    }

    public static void main(String[] args) {
        int a = -1;
        byte[] cc = FindSecondMinimumValue.intToByteArray(a);
    }
}
