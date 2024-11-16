import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;

/**
 * TODO Write a one-sentence summary of your class here TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period: TODO Your Period
 * @author Assignment: BlusterCritter - GridWorld Part4 Exercise 4
 * @author Sources: TODO I received help from ...
 */
public class BlusterCritter
    extends Critter
{
    // instance variable(s)
    private int c;

    /**
     * @param c
     *            courage factor
     */
    public BlusterCritter(int c)
    {
        this.c = c;
    }


    /**
     * TODO Write your method description here <br />
     * Postcondition: The state of all actors is unchanged.
     * 
     * @return a list of actors that this critter wishes to process.
     */
    public ArrayList<Actor> getActors()
    {
        Grid<Actor> gr = getGrid();
        ArrayList<Actor> actors = new ArrayList<Actor>();

        for (int r = this.getLocation().getRow() - 2;
            r <= this.getLocation().getRow() + 2; r++)
        {
            for (int cd = this.getLocation().getCol() - 2; cd <= this
                .getLocation().getCol() + 2; cd++)
            {
                Location newLoc = new Location(r, cd);
                if (gr.isValid(newLoc))
                {
                    Actor a = gr.get(newLoc);
                    if (a != null && a != this)
                    {
                        actors.add(a);
                    }
                }
            }
        }
        return actors;
    }


    /**
     * TODO Write your method description here <br />
     * Postcondition: (1) The state of all actors in the grid other than this
     * critter and the elements of <code>actors</code> is unchanged. (2) The
     * location of this critter is unchanged.
     * 
     * @param actors
     *            the actors to be processed
     */
    public void processActors(ArrayList<Actor> actors)
    {
        int count = 0;
        for (int i = 0; i < actors.size(); i++)
        {
            if (actors.get(i) instanceof Critter)
            {
                count++;
            }
        }
        if (c > count)
        {
            lighten();
        }
        else
        {
            darken();
        }
    }


    /**
     * TODO Write your method description here
     */
    private void darken()
    {
        setColor(getColor().darker());

    }


    /**
     * TODO Write your method description here
     */
    private void lighten()
    {
        setColor(getColor().brighter().brighter().brighter());
    }
}
