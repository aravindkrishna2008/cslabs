import java.util.*;

/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - TODO Assignment Name
 * @author Sources - TODO list collaborators
 */
public class MailServer
    extends LinkedList<Message>
{
    private Set<Actor> actors;

    public MailServer()
    {
        actors = new TreeSet<Actor>();
    }


    public void signUp(Actor actor)
    {
        actors.add(actor);
    }


    public void dispatch(Message m)
    {
        for (Actor i : actors)
        {
            i.receive(m);
        }
    }


    // for testing purposes only
    protected Set<Actor> getActors()
    {
        return actors;
    }
}
