import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void test() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode l1Next = new AddTwoNumbers.ListNode(4);
        l1.next = l1Next;
        l1Next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode l2Next = new AddTwoNumbers.ListNode(6);
        l2.next = l2Next;
        l2Next.next = new AddTwoNumbers.ListNode(4);

        AddTwoNumbers.ListNode expected = new AddTwoNumbers.ListNode(7);
        AddTwoNumbers.ListNode expectedNext = new AddTwoNumbers.ListNode(0);
        expected.next = expectedNext;
        expectedNext.next = new AddTwoNumbers.ListNode(8);

        assertEquals(expected, addTwoNumbers.addTwoNumbers(l1, l2));
    }
}
