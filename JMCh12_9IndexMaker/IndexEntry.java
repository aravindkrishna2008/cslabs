import java.util.ArrayList;

/**
 * Java Methods Chapter 12 Exercises 1-9, 11-14, 17, 18, 20, 26 & 27
 * 
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - JMCh12Exercises
 * @author Sources - TODO list collaborators
 */
public class IndexEntry
{
    private String             word;

    private ArrayList<Integer> numList;

    // Constructs an IndexEntry for a given word
    // (converted to upper case); sets numsList
    // to an empty ArrayList.
    /**
     * @param word
     *            word
     */
    public IndexEntry(String word)
    {
        this.word = word.toUpperCase();
        numList = new ArrayList<>();
    }


    // Returns the word of this IndexEntry object.
    /**
     * @return word
     */
    public String getWord()
    {
        return word;
    }

    // If num is not already in the list, adds num
    // at the end of this IndexEntry's list
    // of numbers.


    /**
     * @param num
     *            num
     */
    public void add(int num)
    {
        if (!numList.contains(num))
        {
            numList.add(num);
            System.out.println(numList);
        }
    }

    // Converts this IndexEntry into a string in the
    // following format: the word followed by a space, followed by
    // numbers separated by a comma and a space.


    /**
     * @return a string
     */
    public String toString()
    {
        String a = word + " ";
        for (int i = 0; i < numList.size(); i++)
        {
            if (i == numList.size() - 1)
            {
                a += numList.get(i);
                break;
            }
            a += numList.get(i) + ", ";
        }
        return a;
    }


    /**
     * @param args
     *            args
     */
    public static void main(String[] args)
    {
        IndexEntry a = new IndexEntry("word1");
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a.toString());
    }
}
