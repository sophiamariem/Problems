import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class WordBreakIITest {

    private WordBreakII wordBreakII = new WordBreakII();

    @Test
    public void test() {
        assertEquals(Arrays.asList("cat sand dog", "cats and dog"),
                wordBreakII.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));

        assertEquals(Arrays.asList("pine apple pen apple", "pine applepen apple", "pineapple pen apple"),
                wordBreakII.wordBreak("pineapplepenapple",
                        Arrays.asList("apple", "pen", "applepen", "pine", "pineapple")));

        assertEquals(Collections.emptyList(),
                wordBreakII.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}
