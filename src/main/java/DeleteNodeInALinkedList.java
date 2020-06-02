import java.util.Objects;

public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        if (node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode getNext() {
            return next;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }

            ListNode other = (ListNode) obj;
            return Objects.equals(val, other.val) &&
                    Objects.equals(this.next, other.next);
        }


    }
}
