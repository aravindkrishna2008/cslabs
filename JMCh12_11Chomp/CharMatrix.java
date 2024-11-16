import java.util.Arrays;

/**
 * Implements a 2-D array of characters.
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - JMCh12_11Chomp
 * @author Sources - TODO list collaborators
 */
public class CharMatrix
{
    public final char SPACE = ' ';
    private char[][]  grid;
    private int       rows  = 0;
    private int       cols  = 0;

    /**
     * Constructor: creates a grid with dimensions rows, cols and fills it with
     * spaces.
     * 
     * @param rows
     *            number of rows
     * @param cols
     *            number of columns
     */
    public CharMatrix(int rows, int cols)
    {
        grid = new char[rows][cols];
        this.rows = rows;
        this.cols = cols;

        for (int r = 0; r < grid.length; r++)
        {
            for (int c = 0; c < grid[0].length; c++)
            {
                grid[r][c] = SPACE;
                // System.out.println(grid[r][c]);
            }
        }

    }


    /**
     * Constructor: creates a grid with dimensions rows , cols and fills it with
     * the fill character.
     * 
     * @param rows
     *            number of rows
     * @param cols
     *            number of columns
     * @param fill
     *            character for fil
     */
    public CharMatrix(int rows, int cols, char fill)
    {
        grid = new char[rows][cols];
        this.rows = rows;
        this.cols = cols;

        for (int r = 0; r < grid.length; r++)
        {
            for (int c = 0; c < grid[0].length; c++)
            {
                grid[r][c] = fill;
                // System.out.println(grid[r][c]);
            }
        }
    }


    /**
     * Returns the number of rows in grid.
     * 
     * @return the number of rows in grid
     */
    public int numRows()
    {
        return rows;
    }


    /**
     * Returns the number of columns in grid.
     * 
     * @return the number of columns in grid
     */
    public int numCols()
    {
        return cols;
    }


    /**
     * Returns the character at row, col location.
     * 
     * @param row
     *            row
     * @param col
     *            column
     * @return character at row, col location
     */
    public char charAt(int row, int col)
    {
        for (int r = 0; r < grid.length; r++)
        {
            for (int c = 0; c < grid[0].length; c++)
            {
                if (r == row && c == col)
                {
                    System.out.println(grid[r][c]);
                    return grid[r][c];
                }
            }
        }
        return 'd';
    }


    /**
     * Sets the character at row, col location to ch.
     * 
     * @param row
     *            row
     * @param col
     *            column
     * @param ch
     *            character
     */
    public void setCharAt(int row, int col, char ch)
    {
        for (int r = 0; r < grid.length; r++)
        {
            for (int c = 0; c < grid[0].length; c++)
            {
                if (r == row && c == col)
                {
                    grid[r][c] = ch;
                    return;
                }
            }
        }
    }


    /**
     * Returns true if the character at row, col is a space, false otherwise.
     * 
     * @param row
     *            row to check
     * @param col
     *            column to check
     * @return true if the character at row, col is a space, false otherwise.
     */
    public boolean isEmpty(int row, int col)
    {
        return charAt(row, col) == ' ';
    }


    /**
     * Fills the given rectangle with fill characters.
     * 
     * @param row0
     *            the upper left corner row of the rectangle
     * @param col0
     *            the upper left corner column of the rectangle
     * @param row1
     *            the lower right corner row of the rectangle
     * @param col1
     *            the lower right corner column of the rectangle
     * @param fill
     *            character used to fill the rectangle
     */
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        for (int r = row0; r <= row1; r++)
        {
            for (int c = col0; c <= col1; c++)
            {
                setCharAt(r, c, fill);
            }
        }
    }


    /**
     * Fills the given rectangle with SPACE characters.
     * 
     * @param row0
     *            upper left corner row of the rectangle
     * @param col0
     *            upper left corner column of the rectangle
     * @param row1
     *            lower right corner row of the rectangle
     * @param col1
     *            lower right corner column of the rectangle
     */
    public void clearRect(int row0, int col0, int row1, int col1)
    {
        for (int r = row0; r <= row1; r++)
        {
            for (int c = col0; c <= col1; c++)
            {
                setCharAt(r, c, ' ');
            }
        }
    }


    /**
     * Returns the count of all non-space characters in row
     * 
     * @param row
     *            row in which to count non-space characters
     * @return count of all non-space characters
     */
    public int countInRow(int row)
    {

        int count = 0;
        for (int c = 0; c < grid.length; c++)
        {
            if (charAt(row, c) != ' ')
            {
                count++;
            }
        }
        return count;
    }


    /**
     * Returns the count of all non-space characters in col
     * 
     * @param col
     *            column in which to count non-space characters
     * @return count of all non-space characters
     */
    public int countInCol(int col)
    {
        int count = 0;
        for (int c = 0; c < grid[0].length; c++)
        {
            if (charAt(c, col) != ' ')
            {
                count++;
            }
        }
        return count;
    }


    /**
     * *** For Test Purposes Only *** Returns the 2D char array in this class.
     * 
     * @return this grid
     */
    public char[][] getGrid()
    {
        return grid;
    }


    public static void main(String[] args)
    {
        CharMatrix grid = new CharMatrix(2, 2, 'f');
        System.out.println(grid.countInCol(1));

    }
}
