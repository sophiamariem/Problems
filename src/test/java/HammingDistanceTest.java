import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

    private HammingDistance hammingDistance = new HammingDistance();

    @Test
    public void test() {
        assertEquals(2, hammingDistance.hammingDistance(1, 4));

        assertEquals(2, hammingDistance.hammingDistanceJMethod(1, 4));
    }

}
