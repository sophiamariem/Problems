public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val > l2.val) {
            return mergeTwoLists(l2, l1);
        }

        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public void next(ListNode next) {
            this.next = next;
        }
    }
}
