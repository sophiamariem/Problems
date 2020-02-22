import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TopKFrequentTest {

    private TopKFrequent topKFrequent = new TopKFrequent();

    @Test
    public void testOne() {
        String[] input = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        List<String> expected = new ArrayList(Arrays.asList("i", "love"));
        assertEquals(expected, topKFrequent.topKFrequent(input, 2));
    }

    @Test
    public void testTwo() {
        String[] input = new String[]{"love", "i", "leetcode", "love", "i", "coding"};
        List<String> expected = new ArrayList(Arrays.asList("i", "love"));
        assertEquals(expected, topKFrequent.topKFrequent(input, 2));
    }

    @Test
    public void testThree() {
        String[] input = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> expected = new ArrayList(Arrays.asList("the", "is", "sunny", "day"));
        assertEquals(expected, topKFrequent.topKFrequent(input, 4));
    }

    @Test
    public void testFour() {
        String[] input = new String[]{"i", "a", "a", "i"};
        List<String> expected = new ArrayList(Arrays.asList("a", "i"));
        assertEquals(expected, topKFrequent.topKFrequent(input, 2));
    }

    @Test
    public void testFive() {
        String[] input = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "abc", "is", "is",
                "abc", "abc", "abc"};
        List<String> expected = new ArrayList(Arrays.asList("abc", "the", "is", "sunny"));
        assertEquals(expected, topKFrequent.topKFrequent(input, 4));
    }

}
