import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseCharsInWordsTest {

    private ReverseCharsInWords reverse = new ReverseCharsInWords();

    @Test
    public void test() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverse.reverseWords("Let's take LeetCode contest"));
    }
}
