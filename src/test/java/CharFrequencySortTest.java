import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharFrequencySortTest {
    private CharFrequencySort charFrequencySort = new CharFrequencySort();

    @Test
    public void testOne() {
        assertEquals("eert", charFrequencySort.frequencySort("tree"));
    }

    @Test
    public void testTwo() {
        assertEquals("aaaccc", charFrequencySort.frequencySort("cccaaa"));
    }

    @Test
    public void testThree() {
        assertEquals("bbAa", charFrequencySort.frequencySort("Aabb"));
    }

    @Test
    public void testFour() {
        assertEquals("AAAaabb", charFrequencySort.frequencySort("AAAaabb"));
    }

    @Test
    public void testFive() {
        assertEquals("aaabbA", charFrequencySort.frequencySort("Aabbaa"));
    }
}
