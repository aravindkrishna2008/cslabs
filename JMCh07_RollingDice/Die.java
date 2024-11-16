
/**
 * Simulates a six-sided die.
 *
 * @author TODO your Name
 * @version TODO date
 * @author Period: TODO your period
 * @author Assignment: JMCh07_RollingDice
 * @author Sources: TODO collaborators
 */

import java.util.Random;

public class Die
{
    private int numDots;

    /**
     * Sets numDots to a random integer from 1 to 6
     */
    public void roll()
    {
        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);
        numDots = int_random + 1;

    }


    /**
     * Returns the value of the most recent roll.
     * 
     * @return numDots
     */
    public int getNumDots()
    {
        return numDots;
    }
}
