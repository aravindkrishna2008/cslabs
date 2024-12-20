import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains random bugs. 
 */
public class RandomBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        RandomBug alice = new RandomBug();
        alice.setColor(Color.ORANGE);
        RandomBug bob = new RandomBug();
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
