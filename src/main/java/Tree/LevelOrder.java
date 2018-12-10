package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<List<Integer>> levelOrder(Node root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> curList = new LinkedList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                curList.add(node.val);
                for (Node node1 : node.children){
                    queue.offer(node1);
                }
            }
            result.add(curList);
        }
        return result;
    }

    private List<List<Integer>> arr = new ArrayList();

    public List<List<Integer>> levelOrder1(Node root) {
        if (root != null)
            return this.levelOrder(root, 0);
        return this.arr;
    }

    public List<List<Integer>> levelOrder(Node root, int level) {
        if (root != null) {
            if (level >= this.arr.size())
                this.arr.add(new ArrayList<Integer>());
            this.arr.get(level++).add(root.val);
            for(Node child : root.children)
                this.levelOrder(child, level);
        }
        return this.arr;
    }
}
