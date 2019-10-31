import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429 {
    public class Node {
        public int val;
        public List<Node> children;
        public Node() {

        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children  =_children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                Node temp = q.poll();
                level.add(temp.val);
                // can also use
                for (Node c : temp.children) {
                    q.add(c);
                } 
                // for (int j = 0; j < temp.children.size(); j++) {
                //     q.add(temp.children.get(i));
                // }
            }
            res.add(level);
        }

        return res;
    }
}