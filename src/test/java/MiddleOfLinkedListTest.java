import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MiddleOfLinkedListTest {
    private static final MiddleOfLinkedList.ListNode ONE = new MiddleOfLinkedList.ListNode(1);
    private static final MiddleOfLinkedList.ListNode TWO = new MiddleOfLinkedList.ListNode(2);
    private static final MiddleOfLinkedList.ListNode THREE = new MiddleOfLinkedList.ListNode(3);
    private static final MiddleOfLinkedList.ListNode FOUR = new MiddleOfLinkedList.ListNode(4);
    private MiddleOfLinkedList.ListNode five = new MiddleOfLinkedList.ListNode(5);

    private MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();

    @Before
    public void setup() {
        ONE.next = TWO;
        TWO.next = THREE;
        THREE.next = FOUR;
        FOUR.next = five;
    }

    @Test
    public void test() {
        assertEquals(THREE, middleOfLinkedList.middleNode(ONE));

        setUpSixthNode();
        assertEquals(FOUR, middleOfLinkedList.middleNode(ONE));
    }

    @Test
    public void testPointers() {
        assertEquals(THREE, middleOfLinkedList.middleNodePointers(ONE));

        setUpSixthNode();
        assertEquals(FOUR, middleOfLinkedList.middleNodePointers(ONE));
    }

    private void setUpSixthNode() {
        MiddleOfLinkedList.ListNode six = new MiddleOfLinkedList.ListNode(6);
        five.next = six;
    }
}
