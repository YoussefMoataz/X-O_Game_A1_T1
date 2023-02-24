abstract class Board
{
    protected int size;
    protected char grid[][];

    public abstract boolean update(int x, int y, char symbol);
    public abstract void displayBoard();
    public abstract void clearBoard();
    public abstract boolean isWinner(char symbol);
    public abstract boolean isDraw();
}
