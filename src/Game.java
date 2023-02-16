public class Game {

    private Integer turn = 0;
    private Board board;
    private Player[] players;

    public Game(Board B, Player[] Players) {
        this.board = B;
        this.players = Players;
    }

    public void playGame() {

        Move currentMove;

        while (true) {

            if (!board.isDraw()) {

                board.displayBoard();

                if (!board.isWinner(players[1 - turn].getSymbol())) {

                    currentMove = players[turn].getMove(board.getBoardSize());

                    if (board.update(currentMove.getX(), currentMove.getY(), players[turn].getSymbol())) {
                        turn = 1 - turn;
                    }


                } else {
                    System.out.println(players[1 - turn].getName() + " wins !");
                    break;
                }

            }

        }

    }

}
