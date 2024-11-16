import java.util.Stack;

/**
 * Represents a tile of the specified color (colored block).
 *
 * @author Aravind
 * @version Thu Jan 6
 * @author Sources: None
 */

public class BrowserModel
{
    private BrowserView    view;
    private Stack<Integer> backStk;
    private Stack<Integer> forwardStk;
    private int            topLine;

    /**
     * Constructur
     * 
     * @param view
     *            used to get the view
     */
    public BrowserModel(BrowserView view)
    {
        this.view = view;
        backStk = new Stack<Integer>();
        forwardStk = new Stack<Integer>();
        view.update(0);
    }


    /**
     * goes bacl
     */
    public void back()
    {
        if (hasBack())
        {
            int curr = backStk.pop();
            forwardStk.push(topLine);
            topLine = curr;
            view.update(curr);
        }

    }


    /**
     * checks if has back
     * 
     * @return something
     */
    public boolean hasBack()
    {
        return !backStk.isEmpty();
    }


    /**
     * gets forward
     */
    public void forward()
    {
        if (!forwardStk.isEmpty())
        {
            backStk.push(topLine);
            int curr = forwardStk.pop();
            topLine = curr;
            view.update(topLine);
        }
    }


    /**
     * check if has forwar
     * 
     * @return boolean
     */
    public boolean hasForward()
    {
        return !forwardStk.isEmpty();
    }


    /**
     * goes home
     */
    public void home()
    {
        backStk.push(topLine);
        forwardStk.clear();
        topLine = 0;
        view.update(topLine);

    }


    /**
     * @param n
     *            follows the link
     */
    public void followLink(int n)
    {
        // System.out.println(n);
        backStk.push(topLine);
        forwardStk.clear();
        topLine = n;
        view.update(n);
    }


    // The following are for test purposes only
    /**
     * gets backStk
     * 
     * @return backStk
     */
    public Stack<Integer> getBackStk()
    {
        return backStk;
    }


    /**
     * gets forward stk
     * 
     * @return forwardStk
     */
    public Stack<Integer> getForwardStk()
    {
        return forwardStk;
    }


    /**
     * gets topline
     * 
     * @return topLine
     */
    public int getTopLine()
    {
        return topLine;
    }
}
