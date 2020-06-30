import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordSearchIITest {

    private WordSearchII wordSearchII = new WordSearchII();

    @Test
    public void test() {
        String eat = "eat";
        String oath = "oath";

        List<String> result = new ArrayList<>(Arrays.asList(oath, eat));

        assertEquals(result, wordSearchII.findWords(
                new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}},
                new String[]{oath, "pea", eat, "rain"}));
    }
}
