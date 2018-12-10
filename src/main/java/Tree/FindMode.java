package Tree;

import java.util.*;

public class FindMode {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        findModelInteral(root, map);
        int max = 0;
        List<Integer> res = new ArrayList<>(map.size());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int temp = max;
            max = Math.max(max, entry.getValue());
            if (max > temp){
                res.clear();
            }
            if (max == entry.getValue()){
                res.add(entry.getKey());
            }
        }
        int[] array = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }
        return array;
    }

    private void findModelInteral(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null)
            return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        findModelInteral(root.left, map);
        findModelInteral(root.right, map);
    }
}
