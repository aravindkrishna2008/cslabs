/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - JMCh10 Lipogrammer
 * @author Sources - TODO list collaborators
 */
public class LipogramAnalyzer
{
    private String text;

    /**
     * Constructor: Saves the text string
     * 
     * @param text
     *            String to analyze
     */
    public LipogramAnalyzer(String text)
    {
        this.text = text;
    }


    /**
     * Returns the text string with all characters equal to letter replaced with
     * '#'.
     * 
     * @param letter
     *            character to replace
     * @return text string with all characters equal to letter replaced with '#'
     */
    public String mark(char letter)
    {
        String newStr = "";
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == letter)
            {
                newStr += "#";
            }
            else
            {
                newStr += text.charAt(i);
            }
        }

        return newStr; // !!!Fix this
    }


    public String allWordsWith(char letter)
    {
        String result = "";
        String newText = text.toLowerCase() + " ";
        String newWord = "";

        for (int i = 0; i < newText.length(); i++)
        {
            char currentChar = newText.charAt(i);

            if (Character.isLetter(currentChar))
            {
                newWord += currentChar;
            }
            else if (!newWord.isEmpty())
            {
                if (newWord.contains(String.valueOf(letter)))
                {
                    if (!result.contains(newWord))
                    {
                        result += newWord + "\n";
                    }
                    else
                    {
                        int index = text.indexOf(newWord);
                        String currWord = extractWord(index);
                        // System.out.println("hi" + currWord);
                        if (!currWord.toLowerCase().equals(newWord))
                        {
                            result += newWord + "\n";
                        }

                    }
                }
                newWord = "";
            }
        }

        return result; // !!!Fix this
    }


    // made public for test purposes
    /*
     * Returns the word that contains character at pos excluding any punctuation
     * or whitespace OR returns the word that begins with the character at pos
     * @param pos location of a letter in text
     * @return word that contains character at pos
     */
    public String extractWord(int pos)
    {

        int start = pos;
        int end = pos;

        if (Character.isLetter(text.charAt(pos)))
        {
            while (start > 0 && Character.isLetter(text.charAt(start - 1)))
            {
                start--;
            }

            while (end < text.length() - 1 && Character.isLetter(text.charAt(end + 1)))
            {
                end++;
            }

            String word = text.substring(start, end + 1);
            System.out.println(word);

            return word;
        }
        else
        {
            return "";
        }
    }

}
