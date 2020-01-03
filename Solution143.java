public class Solution143 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode (int x) { val = x; }
    }

    public void reorderList(ListNode head) {
        // Edge Case
        if (head == null || head.next == null) return;
        
        // First Step: find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Second Step: Reverse the second half of the list
        ListNode middle = slow;
        ListNode prev = slow.next;
        while (prev.next != null) {
            ListNode curr = prev.next;
            prev.next = curr.next;
            curr.next = middle.next;
            middle.next = curr;
        }

        // Third Step: Reorder the list one by one
        ListNode p1 = head;
        ListNode p2 = middle.next;
        while ( p1 != middle) {
            middle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = middle.next;
        }
    }
}