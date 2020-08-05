import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordDictionaryTest {

    private WordDictionary wordDictionary = new WordDictionary();

    @Test
    public void test() {
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");

        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
        assertTrue(wordDictionary.search(".ad"));
        assertTrue(wordDictionary.search("b.."));
    }

    @Test
    public void testSol2() {
        wordDictionary.addWordTn("bad");
        wordDictionary.addWordTn("dad");
        wordDictionary.addWordTn("mad");

        assertFalse(wordDictionary.searchTn("pad"));
        assertTrue(wordDictionary.searchTn("bad"));
        assertTrue(wordDictionary.searchTn(".ad"));
        assertTrue(wordDictionary.searchTn("b.."));
    }

}
