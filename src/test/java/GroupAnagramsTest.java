import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GroupAnagramsTest {

    private GroupAnagrams anagramGroups = new GroupAnagrams();

    @Test
    public void test() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("eat","tea","ate"));
        expected.add(Arrays.asList("tan","nat"));
        expected.add(Arrays.asList("bat"));

       assertEquals(expected, anagramGroups.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
