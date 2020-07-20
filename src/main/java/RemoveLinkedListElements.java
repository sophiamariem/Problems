public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode updated = new ListNode();
        ListNode current = updated;

        while (head != null) {
            if (head.val != val) {
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }
        current.next = null;

        return updated.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
