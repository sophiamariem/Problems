import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JewelsNStonesTest {

    private JewelsNStones jewelsNStones = new JewelsNStones();

    @Test
    public void test() {
        assertEquals(3, jewelsNStones.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(3, jewelsNStones.numJewelsInStonesN("aA", "aAAbbbb"));

        assertEquals(0, jewelsNStones.numJewelsInStones("z", "ZZ"));
        assertEquals(0, jewelsNStones.numJewelsInStonesN("z", "ZZ"));
    }
}
