package Tree;

import java.util.List;

public class MaxDepth {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int dp = 0;
        for (int i = 0; i < root.children.size(); i++) {
            dp = Math.max(dp,maxDepth(root.children.get(i)));
        }
        return dp + 1;
    }
}
