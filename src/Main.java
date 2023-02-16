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
        testing.test1();
        testing.test2();
        testing.test3();
        testing.test4();

    }
}