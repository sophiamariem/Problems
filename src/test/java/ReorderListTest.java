import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ReorderListTest {

    private ReorderList reorderList = new ReorderList();

    @Test
    public void test() {
        //Given 1->2->3->4, reorder it to 1->4->2->3.
        ReorderList.ListNode four = new ReorderList.ListNode(4);
        ReorderList.ListNode three = new ReorderList.ListNode(3, four);
        ReorderList.ListNode two = new ReorderList.ListNode(2, three);
        ReorderList.ListNode one = new ReorderList.ListNode(1, two);
        reorderList.reorderList(one);

        assertEquals(one.next.val, four.val);
        assertEquals(four.next.val, two.val);
        assertEquals(two.next.val, three.val);
        assertEquals(three.next, null);
    }

    @Test
    public void testTwo() {
        //Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
        ReorderList.ListNode five = new ReorderList.ListNode(5);
        ReorderList.ListNode four = new ReorderList.ListNode(4, five);
        ReorderList.ListNode three = new ReorderList.ListNode(3, four);
        ReorderList.ListNode two = new ReorderList.ListNode(2, three);
        ReorderList.ListNode one = new ReorderList.ListNode(1, two);
        reorderList.reorderList(one);

        assertEquals(one.next.val, five.val);
        assertEquals(five.next.val, two.val);
        assertEquals(two.next.val, four.val);
        assertEquals(four.next.val, three.val);
        assertEquals(three.next, null);
    }
}
