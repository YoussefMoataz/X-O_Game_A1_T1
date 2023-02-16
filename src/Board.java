public class Board {

    private Integer n;
    private char[][] grid;

    public Board(Integer N) {
        this.n = N;
        grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void update(Integer x, Integer y, char s) {

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

    public boolean isWinner(char s) {
        return false;
    }

    public boolean isDraw() {
        return false;
    }

}
