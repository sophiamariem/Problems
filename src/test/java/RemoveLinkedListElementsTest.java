import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveLinkedListElementsTest {

    private RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

    @Test
    public void test() {
        RemoveLinkedListElements.ListNode fsix = new RemoveLinkedListElements.ListNode(6);
        RemoveLinkedListElements.ListNode five = new RemoveLinkedListElements.ListNode(5, fsix);
        RemoveLinkedListElements.ListNode four = new RemoveLinkedListElements.ListNode(4, five);
        RemoveLinkedListElements.ListNode three = new RemoveLinkedListElements.ListNode(3, four);
        RemoveLinkedListElements.ListNode six = new RemoveLinkedListElements.ListNode(6, three);
        RemoveLinkedListElements.ListNode two = new RemoveLinkedListElements.ListNode(2, six);
        RemoveLinkedListElements.ListNode one = new RemoveLinkedListElements.ListNode(1, two);

        assertEquals(1, removeLinkedListElements.removeElements(one, 6).val);

        assertEquals(two, one.next);
        assertEquals(three, two.next);
        assertEquals(four, three.next);
        assertEquals(five, four.next);
        assertNull(five.next);
    }
}
