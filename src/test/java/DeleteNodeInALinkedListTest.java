import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteNodeInALinkedListTest {

    private DeleteNodeInALinkedList deleteNodeInALinkedList = new DeleteNodeInALinkedList();

    @Test
    public void test() {
        DeleteNodeInALinkedList.ListNode n1 = new DeleteNodeInALinkedList.ListNode(4);
        DeleteNodeInALinkedList.ListNode n2 = new DeleteNodeInALinkedList.ListNode(5);
        DeleteNodeInALinkedList.ListNode n3 = new DeleteNodeInALinkedList.ListNode(1);
        DeleteNodeInALinkedList.ListNode n4 = new DeleteNodeInALinkedList.ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        deleteNodeInALinkedList.deleteNode(n2);

        assertEquals(n3, n1.getNext());
        assertEquals(n4, n3.getNext());
    }
}
