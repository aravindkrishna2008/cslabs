import java.util.Iterator;
import org.w3c.dom.NodeList;

/**
 * Implements a singly-linked list.
 * 
 * @author TODO Your Name
 * @version TODO The Date
 * @author Period - TODO Your Period
 * @author Assignment - TODO Assignment Name
 * @author Sources - Maria & Gary Litvin, Arraylist Source Code, Shreyas
 */
public class SinglyLinkedList<E>
    implements Iterable<E>
{
    private ListNode<E> head;
    private int         nodeCount;

    // Constructor: creates an empty list
    public SinglyLinkedList()
    {
        head = null;
        nodeCount = 0;
    }


    /**
     * Constructor: creates a list that contains all elements from the array
     * values, in the same order
     * 
     * @param values
     *            array containing all elements for this list
     */
    public SinglyLinkedList(E[] values)
    {
        ListNode<E> tail = null;
        for (E value : values) // for each value to insert
        {
            ListNode<E> node = new ListNode<E>(value, null);
            if (head == null)
                head = node;
            else
                tail.setNext(node);
            tail = node;    // update tail
        }

        nodeCount = values.length;
    }


    /**
     * Return true if this list is empty; otherwise returns false.
     * 
     * @return true if this list is empty; otherwise returns false.
     */
    public boolean isEmpty()
    {
        return nodeCount == 0;
    }


    /**
     * Returns the number of elements in this list.
     * 
     * @return number of elements in this list.
     */
    public int size()
    {
        return nodeCount;
    }


    /**
     * Returns true if this list contains an Object equal to obj; otherwise
     * returns false.
     * 
     * @return true if this list contains an Object equal to obj
     */
    public boolean contains(Object obj)
    {
        for (Object i : this)
        {
            if (i.equals(obj))
            {
                return true;
            }
        }
        return false;
    }


    /**
     * Returns the index of the first Object equal to obj; if not found, returns
     * -1.
     * 
     * @param obj
     *            Object to find
     * @return the index of the first Object in equal to obj; if not found,
     *         returns -1.
     */
    public int indexOf(Object obj)
    {
        int count = 0;
        for (Object i : this)
        {
            if (i.equals(obj))
            {
                return count;
            }
            count++;
        }
        return -1;
    }


    /**
     * Adds obj to this collection. Returns true if successful; otherwise
     * returns false.
     * 
     * @param obj
     *            element to add to this collection
     * @return true if successful; otherwise returns false.
     */
    public boolean add(E obj)
    {

        ListNode<E> node = new ListNode(obj, null);
        if (head == null)
        {
            head = node;
            nodeCount += 1;
            return true;
        }
        else
        {
            ListNode<E> pos = head;
            while (pos.getNext() != null)
            {
                pos = pos.getNext();
            }
            pos.setNext(node);
            nodeCount++;
            return true;
        }

    }


    /**
     * Removes the first element that is equal to obj, if any. Returns true if
     * successful; otherwise returns false.
     * 
     * @param obj
     *            element to remove
     * @return true if successful; otherwise returns false.
     */
    public boolean remove(E obj)
    {
        ListNode<E> pos = head;
        if (head == null)
        {
            return false;
        }
        while (pos.getNext() != null)
        {
            if (pos.getNext().getValue().equals(obj))
            {
                pos.setNext(pos.getNext().getNext());
                nodeCount--;
                return true;
            }
            pos = pos.getNext();
        }
        return false;
    }


    /**
     * Returns the i-th element.
     * 
     * @param i
     *            element to get from the list
     * @return element at index i
     * @throws IndexOutOfBoundsException
     */
    public E get(int i)
    {
        if (i < 0)
            throw new IndexOutOfBoundsException();
        if (i >= nodeCount)
            throw new IndexOutOfBoundsException();
        int cnt = 0;
        for (Object k : this)
        {
            if (cnt == i)
                return (E)k;
            cnt++;
        }
        return null;

    }


    /**
     * Replaces the i-th element with obj and returns the old value.
     * 
     * @param i
     *            index of element to replace
     * @param obj
     *            replacement element of element at index i
     * @return old value previously located at index i
     * @throws IndexOutOfBoundsException
     */
    public E set(int i, E obj)
    {
        if (i < 0)
            throw new IndexOutOfBoundsException();
        if (i >= nodeCount)
            throw new IndexOutOfBoundsException();
        int cnt = 0;
        ListNode<E> pos = head;
        while (pos.getNext() != null)
        {
            ListNode curr = pos;
            if (cnt + 1 == i)
            {
                E temp = (E)curr.getNext().getValue();
                ListNode node = new ListNode<E>(obj, curr.getNext().getNext());
                curr.setNext(node);
                return temp;
            }
            cnt++;
        }
        return obj;
    }


    /**
     * Inserts obj to become the i-th element. Increments the size of the list
     * by one.
     * 
     * @param i
     *            insertion point in list for obj
     * @param obj
     *            element to insert into list
     * @throws IndexOutOfBoundsException
     */
    public void add(int i, E obj)
    {
        // use iterator
        if (i < 0)
            throw new IndexOutOfBoundsException();
        if (i > nodeCount)
            throw new IndexOutOfBoundsException();

        if (i == 0)
        {
            ListNode<E> newNode = new ListNode<E>(obj, head);
            head = newNode;
        }
        else
        {
            int cnt = 0;
            ListNode<E> pos = head;

            while (pos.getNext() != null)
            {
                ListNode curr = pos;

                if (cnt + 1 == i)
                {
                    ListNode node = new ListNode<E>(obj, curr.getNext());
                    curr.setNext(node);
                    nodeCount++;
                    return;
                }
                pos = pos.getNext();
                cnt++;
            }
        }
    }


    /**
     * Removes the i-th element and returns its value. Decrements the size of
     * the list by one.
     * 
     * @param i
     *            index of element to remove
     * @return element removed from this list
     */
    public E remove(int i)
    {
        if (i < 0)
            throw new IndexOutOfBoundsException();
        if (i >= nodeCount)
            throw new IndexOutOfBoundsException();

        if (i == 0)
        {
            E temp = head.getValue();
            head = head.getNext();
            nodeCount--;
            return temp;
        }

        int cnt = 0;
        ListNode<E> pos = head;
        while (pos.getNext() != null)
        {
            ListNode<E> curr = pos;
            if (cnt + 1 == i)
            {
                E temp = curr.getNext().getValue();
                curr.setNext(curr.getNext().getNext());
                nodeCount--;
                return temp;
            }
            pos = pos.getNext();
            cnt++;
        }
        return null;
    }


    /**
     * Returns a string representation of this list.
     * 
     * @return a string representation of this list.
     */
    public String toString()
    {
        String str = "[";
        for (Object i : this)
        {
            str += i + "";
        }
        return str;
    }


    /**
     * Returns an iterator for this collection.
     * 
     * @return an iterator for this collection.
     */
    public Iterator<E> iterator()
    {
        return new SinglyLinkedListIterator<E>(head);
    }
}
