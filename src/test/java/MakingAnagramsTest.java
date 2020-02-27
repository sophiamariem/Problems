import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MakingAnagramsTest {

    private MakingAnagrams anagrams = new MakingAnagrams();

    @Test
    public void test() {
        assertEquals(4, anagrams.makingAnagrams("cde", "abc"));
    }
}
