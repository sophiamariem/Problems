import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MatrixZeroesTest {

    private MatrixZeroes matrixZeroes = new MatrixZeroes();

    @Test
    public void testForTwoRowsDfs() {
        int[][] input = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

        assertArrayEquals(expected, matrixZeroes.setZeroesDfs(input));
    }

    @Test
    public void testForThreeRowsDfs() {
        int[][] input = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};

        assertArrayEquals(expected, matrixZeroes.setZeroesDfs(input));
    }

    @Test
    public void testForZeroesFirstRowDfs() {
        int[][] input = new int[][]{{0, 0, 0}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        assertArrayEquals(expected, matrixZeroes.setZeroesDfs(input));
    }

    @Test
    public void testForTwoRows() {
        int[][] input = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

        assertArrayEquals(expected, matrixZeroes.setZeroes(input));
    }

    @Test
    public void testForThreeRows() {
        int[][] input = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};

        assertArrayEquals(expected, matrixZeroes.setZeroes(input));
    }

    @Test
    public void testForZeroesFirstRow() {
        int[][] input = new int[][]{{0, 0, 0}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        assertArrayEquals(expected, matrixZeroes.setZeroes(input));
    }

    @Test
    public void testForTwoRowsForRowCols() {
        int[][] input = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

        assertArrayEquals(expected, matrixZeroes.setZeroesForRowColumn(input));
    }

    @Test
    public void testForThreeRowsForRowCols() {
        int[][] input = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};

        assertArrayEquals(expected, matrixZeroes.setZeroesForRowColumn(input));
    }

    @Test
    public void testForZeroesFirstRowForRowCols() {
        int[][] input = new int[][]{{0, 0, 0}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        assertArrayEquals(expected, matrixZeroes.setZeroesForRowColumn(input));
    }

}
