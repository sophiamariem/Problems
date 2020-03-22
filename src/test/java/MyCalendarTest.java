import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyCalendarTest {
    private MyCalendar myCalendar;

    @Test
    public void testOne() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookList(10, 20));
        assertFalse(myCalendar.bookList(15, 25));
        assertTrue(myCalendar.bookList(20, 30));
        assertTrue(myCalendar.bookList(5, 10));
    }

    @Test
    public void testOneTree() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookTreeMap(10, 20));
        assertFalse(myCalendar.bookTreeMap(15, 25));
        assertTrue(myCalendar.bookTreeMap(20, 30));
        assertTrue(myCalendar.bookTreeMap(5, 10));
    }

    @Test
    public void testOneNode() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookNode(10, 20));
        assertFalse(myCalendar.bookNode(15, 25));
        assertTrue(myCalendar.bookNode(20, 30));
        assertTrue(myCalendar.bookNode(5, 10));
    }

    @Test
    public void testTwo() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookList(47, 50));
        assertTrue(myCalendar.bookList(33, 41));
        assertFalse(myCalendar.bookList(39, 45));
        assertFalse(myCalendar.bookList(33, 42));
        assertTrue(myCalendar.bookList(25, 32));
        assertFalse(myCalendar.bookList(26, 35));
        assertTrue(myCalendar.bookList(19, 25));
        assertTrue(myCalendar.bookList(3, 8));
        assertTrue(myCalendar.bookList(8, 13));
        assertFalse(myCalendar.bookList(18, 27));
    }

    @Test
    public void testTwoTree() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookTreeMap(47, 50));
        assertTrue(myCalendar.bookTreeMap(33, 41));
        assertFalse(myCalendar.bookTreeMap(39, 45));
        assertFalse(myCalendar.bookTreeMap(33, 42));
        assertTrue(myCalendar.bookTreeMap(25, 32));
        assertFalse(myCalendar.bookTreeMap(26, 35));
        assertTrue(myCalendar.bookTreeMap(19, 25));
        assertTrue(myCalendar.bookTreeMap(3, 8));
        assertTrue(myCalendar.bookTreeMap(8, 13));
        assertFalse(myCalendar.bookTreeMap(18, 27));
    }

    @Test
    public void testTwoNode() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookNode(47, 50));
        assertTrue(myCalendar.bookNode(33, 41));
        assertFalse(myCalendar.bookNode(39, 45));
        assertFalse(myCalendar.bookNode(33, 42));
        assertTrue(myCalendar.bookNode(25, 32));
        assertFalse(myCalendar.bookNode(26, 35));
        assertTrue(myCalendar.bookNode(19, 25));
        assertTrue(myCalendar.bookNode(3, 8));
        assertTrue(myCalendar.bookNode(8, 13));
        assertFalse(myCalendar.bookNode(18, 27));
    }

    @Test
    public void testThree() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookList(37, 50));
        assertFalse(myCalendar.bookList(33, 50));
        assertTrue(myCalendar.bookList(4, 17));
        assertFalse(myCalendar.bookList(35, 48));
        assertFalse(myCalendar.bookList(8, 25));
    }

    @Test
    public void testThreeTree() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookTreeMap(37, 50));
        assertFalse(myCalendar.bookTreeMap(33, 50));
        assertTrue(myCalendar.bookTreeMap(4, 17));
        assertFalse(myCalendar.bookTreeMap(35, 48));
        assertFalse(myCalendar.bookTreeMap(8, 25));
    }

    @Test
    public void testThreeNode() {
        myCalendar = new MyCalendar();

        assertTrue(myCalendar.bookNode(37, 50));
        assertFalse(myCalendar.bookNode(33, 50));
        assertTrue(myCalendar.bookNode(4, 17));
        assertFalse(myCalendar.bookNode(35, 48));
        assertFalse(myCalendar.bookNode(8, 25));
    }
}
