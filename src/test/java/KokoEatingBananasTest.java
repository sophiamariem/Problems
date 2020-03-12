import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KokoEatingBananasTest {

    private KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();

    @Test
    public void testOne() {
        int[] input = new int[]{3, 6, 7, 11};
        assertEquals(4, kokoEatingBananas.minEatingSpeed(input, 8));
    }

    @Test
    public void testTwo() {
        int[] input = new int[]{30, 11, 23, 4, 20};
        assertEquals(30, kokoEatingBananas.minEatingSpeed(input, 5));
    }

    @Test
    public void testThree() {
        int[] input = new int[]{30, 11, 23, 4, 20};
        assertEquals(23, kokoEatingBananas.minEatingSpeed(input, 6));
    }
}
