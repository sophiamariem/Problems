import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DistributeCandiesToPeopleTest {

    private DistributeCandiesToPeople distributeCandiesToPeople = new DistributeCandiesToPeople();

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 2, 3, 1}, distributeCandiesToPeople.distributeCandies(7, 4));
        assertArrayEquals(new int[]{5, 2, 3}, distributeCandiesToPeople.distributeCandies(10, 3));
    }
}
