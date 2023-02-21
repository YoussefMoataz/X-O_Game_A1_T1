import java.util.Scanner;

public class Player {

    private final String name;
    private final char symbol;

    public Player(String Name, char Symbol) {
        this.name = Name;
        this.symbol = Symbol;
    }

    public Move getMove() {

        Integer x = -1;
        Integer y = -1;

        Scanner moveScanner = new Scanner(System.in);

        System.out.println("Enter x-position");
        x = moveScanner.nextInt();

        System.out.println("Enter y-position");
        y = moveScanner.nextInt();

        return new Move(x, y);
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

}
