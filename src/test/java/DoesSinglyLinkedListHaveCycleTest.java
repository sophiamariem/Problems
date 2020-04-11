import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DoesSinglyLinkedListHaveCycleTest {
    private DoesSinglyLinkedListHaveCycle singlyLL = new DoesSinglyLinkedListHaveCycle();
    private DoesSinglyLinkedListHaveCycle.LinkedListNode root = new DoesSinglyLinkedListHaveCycle.LinkedListNode(1);
    private DoesSinglyLinkedListHaveCycle.LinkedListNode rootNext = new DoesSinglyLinkedListHaveCycle.LinkedListNode(2);
    private DoesSinglyLinkedListHaveCycle.LinkedListNode rootNextNext = new DoesSinglyLinkedListHaveCycle.LinkedListNode(3);
    private DoesSinglyLinkedListHaveCycle.LinkedListNode rNNN = new DoesSinglyLinkedListHaveCycle.LinkedListNode(4);
    private DoesSinglyLinkedListHaveCycle.LinkedListNode rNNNN = new DoesSinglyLinkedListHaveCycle.LinkedListNode(5);

    @Before
    public void setUp() {
        root.next = rootNext;
        rootNext.next = rootNextNext;
        rootNextNext.next = rNNN;
        rNNN.next = rNNNN;
    }

    @Test
    public void testNoCycle() {
        assertFalse(singlyLL.hasCycle(root));
    }

    @Test
    public void testCycle() {
        rNNNN.next = rootNext;
        assertTrue(singlyLL.hasCycle(root));
    }
}
