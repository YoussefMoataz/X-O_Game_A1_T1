import java.util.Scanner;

public class Player {
    private String Name;
    private char Symbol;
    //constructor
    public Player(String name,char symbol){
        Name = name;
        Symbol = symbol;
    }
    private int getX(){
        System.out.printf("enter x");
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        return x;
    }
    private int gety(){
        System.out.printf("enter y");
        Scanner sc =new Scanner(System.in);
        int y =sc.nextInt();
        return y;
    }
    public String getName(){
        return Name;
    }
    public char getSymbol(){
        return Symbol;
    }

    public Move getMove(){

        int x = getX();
        int y = gety();

        return new Move(x, y);

    }
}
