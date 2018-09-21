import java.util.ArrayList;
import java.util.List;

public class Postorder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        order(root,list);
        return list;
    }

    public void order(Node node,List<Integer> list){
        if (node.children == null)
            list.add(node.val);
        for (Node no: node.children){
            order(no,list);
        }
        list.add(node.val);
    }
}
