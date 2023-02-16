import java.util.Scanner;

public class Player {

    private String name;
    private char symbol;
    private Integer score;

    public Player(String Name, char Symbol) {
        this.name = Name;
        this.symbol = Symbol;
    }

    public Move getMove(Integer BoardSize) {

        Integer x = -1;
        Integer y = -1;

        Scanner moveScanner = new Scanner(System.in);

        while (x < 0 && x > BoardSize - 1 && y < 0 && y > BoardSize - 1) {
            System.out.println("Enter x-position");
            x = moveScanner.nextInt();
            System.out.println("Enter y-position");
            y = moveScanner.nextInt();
        }

        return new Move(x, y);
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public Integer getScore() {
        return score;
    }

}
