// Implements the list of messages for teletext

import java.awt.Graphics;

public class TeletextList
{
    private ListNode2<String> heading, topNode;

    /**
     * Creates a circular list of headlines. First creates a circular list with
     * one node, "Today's headlines:". Saves a reference to that node in
     * heading. Adds a node holding an empty string before heading and another
     * node holding an empty string after heading. Appends all the strings from
     * headlines to the list, after the blank line that follows heading,
     * preserving their order. Sets topNode equal to heading.
     * 
     * @param headlines
     *            Strings to add to circular list
     */
    public TeletextList(String[] headlines)
    {
        heading = new ListNode2<String>("Today's headlines:", null, null);
        heading.setNext(new ListNode2<String>("", heading, null));
        heading.setPrevious(new ListNode2<String>("", null, heading));
        ListNode2<String> curr = heading.getNext();
        for (int i = 0; i < headlines.length; i++)
        {
            curr.setNext(new ListNode2<String>(headlines[i], curr, null));
            curr = curr.getNext();
        }
        curr.setNext(heading.getPrevious());
        heading.getPrevious().setPrevious(curr);
        topNode = heading.getPrevious();

    }


    /**
     * Inserts a node with msg into the headlines list after the blank /line
     * that follows heading.
     * 
     * @param msg
     *            String to add to headlines list
     */
    public void insert(String msg)
    {
        ListNode2<String> value = heading.getNext().getNext();
        heading.getNext().setNext(new ListNode2<String>(msg, heading.getNext(), value));
    }


    /**
     * Deletes the node that follows topNode from the headlines list, unless
     * that node happens to be heading or the node before or after heading that
     * holds a blank line.
     */
    public void delete() {
        if (topNode.getNext() != heading && topNode.getNext() != heading.getNext() && topNode.getNext() != heading.getPrevious()) {
            topNode.getNext().getNext().setPrevious(topNode);
            topNode.setNext(topNode.getNext().getNext());
        }
    }


    /**
     * Scrolls up the headlines list, advancing topNode to the next node.
     */
    public void scrollUp()
    {
        topNode = topNode.getNext();
    }


    /*
     * Adds a new node with msg to the headlines list before a given node.
     * Returns a referenece to the added node.
     */
    private ListNode2<String> addBefore(ListNode2<String> node, String msg)
    {
        ListNode2<String> newNode = new ListNode2<String>(msg, node.getPrevious(), node);
        node.getPrevious().setNext(newNode);
        node.setPrevious(newNode);
        return newNode;
    }


    /*
     * Adds a new node with msg to the headlines list after a given node.
     * Returns a referenece to the added node.
     */
    private ListNode2<String> addAfter(ListNode2<String> node, String msg)
    {
        ListNode2<String> newNode = new ListNode2<String>(msg, null, null);
        newNode.setPrevious(node);
        newNode.setNext(node.getNext());
        node.getNext().setPrevious(newNode);
        node.setNext(newNode);
        return newNode;
    }


    /*
     * Removes a given node from the list.
     */
    private void remove(ListNode2<String> node)
    {
        node.getPrevious().setNext(node.getNext());
        node.getNext().setPrevious(node.getPrevious());
    }


    /*
     * Draws nLines headlines in g, starting with topNode at x, y and
     * incrementing y by lineHeight after each headline.
     */
    public void draw(Graphics g, int x, int y, int lineHeight, int nLines)
    {
        ListNode2<String> node = topNode;
        for (int k = 1; k <= nLines; k++)
        {
            g.drawString(node.getValue(), x, y);
            y += lineHeight;
            node = node.getNext();
        }
    }


    /**
     * Returns a string representation of this TeletextList.
     * 
     * @return a string representation of this TeletextList.
     */
    public String toString()
    {
        String str = getClass().getName() + "[";
        String separator = "";

        for (ListNode2<String> node = heading; node.getNext() != heading; node = node.getNext())
        {
            str += (separator + node.getValue());
            separator = ", ";
        }

        return str + "]";
    }


    public static void main(String[] args)
    {
        String[] headlines = { "1", "2", "3", "4", };
        TeletextList a = new TeletextList(headlines);
        a.delete();
        System.out.println(a);
    }
}
