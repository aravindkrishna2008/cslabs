import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * Runs Spiral Bug
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author Aravindkrishna Arivudainambi
 * @version 08/29/23
 * @author Period - 1
 * @author Assignment - GridWorld Part 2, Exercise 2 - SpiralBugRunner
 * @author Sources -N/A
 */
import java.awt.Color;

public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        UnboundedGrid grid = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld(grid);

        SpiralBug alice = new SpiralBug(6);
        alice.setColor(Color.ORANGE);
        SpiralBug bob = new SpiralBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
