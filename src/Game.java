public class Game {

    private Integer turn = 0;
    private final TicTacToeBoard board;
    private final Player[] players;

    public Game(TicTacToeBoard B, Player[] Players) {
        this.board = B;
        this.players = Players;
    }

    public void playGame() {

        Move currentMove;
        Player currentPlayer;
        Player otherPlayer;

        while (true) {

            if (!board.isDraw()) {

                board.displayBoard();

                currentPlayer = players[turn];
                otherPlayer = players[1 - turn];

                if (!board.isWinner()) {

                    System.out.println(currentPlayer.getName() + " plays :");
                    currentMove = currentPlayer.getMove();

                    // end the game at (-1, -1) input
                    if (currentMove.getX() == -1 && currentMove.getY() == -1) {
                        System.out.println("Thanks for playing !");
                        break;
                    }

                    // change player iff valid move is made
                    if (board.update(currentMove.getX(), currentMove.getY(), currentPlayer.getSymbol())) {
                        turn = 1 - turn;
                    }


                } else {
                    System.out.println(otherPlayer.getName() + " wins !");

                    break;
                }

            }
            else
            {
                break;
            }

        }

    }

}
