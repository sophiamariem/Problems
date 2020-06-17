import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SurroundedRegionsTest {

    private SurroundedRegions surroundedRegions = new SurroundedRegions();

    @Test
    public void test() {
        char[][] input = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        char[][] output = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        surroundedRegions.solve(input);
        assertArrayEquals(output, input);
    }
}
