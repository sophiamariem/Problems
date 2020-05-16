import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddEvenLinkedListTest {

    private OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

    @Test
    public void testOne() {
        OddEvenLinkedList.ListNode four = new OddEvenLinkedList.ListNode(5, null);
        OddEvenLinkedList.ListNode three = new OddEvenLinkedList.ListNode(4, four);
        OddEvenLinkedList.ListNode two = new OddEvenLinkedList.ListNode(3, three);
        OddEvenLinkedList.ListNode one = new OddEvenLinkedList.ListNode(2, two);
        OddEvenLinkedList.ListNode zero = new OddEvenLinkedList.ListNode(1, one);

        assertEquals(zero, oddEvenLinkedList.oddEvenList(zero));
        assertEquals(two, zero.next);
        assertEquals(four, two.next);
        assertEquals(one, four.next);
        assertEquals(three, one.next);
        assertEquals(null, three.next);
    }

    @Test
    public void testTwo() {
        OddEvenLinkedList.ListNode six = new OddEvenLinkedList.ListNode(7, null);
        OddEvenLinkedList.ListNode five = new OddEvenLinkedList.ListNode(4, six);
        OddEvenLinkedList.ListNode four = new OddEvenLinkedList.ListNode(6, five);
        OddEvenLinkedList.ListNode three = new OddEvenLinkedList.ListNode(5, four);
        OddEvenLinkedList.ListNode two = new OddEvenLinkedList.ListNode(3, three);
        OddEvenLinkedList.ListNode one = new OddEvenLinkedList.ListNode(1, two);
        OddEvenLinkedList.ListNode zero = new OddEvenLinkedList.ListNode(2, one);

        assertEquals(zero, oddEvenLinkedList.oddEvenList(zero));
        assertEquals(two, zero.next);
        assertEquals(four, two.next);
        assertEquals(six, four.next);
        assertEquals(one, six.next);
        assertEquals(three, one.next);
        assertEquals(five, three.next);
        assertEquals(null, five.next);
    }

    @Test
    public void testThree() {
        OddEvenLinkedList.ListNode seven = new OddEvenLinkedList.ListNode(8, null);
        OddEvenLinkedList.ListNode six = new OddEvenLinkedList.ListNode(7, seven);
        OddEvenLinkedList.ListNode five = new OddEvenLinkedList.ListNode(6, six);
        OddEvenLinkedList.ListNode four = new OddEvenLinkedList.ListNode(5, five);
        OddEvenLinkedList.ListNode three = new OddEvenLinkedList.ListNode(4, four);
        OddEvenLinkedList.ListNode two = new OddEvenLinkedList.ListNode(3, three);
        OddEvenLinkedList.ListNode one = new OddEvenLinkedList.ListNode(2, two);
        OddEvenLinkedList.ListNode zero = new OddEvenLinkedList.ListNode(1, one);

        assertEquals(zero, oddEvenLinkedList.oddEvenList(zero));
        assertEquals(two, zero.next);
        assertEquals(four, two.next);
        assertEquals(six, four.next);
        assertEquals(one, six.next);
        assertEquals(three, one.next);
        assertEquals(five, three.next);
        assertEquals(seven, five.next);
        assertEquals(null, seven.next);
    }

    @Test
    public void testFour() {
        assertEquals(null, oddEvenLinkedList.oddEvenList(null));
    }
}
