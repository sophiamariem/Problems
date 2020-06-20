import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermutationSequenceTest {

    private PermutationSequence permutationSequence = new PermutationSequence();

    @Test
    public void test() {
        assertEquals("213", permutationSequence.getPermutation(3, 3));
        assertEquals("2314", permutationSequence.getPermutation(4, 9));
    }
}
