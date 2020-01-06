public class Solution117 {
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
        Node dummy = new Node(0, null, null, null);
        Node pre = dummy;

        Node res = root;

        while (res != null) {
            if (res.left != null) {
                pre.next = res.left;
                pre = pre.next;
            }

            if (res.right != null) {
                pre.next = res.right;
                pre = pre.next;
            }

            res = res.next;

            if (res == null) {
                pre = dummy;
                res = dummy.next;
                dummy.next = null;
            }
        }

        return root;
    }
}