import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

    private MajorityElement majorityElement = new MajorityElement();

    @Test
    public void test() {
        assertEquals(3, majorityElement.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(3, majorityElement.majorityElement(new int[]{3, 3, 4}));
    }

    @Test
    public void testF() {
        assertEquals(3, majorityElement.majorityElementF(new int[]{3, 2, 3}));
        assertEquals(2, majorityElement.majorityElementF(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(3, majorityElement.majorityElementF(new int[]{3, 3, 4}));
    }

    @Test
    public void testHm() {
        assertEquals(3, majorityElement.majorityElementHm(new int[]{3, 2, 3}));
        assertEquals(2, majorityElement.majorityElementHm(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(3, majorityElement.majorityElementHm(new int[]{3, 3, 4}));
    }
}
