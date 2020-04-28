import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueNumberTest {

    @Test
    public void testOne() {
        FirstUniqueNumber firstUnique = new FirstUniqueNumber(new int[]{2, 3, 5});
        assertEquals(2, firstUnique.showFirstUnique());
        firstUnique.add(5);            // the queue is now [2,3,5,5]
        assertEquals(2, firstUnique.showFirstUnique());
        firstUnique.add(2);            // the queue is now [2,3,5,5,2]
        assertEquals(3, firstUnique.showFirstUnique());
        firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
        assertEquals(-1, firstUnique.showFirstUnique());
    }

    @Test
    public void testTwo() {
        FirstUniqueNumber firstUnique = new FirstUniqueNumber(new int[]{7, 7, 7, 7, 7, 7});
        assertEquals(-1, firstUnique.showFirstUnique());
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
        firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
        assertEquals(17, firstUnique.showFirstUnique());
    }

    @Test
    public void testThree() {
        FirstUniqueNumber firstUnique = new FirstUniqueNumber(new int[]{809});
        assertEquals(809, firstUnique.showFirstUnique());
        firstUnique.add(809);          // the queue is now [809,809]
        assertEquals(-1, firstUnique.showFirstUnique());
    }

    @Test
    public void testFour() {
        FirstUniqueNumber firstUnique = new FirstUniqueNumber(new int[]{3, 2, 5});
        assertEquals(3, firstUnique.showFirstUnique());
        firstUnique.add(5);
        assertEquals(3, firstUnique.showFirstUnique());
        firstUnique.add(3);
        assertEquals(2, firstUnique.showFirstUnique());
        firstUnique.add(2);
        assertEquals(-1, firstUnique.showFirstUnique());
    }

    @Test
    public void testFive() {
        FirstUniqueNumber firstUnique = new FirstUniqueNumber(new int[]{3, 2, 5});
        assertEquals(3, firstUnique.showFirstUnique());
        firstUnique.add(5);
        assertEquals(3, firstUnique.showFirstUnique());
        firstUnique.add(3);
        assertEquals(2, firstUnique.showFirstUnique());
        firstUnique.add(2);
        firstUnique.add(3);
        assertEquals(-1, firstUnique.showFirstUnique());
    }
}
