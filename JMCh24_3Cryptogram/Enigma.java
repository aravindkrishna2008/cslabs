import java.util.Arrays;

/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - JM 24.3 Lab: Cryptogram Solver
 * @author Sources - TODO list collaborators
 */
public class Enigma
{
    private char[] lookupTable;

    /**
     * @param numLetters
     *            sfd
     */
    public Enigma(int numLetters)
    {
        lookupTable = new char[numLetters];
    }


    /**
     * @param index
     *            thef
     * @param ch
     *            te
     */
    public void setSubstitution(int index, char ch)
    {
        lookupTable[index] = ch;
    }


    /**
     * @param text
     *            te
     * @return fdasfsdfasdf
     */
    public String decode(String text)
    {
        StringBuffer buffer = new StringBuffer(text.length());

        for (int i = 0; i < text.length(); i++)
        {

            Character ch = text.charAt(i);
            if (Character.isLetter(ch))
            {
                int numericValue = Character.getNumericValue(Character.toUpperCase(ch)) - 10;
                if (Character.isUpperCase(ch))
                {
                    buffer.append(Character.toUpperCase(lookupTable[numericValue]));
                }
                else if (Character.isLowerCase(ch))
                {
                    buffer.append(Character.toLowerCase(lookupTable[numericValue]));
                }
            }
            else
            {
                buffer.append(ch);
            }

        }

        return buffer.toString();
    }


    /**
     * @param text
     *            te
     * @param lettersByFrequency
     *            te
     * @return fdsfsadfasd
     */
    public String getHints(String text, String lettersByFrequency)
    {
        int[] letterCounts = countLetters(text);
        char[] hints = new char[lookupTable.length];

        for (int i = 0; i < letterCounts.length; i++)
        {
            int rank = getRank(i, letterCounts);
            hints[i] = lettersByFrequency.charAt(rank);
        }

        String s = "";
        for (Character i : hints)
        {
            s+=i;
        }
        return s;
    }


    private int getRank(int index, int[] counts)
    {
        int rank = 0;

        for (int i = 0; i < counts.length; i++)
        {
            if ((counts[i] == counts[index] && i < index || counts[i] < counts[index]))
                rank++;

        }

        return rank;
    }


    private int[] countLetters(String text)
    {
        int[] counts = new int[lookupTable.length];

        for (int i = 0; i < text.length(); i++)
        {
            Character ch = text.charAt(i);
            if (Character.isLetter(ch))
            {
                int numericValue = Character.getNumericValue(Character.toUpperCase(ch)) - 10;
                counts[numericValue]++;
            }
        }

        return counts;
    }

    // *************************************************************
    // For test purposes only
    // not to be used in solution implementation


    /**
     * @return te
     */
    public char[] getLookupTable()
    {
        return lookupTable;
    }


    /**
     * @param text
     *            te
     * @return te
     */
    public int[] getCountLetters(String text)
    {
        return countLetters(text);
    }


    public static void main(String[] args)
    {
        Enigma a = new Enigma(26);
        System.err.println("hi");
        a.getHints("hello", "hello");
    }

}
