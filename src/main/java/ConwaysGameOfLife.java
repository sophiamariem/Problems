// Initially, there is a grid with some cells which may be alive or dead.
//  Our task to generate the next generation of cells based on the following rules:
//
//        Any live cell with fewer than two live neighbors dies, as if caused by under population.
//        Any live cell with two or three live neighbors lives on to the next generation.
//        Any live cell with more than three live neighbors dies, as if by overpopulation.
//        Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
public class ConwaysGameOfLife {

    public int[][] gameOfLife(int[][] board) {
        if (board == null || board.length == 0) {
            return new int[][]{};
        }

        int rowLength = board.length;
        int colLength = board[0].length;

        int newBoard[][] = new int[rowLength][colLength];

        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                int aliveNeighbors = countAliveNeighbors(board, row, col);

                if (aliveNeighbors < 2 || aliveNeighbors > 3) {
                    newBoard[row][col] = 0;
                } else if (aliveNeighbors == 3) {
                    newBoard[row][col] = 1;
                } else {
                    newBoard[row][col] = board[row][col];
                }
            }
        }

        for(int[] r : newBoard) {
            for (int i : r) {
                System.out.print(i);
            }
            System.out.println();
        }

        return newBoard;
    }

    private int countAliveNeighbors(int[][] board, int row, int col) {
        int lives = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (row + i >= 0 && col + j >= 0 && row + i < board.length && col + j < board[0].length) {
                    lives += board[row + i][col + j];
                }
            }
        }
        lives -= board[row][col];
        return lives;
    }
}
