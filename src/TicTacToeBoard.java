public class TicTacToeBoard extends Board
{
    private int count = 0;
    public TicTacToeBoard(int size)
    {
        this.size = size;
        this.grid = new char[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                grid[i][j] = ' ';   // set to empty state value
            }
        }
    }

    public void clearBoard()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                grid[i][j] = ' ';
            }
        }
    }
    public void displayBoard()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (j != size - 1)
                {
                    System.out.print(grid[i][j] + " | ");
                }
                else
                {
                    System.out.print(grid[i][j]);
                }
            }
            System.out.println();
        }
    }

    public boolean update(int x, int y, char symbol)
    {
        if(grid[x][y] == ' ')       // empty state value
        {
            grid[x][y] = symbol;
            count++;
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isWinner(char symbol)
    {
        boolean win = false;
        // horizontal check
        for(int i = 0; i < size; i++)
        {
            win = (grid[i][0]) == (grid[i][1]) && grid[i][0] == grid[i][2] && grid[i][0] == symbol;
            if(win){break;}
        }
        if(win){return win;}
        // vertical check
        for (int i = 0; i < size; i++)
        {
            win = (grid[0][i] == grid[1][i]) && ((grid[0][i] == grid[2][i]) && (grid[0][i] == symbol));
            if(win){break;}
        }
        if(win){return win;}

        // diagonal check

        win = (grid[0][0]) == (grid[1][1]) && ((grid[0][0] == grid[2][2]) && (grid[0][0] == symbol));
        if(win){return win;}

        win = (grid[0][2]) == (grid[1][1]) && ((grid[0][2] == grid[2][0]) && (grid[0][2] == symbol));

        return win;
    }

    public boolean isDraw()
    {
        if(count == 9)
        {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }
}