import java.util.*;

/**
 * Implements a priority queue based on a min-heap.
 * 
 * @author TODO Your Name
 * @version Date
 * @author Period - TODO Your Period
 * @author Assignment - TODO Assignment Name
 * @author Sources - TODO list collaborators
 */
public class HeapPriorityQueue
{
    private static final int         DFLT_CAPACITY = 101;
    private Object[]                 items;
    private int                      numItems;
    private final Comparator<Object> comparator;

    public HeapPriorityQueue()
    {
        this(DFLT_CAPACITY, null);
    }


    public HeapPriorityQueue(Comparator<Object> c)
    {
        this(DFLT_CAPACITY, c);
    }


    public HeapPriorityQueue(int initialCapacity)
    {
        this(initialCapacity, null);
    }


    public HeapPriorityQueue(int initialCapacity, Comparator<Object> c)
    {
        items = new Object[initialCapacity + 1];
        comparator = c;
    }


    /**
     * Returns true if this priority queue is empty; otherwise returns false.
     */
    public boolean isEmpty()
    {
        return numItems == 0;
    }


    /**
     * Returns the highest priority element without removing it from this
     * priority queue.
     */
    public Object peek()
    {
        if (numItems == 0)
        {
            throw new NoSuchElementException();
        }
        return items[1];
    }


    /**
     * Adds obj to this priority queue; returns true.
     */
    public boolean add(Object obj)
    {
        numItems++;
        if (numItems >= items.length)  // items[0] is not used
            growCapacity();
        items[numItems] = obj;
        reheapUp();
        return true;
    }


    /**
     * Removes and returns the highest priority item.
     */
    public Object remove()
    {
        if (numItems == 0)
        {
            throw new NoSuchElementException();
        }

        Object minObject = items[1];
        items[1] = items[numItems];
        numItems--;
        reheapDown();
        // reheapUp();
        return minObject;
    }

    // **************************************************************************


    private boolean lessThan(Object obj1, Object obj2)
    {
        if (comparator != null)
            return comparator.compare(obj1, obj2) < 0;
        else
            return ((Comparable)obj1).compareTo(obj2) < 0;
    }


    public void reheapDown()
    {
        int index = 1;
        while (index * 2 <= numItems)
        {
            int smallerChild = index * 2;
            if (smallerChild + 1 <= numItems
                && lessThan(items[smallerChild + 1], items[smallerChild]))
            {
                smallerChild = smallerChild + 1;
            }

            if (lessThan(items[smallerChild], items[index]))
            {
                swap(index, smallerChild);
                index = smallerChild;
            }
            else
            {
                break;
            }
        }
    }


    public void reheapUp()
    {
        int index = numItems;
        while (index > 1 && lessThan(items[index], items[index / 2]))
        {
            swap(index, index / 2);
            index = index / 2;
        }
}
    }


    private void swap(int i, int j)
    {
        Object temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }


    private void growCapacity()
    {
        Object[] tempItems = new Object[2 * items.length - 1];
        System.arraycopy(items, 0, tempItems, 0, items.length);
        items = tempItems;
    }


    public void sort()
    {
        Arrays.sort(items);
    }


    /**
     * returns the String containing all the elements in level order
     * 
     * @return the String containing all the elements in level order
     */
    public String toString()
    {
        String a = "";
        // System.out.println(items.length);
        for (int i = 1; i <= numItems; i++)
        {
            a += items[i].toString() + " ";
        }
        return a; // Fix This!!!
    }


    public static void main(String[] args)
    {

        HeapPriorityQueue myHeapPQ = new HeapPriorityQueue();
        myHeapPQ.add(15);
        myHeapPQ.add(27);
        myHeapPQ.add(-9);
        myHeapPQ.add(12);
        myHeapPQ.add(18);
        myHeapPQ.add(19);
        // System.out.println(myHeapPQ.remove());
        // myHeapPQ.remove();
        // myHeapPQ.remove();
        // print
        System.out.println(myHeapPQ);
    }
}
