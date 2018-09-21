import java.util.ArrayList;
import java.util.List;

public class Preorder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        order(root,result);
        return result;
    }

    private void order(Node node, List<Integer> list){
        if (node == null) return;
        list.add(node.val);
        if (node.children != null){
            for (int i = 0; i < node.children.size(); i++) {
                order(node.children.get(i),list);
            }
        }
    }
}
