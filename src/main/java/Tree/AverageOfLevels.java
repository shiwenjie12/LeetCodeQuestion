package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            int tmp = count;
            double sum = 0D;
            while (count > 0) {
                TreeNode head = queue.poll();
                sum += head.val;
                count--;
                if (head.left != null)
                    queue.add(head.left);
                if (head.right != null)
                    queue.add(head.right);
            }
            res.add(sum / tmp);
        }
        return res;
    }
}
