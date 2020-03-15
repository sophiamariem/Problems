import java.util.Objects;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode helper = new ListNode();
        ListNode answer = helper;
        int sum = 0;

        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            helper.next = new ListNode(sum % 10);
            helper = helper.next;
            sum /= 10;
        }

        return answer.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            val = x;
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

            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            ListNode other = (ListNode) obj;
            return Objects.equals(this.val, other.val) &&
                    Objects.equals(this.next, other.next);
        }

    }
}
