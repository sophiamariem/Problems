import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FlattenMultilevelDoublyLinkedListTest {

    private FlattenMultilevelDoublyLinkedList flattenMultilevelDoublyLinkedList = new FlattenMultilevelDoublyLinkedList();
    private FlattenMultilevelDoublyLinkedList.Node n1 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n2 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n3 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n4 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n5 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n6 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n7 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n8 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n9 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n10 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n11 = new FlattenMultilevelDoublyLinkedList.Node();
    private FlattenMultilevelDoublyLinkedList.Node n12 = new FlattenMultilevelDoublyLinkedList.Node();

    @Test
    public void test() {
        /**
         1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
         |
         11--12--NULL
         */

        setUpForFirstTest();
        flattenMultilevelDoublyLinkedList.flatten(n1);
        assertForTestOne();
    }

    @Test
    public void testWithStack() {
        /**
         1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
         |
         11--12--NULL
         */

        setUpForFirstTest();
        flattenMultilevelDoublyLinkedList.flattenWithStack(n1);
        assertForTestOne();
    }

    @Test
    public void testTwo() {
        /**
         1---2---NULL
         |
         3---NULL
         */
        setUpForTestTwo();
        flattenMultilevelDoublyLinkedList.flatten(n1);
        assertForTestTwo();
    }

    @Test
    public void testTwoWithStack() {
        /**
         1---2---NULL
         |
         3---NULL
         */
        setUpForTestTwo();
        flattenMultilevelDoublyLinkedList.flattenWithStack(n1);
        assertForTestTwo();
    }

    private void setUpForFirstTest() {
        n1.val = 1;
        n1.next = n2;

        n2.val = 2;
        n2.next = n3;
        n2.prev = n1;

        n3.val = 3;
        n3.next = n4;
        n3.prev = n2;
        n3.child = n7;

        n4.val = 4;
        n4.next = n5;
        n4.prev = n3;

        n5.val = 5;
        n5.next = n6;
        n5.prev = n4;

        n6.val = 6;
        n6.prev = n5;

        n7.val = 7;
        n7.next = n8;

        n8.val = 8;
        n8.next = n9;
        n8.prev = n7;
        n8.child = n11;

        n9.val = 9;
        n9.next = n10;
        n9.prev = n8;

        n10.val = 10;
        n10.prev = n9;

        n11.val = 11;
        n11.next = n12;

        n12.val = 12;
        n12.prev = n11;
    }

    private void assertForTestOne() {
        assertEquals(n2, n1.next);
        assertNull(n1.prev);

        assertEquals(n3, n2.next);
        assertEquals(n1, n2.prev);

        assertEquals(n7, n3.next);
        assertEquals(n2, n3.prev);

        assertEquals(n8, n7.next);
        assertEquals(n3, n7.prev);

        assertEquals(n11, n8.next);
        assertEquals(n7, n8.prev);

        assertEquals(n12, n11.next);
        assertEquals(n8, n11.prev);

        assertEquals(n9, n12.next);
        assertEquals(n11, n12.prev);

        assertEquals(n10, n9.next);
        assertEquals(n12, n9.prev);

        assertEquals(n4, n10.next);
        assertEquals(n9, n10.prev);

        assertEquals(n5, n4.next);
        assertEquals(n10, n4.prev);

        assertEquals(n6, n5.next);
        assertEquals(n4, n5.prev);
    }

    private void setUpForTestTwo() {
        n1.val = 1;
        n1.next = n2;
        n1.child = n3;

        n2.val = 2;
        n2.prev = n1;

        n3.val = 3;
    }

    private void assertForTestTwo() {
        assertEquals(n3, n1.next);
        assertNull(n1.prev);

        assertEquals(n2, n3.next);
        assertEquals(n1, n3.prev);

        assertEquals(n3, n2.prev);
    }
}
