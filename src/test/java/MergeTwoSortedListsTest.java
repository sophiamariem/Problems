import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void test() {
        MergeTwoSortedLists.ListNode l1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode l12 =new MergeTwoSortedLists.ListNode(2);
        MergeTwoSortedLists.ListNode l13 =new MergeTwoSortedLists.ListNode(4);
        l1.next(l12);
        l12.next(l13);

        MergeTwoSortedLists.ListNode l2 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode l22 =new MergeTwoSortedLists.ListNode(3);
        MergeTwoSortedLists.ListNode l23 =new MergeTwoSortedLists.ListNode(4);
        l2.next(l22);
        l22.next(l23);

        MergeTwoSortedLists.ListNode result = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
    }
}
