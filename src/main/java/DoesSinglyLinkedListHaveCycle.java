public class DoesSinglyLinkedListHaveCycle {

    public boolean hasCycle(LinkedListNode root) {
        LinkedListNode slow = root;
        LinkedListNode fast = root;

        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static class LinkedListNode {
        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

}
