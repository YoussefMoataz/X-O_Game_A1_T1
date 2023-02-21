public class TicTacToeBoard extends Board {

    public TicTacToeBoard(Integer N) {
        super(N);
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

        // check bottom right diagonal - done
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

        // check bottom left diagonal - done
        won = true;
        for (int i = 0; i < n; i++) {
            if (grid[n - i - 1][i] != s) {
                won = false;
                break;
            }
        }
        return won;
    }

    public boolean isDraw() {

        if (moves == n * n) {
            return !isWinner(MainUtils.X) && !isWinner(MainUtils.O);
        }
        return false;
    }

}
