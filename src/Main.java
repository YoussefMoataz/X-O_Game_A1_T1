import java.util.Scanner;

public class Main {

    public static MainUtils utils;
    public static Testing testing;
    public static Scanner scanner;

    public static void main(String[] args) {

        utils = new MainUtils();
        testing = new Testing();
        scanner = new Scanner(System.in);

        // start writing here
//        testing.test1();
//        testing.test2();
//        testing.test3();
//        testing.test4();
//        testing.test5();
//        testing.test6();
//        testing.test7();
//        testing.test8();
//        testing.test9();
//        testing.test10();

        Scanner namesScanner = new Scanner(System.in);

        // get players' data at runtime
        utils.print("Enter first player's name :");
        Player p1 = new Player(namesScanner.nextLine(), MainUtils.X);
        utils.print("Enter second player's name :");
        Player p2 = new Player(namesScanner.nextLine(), MainUtils.O);

        TicTacToeBoard board = new TicTacToeBoard(3);

        Player[] players = {p1, p2};

        Game game = new Game(board, players);
        game.playGame();

    }

}