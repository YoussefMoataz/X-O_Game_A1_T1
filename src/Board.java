public class Board {

    private Integer n;
    private char [][] grid;

    public Board(Integer N){
        this.n = N;
        grid = new char[n][n];
    }

    public void update(Integer x, Integer y, char s){

    }

    public void displayBoard(){

    }

    public boolean isWinner(char s){
        return false;
    }

    public boolean isDraw(){
        return false;
    }

}
