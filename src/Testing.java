import java.util.Scanner;

public class Testing {

    // Youssef
    public void test1() {
        TicTacToeBoard b = new TicTacToeBoard(3);

        b.update(2, 0, MainUtils.X);
        b.update(2, 1, MainUtils.X);
        b.update(2, 2, MainUtils.X);

        b.displayBoard();

        System.out.println(b.isWinner());
    }

    // Youssef
    public void test2() {

        TicTacToeBoard b = new TicTacToeBoard(3);

        b.update(0, 2, MainUtils.O);
        b.update(1, 2, MainUtils.O);
        b.update(2, 2, MainUtils.O);

        b.displayBoard();

        System.out.println(b.isWinner());

    }


    public void test3() {

        TicTacToeBoard b = new TicTacToeBoard(3);

        b.update(0, 0, MainUtils.X);
        b.update(1, 1, MainUtils.X);
        b.update(2, 2, MainUtils.X);

        b.displayBoard();

        System.out.println(b.isWinner());

    }

    public void test4() {

        TicTacToeBoard b = new TicTacToeBoard(3);

        b.update(0, 2, MainUtils.O);
        b.update(1, 1, MainUtils.O);
        b.update(2, 0, MainUtils.O);

        b.displayBoard();

        System.out.println(b.isWinner());

    }

    public void test5() {

        TicTacToeBoard b = new TicTacToeBoard(3);

        b.update(0, 2, MainUtils.O);
        b.update(1, 1, MainUtils.O);
        b.update(2, 0, MainUtils.O);

        b.displayBoard();

        if (b.update(1, 2, MainUtils.X)) {
            System.out.println("Done");
            b.displayBoard();
        }

        if (!b.update(1, 1, MainUtils.X)) {
            System.out.println("Failed");
            b.displayBoard();
        }

    }

    public void test6() {

        TicTacToeBoard b = new TicTacToeBoard(3);

        b.update(0, 0, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(0, 1, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(0, 2, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1, 0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(1, 1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1, 2, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2, 0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2, 1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(2, 2, MainUtils.O);
        System.out.println(b.isDraw());

        b.displayBoard();

    }

    public void test7() {

        TicTacToeBoard b = new TicTacToeBoard(3);

        b.update(0, 0, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(0, 1, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(0, 2, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1, 0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(1, 1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1, 2, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2, 0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2, 1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(2, 2, MainUtils.X);
        System.out.println(b.isDraw());

        b.displayBoard();

    }

    public void test8() {

        TicTacToeBoard b = new TicTacToeBoard(3);

        b.update(0, 0, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(0, 1, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(0, 2, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1, 0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(1, 1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(1, 2, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2, 0, MainUtils.O);
        System.out.println(b.isDraw());
        b.update(2, 1, MainUtils.X);
        System.out.println(b.isDraw());
        b.update(2, 2, MainUtils.X);
        System.out.println(b.isDraw());

        b.displayBoard();
        b.clearBoard();
        b.displayBoard();

    }

    public void test9() {

        Player p1 = new Player("Youssef", MainUtils.X);
        Player p2 = new Player("Other Player", MainUtils.O);

        TicTacToeBoard board = new TicTacToeBoard(3);

        Player[] players = {p1, p2};

        Game game = new Game(board, players);
        game.playGame();

    }

    public void test10() {

        Scanner namesScanner = new Scanner(System.in);

        // get players' data at runtime
        System.out.println("Enter first player's name :");
        Player p1 = new Player(namesScanner.nextLine(), MainUtils.X);
        System.out.println("Enter second player's name :");
        Player p2 = new Player(namesScanner.nextLine(), MainUtils.O);

        TicTacToeBoard board = new TicTacToeBoard(3);

        Player[] players = {p1, p2};

        Game game = new Game(board, players);
        game.playGame();

    }

}
