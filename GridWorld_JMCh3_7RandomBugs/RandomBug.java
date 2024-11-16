import info.gridworld.actor.Bug;
import java.awt.Color;

/**
 * Runs Random Bug. Makes it turn in random direction once it hits an edge
 * 
 * @author Aravindkrishna Arivudainambi
 * @version 08/29/23
 * @author Period - 1
 * @author Assignment - GridWorld Part 2, Exercise 2 - RandomBug
 * @author Sources -N/A
 */
public class RandomBug
    extends Bug
{
    public RandomBug()
    {
        setColor(Color.BLUE);
    }


    public RandomBug(Color bugColor)
    {
        setColor(bugColor);
    }


    public void turn(int angle)
    {
        setDirection(getDirection() + angle); // Or: setDirection(getDirection()
                                              // + 180);
    }


    // Overrides Bug's act method
    public void act()

    {
        int angle = 45 * (int)(Math.random() * 8);
        if (canMove())
            move();
        else
            turn(angle);
    }
}
