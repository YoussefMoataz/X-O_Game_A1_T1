public class Board {

    private Integer n;
    private char[][] grid;

    public Board(Integer N) {

        this.n = N;
        grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = MainUtils.DASH;
            }
        }

    }

    public void update(Integer x, Integer y, char s) {

        if (grid[x][y] == MainUtils.DASH) {
            grid[x][y] = s;
        }

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

        boolean won = true;

        // check rows - done
        for (int i = 0; i < n; i++) {
            won = true;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != s) {
                    won = false;
                    break;
                }
            }
            if (won) {
                return true;
            }
        }

        // check columns - done
        for (int i = 0; i < n; i++) {
            won = true;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] != s) {
                    won = false;
                    break;
                }
            }
            if (won) {
                return true;
            }

        }

        // check bottom right diagonal
        won = true;
        for (int i = 0; i < n; i++) {
            if (grid[i][i] != s) {
                won = false;
                break;
            }
        }
        if (won) {
            return true;
        }

        // check bottom left diagonal
        won = true;
        for (int i = 0; i < n; i++) {
            if (grid[n - i - 1][i] != s) {
                won = false;
                break;
            }
        }
        if (won) {
            return true;
        }

        return false;
    }

    public boolean isDraw() {
        return false;
    }

}
