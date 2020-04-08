public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        int count = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }

        int idx = count / 2;
        current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }

        return current;
    }

    public ListNode middleNodePointers(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
