import java.util.Scanner;

public class Main {

    public static MainUtils utils;
    public static Scanner scanner;

    public static void main(String[] args) {

        utils = new MainUtils();
        scanner = new Scanner(System.in);

        // start writing here
        Board b = new Board(3);
        b.displayBoard();

    }
}