public class Solution116 {
    public class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        } 
    }

    public Node connect(Node root) {
        Node start = root;
        while (start != null) {
            Node step = start;
            while (step != null) {
                if (step.left != null) {
                    step.left.next = step.right;
                }
                if (step.right != null && step.next != null) {
                    step.right.next = step.next.left;
                }
            }
            start = start.left;
        }
        return root;
    }
}