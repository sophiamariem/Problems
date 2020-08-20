public class ReorderList {

    //reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode l1 = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode l2 = reverse(slow);
        merge(l1, l2);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode n1 = l1.next, n2 = l2.next;
            l1.next = l2;

            if (n1 == null) {
                break;
            }

            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
