public class Solution92 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;

        ListNode cur = head;
        ListNode prev = null;

        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m -= 1;
            n -= 1;
        }

        ListNode con = prev;
        ListNode tail = cur;
        ListNode third = null;

        while (n > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n -= 1;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }
        
        tail.next = cur;
        return head;
    }
}