import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditDistanceTest {

    private EditDistance editDistance = new EditDistance();

    @Test
    public void test() {
        assertEquals(3, editDistance.minDistance("horse", "ros"));
        assertEquals(5, editDistance.minDistance("intention", "execution"));
    }
}
