public class Player {

    private String name;
    private char symbol;
    private Integer score;

    public Player(String Name, char Symbol) {
        this.name = Name;
        this.symbol = Symbol;
    }

    public void getMove(int x, int y) {

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
