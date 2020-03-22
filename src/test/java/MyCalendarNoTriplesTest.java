import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyCalendarNoTriplesTest {

    private MyCalendarNoTriples myCalendar;

    @Test
    public void test() {
        myCalendar = new MyCalendarNoTriples();

        assertTrue(myCalendar.book(10, 20));
        assertTrue(myCalendar.book(50, 60));
        assertTrue(myCalendar.book(10, 40));
        assertFalse(myCalendar.book(5, 15));
        assertTrue(myCalendar.book(5, 10));
        assertTrue(myCalendar.book(25, 55));
    }

}
