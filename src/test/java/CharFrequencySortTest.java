import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharFrequencySortTest {
    private CharFrequencySort charFrequencySort = new CharFrequencySort();

    @Test
    public void testOne() {
        assertEquals("eert", charFrequencySort.frequencySort("tree"));
        assertEquals("eert", charFrequencySort.frequencySortFaster("tree"));
    }

    @Test
    public void testTwo() {
        assertEquals("aaaccc", charFrequencySort.frequencySort("cccaaa"));
        assertEquals("aaaccc", charFrequencySort.frequencySortFaster("cccaaa"));
    }

    @Test
    public void testThree() {
        assertEquals("bbAa", charFrequencySort.frequencySort("Aabb"));
        assertEquals("bbAa", charFrequencySort.frequencySortFaster("Aabb"));
    }

    @Test
    public void testFour() {
        assertEquals("AAAaabb", charFrequencySort.frequencySort("AAAaabb"));
        assertEquals("AAAaabb", charFrequencySort.frequencySortFaster("AAAaabb"));
    }

    @Test
    public void testFive() {
        assertEquals("aaabbA", charFrequencySort.frequencySort("Aabbaa"));
        assertEquals("aaabbA", charFrequencySort.frequencySortFaster("Aabbaa"));
    }
}
