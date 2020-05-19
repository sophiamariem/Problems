import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockSpannerTest {

    private StockSpanner stockSpanner = new StockSpanner();

    @Test
    public void testMonotonicStack() {
        assertEquals(1, stockSpanner.nextWithMonotonicStack(100));
        assertEquals(1, stockSpanner.nextWithMonotonicStack(80));
        assertEquals(1, stockSpanner.nextWithMonotonicStack(60));
        assertEquals(2, stockSpanner.nextWithMonotonicStack(70));
        assertEquals(1, stockSpanner.nextWithMonotonicStack(60));
        assertEquals(4, stockSpanner.nextWithMonotonicStack(75));
        assertEquals(6, stockSpanner.nextWithMonotonicStack(85));
    }

    @Test
    public void testTailLength() {
        assertEquals(1, stockSpanner.nextWithTailLength(100));
        assertEquals(1, stockSpanner.nextWithTailLength(80));
        assertEquals(1, stockSpanner.nextWithTailLength(60));
        assertEquals(2, stockSpanner.nextWithTailLength(70));
        assertEquals(1, stockSpanner.nextWithTailLength(60));
        assertEquals(4, stockSpanner.nextWithTailLength(75));
        assertEquals(6, stockSpanner.nextWithTailLength(85));
    }
}
