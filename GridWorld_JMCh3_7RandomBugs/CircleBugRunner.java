import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * Runner for circle bug
 * 
 * @author Aravindkrishna Arivudainambi
 * @version 08/29/23
 * @author Period - 1
 * @author Assignment - GridWorld Part 2, Exercise 2 - SpiralBugRunner
 * @author Sources -N/A
 */
public class CircleBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        CircleBug alice = new CircleBug(2);
        alice.setColor(Color.ORANGE);
        world.add(new Location(5, 3), alice);
        world.show();
    }
}