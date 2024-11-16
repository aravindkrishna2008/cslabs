/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - JM Ch22.6 - Hex
 * @author Sources - TODO list collaborators
 */
public class HexBoard
    extends CharMatrix
{
    private int rows;
    private int cols;

    public HexBoard(int rows, int cols)
    {
        super(rows, cols);

        this.rows = rows;
        this.cols = cols;
    }


    public boolean isBlack(int r, int c)
    {
        return this.charAt(r, c) == 'b';
    }


    public boolean isWhite(int r, int c)
    {
        return this.charAt(r, c) == 'w';

    }


    public boolean isGray(int r, int c)
    {
        return this.charAt(r, c) == 'x';
    }


    public void setBlack(int r, int c)
    {
        setCharAt(r, c, 'b');
    }


    public void setWhite(int r, int c)
    {
        setCharAt(r, c, 'w');
    }


    public void setGray(int r, int c)
    {
        setCharAt(r, c, 'x');
    }


    /**
     * Returns true if there is a contiguous chain of black stones that starts
     * in col 0 and ends in the last column of the board; otherwise returns
     * false.
     */
    public boolean blackHasWon()
    {
        for (int i = 1; i < rows + 1; i++)
        {
            if (isBlack(i - 1, 0))
            {
                areaFill(i - 1, 0);
            }
        }
        for (int k = 1; k <= rows; k++)
        {
            if (isGray(k - 1, cols - 1))
            {
                return true;
            }
        }
        return false;
    }


    /**
     * Fills the contiguous area that contains r,c with gray color. Does nothing
     * if r, c is out of bounds or is not black.
     */
    public void areaFill(int r, int c)
    {
        if (isInBounds(r, c))
        {
            if (isBlack(r, c))
            {
                setGray(r, c);
                areaFill(r - 1, c);
                areaFill(r + 1, c);
                areaFill(r, c - 1);
                areaFill(r, c + 1);
                areaFill(r - 1, c - 1);
                areaFill(r + 1, c + 1);
            }

        }
    }


    public String toString()
    {
        String s = "";

        for (int r = 0; r < numRows(); r++)
        {
            for (int c = 0; c < numCols(); c++)
            {
                if (isBlack(r, c))
                    s += 'B';
                else if (isWhite(r, c))
                    s += 'W';
                else if (isGray(r, c))
                    s += 'X';
                else
                    s += '.';
            }
            s += '\n';
        }
        return s;
    }

    // ****************************************************************


    private boolean isInBounds(int row, int col)
    {
        return 0 <= row && row < rows && 0 <= col && col < cols;
    }


    public static void main(String[] args)
    {
        HexBoard h = new HexBoard(2, 3);
        System.out.println(h.isInBounds(0, 0));
    }
}
