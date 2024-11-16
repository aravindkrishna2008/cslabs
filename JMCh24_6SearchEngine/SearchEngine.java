import java.util.*;

/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - JM24.6 - Search Engine
 * @author Sources - TODO list collaborators
 */
public class SearchEngine
{
    // Instance variable(s)
    private String                    myURL; // holds the name for the "url"
                                             // (file name)
    private Map<String, List<String>> myIndex; // holds the word index

    // Constructor(s)
    /**
     * fsdjfklsdajfjklsadjfkl;asjf;dskdsaklfjsad;lkfjsdl;fjlksd
     * 
     * @param url
     *            theurl
     */
    public SearchEngine(String url)
    {
        myURL = url;
        myIndex = new HashMap<String, List<String>>(20000);
    }


    // Methods
    /**
     * Returns myUrl
     * 
     * @return the url
     */
    public String getURL()
    {
        return myURL;
    }


    /**
     * Extracts all words from line, and, for each word, adds line to its list
     * of lines in myIndex. This method obtains a set of all words in line by
     * calling a private method parseWords(line) (see below). Use a
     * LinkedList<String> object to represent a list of lines associated with a
     * word
     * 
     * @param line
     *            the line that you want
     */
    public void add(String line)
    {
        Set<String> a = parseWords(line);
        for (String k : a)
        {
            if (myIndex.get(k) == null)
            {
                myIndex.put(k, new LinkedList<String>());
            }

            myIndex.get(k).add(line);
        }
    }


    /**
     * dahfklsdfjkafhdsfhklsjfhjk;as
     * 
     * @param words
     *            dsfasfsdaf
     * @return sjdfksjd
     */
    public List<String> getHits(String words)
    {
        return myIndex.get(words.toLowerCase());
    }


    /**
     * sdfkjsadkjfgsdjkfgjksdfjklasdfjg
     * 
     * @param line
     *            dsafdsafasdfasdfsd
     * @return hfsadjkhfjksafjkdsahjkf
     */
    private Set<String> parseWords(String line)
    {
        String[] a = line.split("\\W+");
        Set<String> b = new TreeSet<>();

        for (String k : a)
        {
            if (!k.isEmpty())
            {
                b.add(k.toLowerCase());
            }
        }

        return b;
    }


    // *************************************************************
    // For test purposes only
    // not to be used in solution implementation
    /**
     * sdfhklsadfksadhdfkl;asjd;fsdadskf
     * 
     * @return hflsdhfjkashfaksdfhksdlafhkljsa
     */
    public Map<String, List<String>> getIndex()
    {
        return myIndex;
    }
}
