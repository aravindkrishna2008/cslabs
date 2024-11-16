import info.gridworld.actor.Bug;
import java.awt.Color;

/**
 * Creates a bug that moves in a circle given one side length
 * 
 * 
 * @author Aravindkrishna Arivudainambi
 * @version 08/29/23
 * @author Period - 1
 * @author Assignment - GridWorld Part 2, Exercise 2 - CircleBug
 * @author Sources -N/A

 */

public class CircleBug
    extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a circle bug that traces a Circle of a given side length
     * 
     * @param length
     *            the side length
     */
    public CircleBug(int length)
    {
        steps = 0;
        sideLength = length;
    }


    /**
     * Moves to the next location of the circle.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }
}
