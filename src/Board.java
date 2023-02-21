abstract class Board {

    protected Integer n;
    protected int moves = 0;
    protected char[][] grid;

    public Board(Integer N) {

        this.n = N;
        grid = new char[n][n];

        clearBoard();

    }

    public boolean update(Integer x, Integer y, char s) {

        // check move not made before
        if (grid[x][y] == MainUtils.DASH) {
            grid[x][y] = s;
            moves++;
            return true;
        }
        return false;
    }

    public void displayBoard() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }

    }

    public void clearBoard() {

        // resets the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = MainUtils.DASH;
            }
        }

    }

    public abstract boolean isWinner(char s);

    public abstract boolean isDraw();

}
