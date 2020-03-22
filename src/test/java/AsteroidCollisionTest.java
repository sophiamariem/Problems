import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AsteroidCollisionTest {

    private AsteroidCollision asteroidCollision = new AsteroidCollision();

    @Test
    public void test() {
        assertArrayEquals(new int[]{5, 10}, asteroidCollision.asteroidCollision(new int[]{5, 10, -5}));
        assertArrayEquals(new int[]{}, asteroidCollision.asteroidCollision(new int[]{8, -8}));
        assertArrayEquals(new int[]{10}, asteroidCollision.asteroidCollision(new int[]{10, 2, -5}));
        assertArrayEquals(new int[]{-2, -1, 1, 2}, asteroidCollision.asteroidCollision(new int[]{-2, -1, 1, 2}));
        assertArrayEquals(new int[]{-3, -2, -1, 1, 2}, asteroidCollision.asteroidCollision(new int[]{-3, -2, -1, 1, 2}));

    }
}
