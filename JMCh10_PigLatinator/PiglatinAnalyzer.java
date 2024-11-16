import java.util.Scanner;

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
public class PiglatinAnalyzer
{
    private String text;

    // Constructor: saves the text string
    public PiglatinAnalyzer(String text)
    {
        this.text = text;
    }


    /**
     * Converts a string to it piglatin form according to the following rules:
     * a. If there are no vowels in englishWord, then pigLatinWord is just
     * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o', and 'u',
     * and their uppercase counterparts.) b. Else, if englishWord begins with a
     * vowel, then pigLatinWord is just englishWord + "yay". c. Otherwise (if
     * englishWord has a vowel in it and yet doesn't start with a vowel), then
     * pigLatinWord is end + start + "ay", where end and start are defined as
     * follows: 1. Let start be all of englishWord up to (but not including) its
     * first vowel. 2. Let end be all of englishWord from its first vowel on. 3.
     * But, if englishWord is capitalized, then capitalize end and
     * "uncapitalize" start.
     *
     * @return piglatin version of text as a String
     */
    public String phraseToPigLatin()
    {
        String phraseToTranslate = text + " ";
        String newText = "";
        String translation = "";

        for (int i = 0; i < phraseToTranslate.length(); i++)
        {
            char currentChar = phraseToTranslate.charAt(i);
            // System.out.println(currentChar);

            if (Character.isLetter(currentChar))
            {
                newText += currentChar;
            }
            else if (!newText.isEmpty())
            {
                // System.out.println(newText);
                translation += wordToPigLatin(newText) + currentChar;
                newText = "";
            }
            else
            {
                translation += currentChar;
            }
        }
        return translation.trim();
    }


    /**
     * Converts an "english" word to its piglatin form
     *
     * @param englishWord
     *            a string representing an english word
     * @return piglatin form of the english word
     */
    public String wordToPigLatin(String englishWord)
    {
        String pigLatinWord = "";

        String loweredEnglishWord = englishWord.toLowerCase();

        if (loweredEnglishWord.charAt(0) == 'a' || loweredEnglishWord.charAt(0) == 'e'
            || loweredEnglishWord.charAt(0) == 'i' || loweredEnglishWord.charAt(0) == 'o'
            || loweredEnglishWord.charAt(0) == 'u')
        {
            pigLatinWord = loweredEnglishWord + "yay";
        }
        else if (!(loweredEnglishWord.contains("a") || loweredEnglishWord.contains("e") 
            || loweredEnglishWord.contains("i") || loweredEnglishWord.contains("o")
            || loweredEnglishWord.contains("u")))
        {
            pigLatinWord = loweredEnglishWord + "ay";
        }
        else
        {
            int indexOfVowel = 0;
            for (int i = 0; i < text.length() - 1; i++)
            {
                if (loweredEnglishWord.charAt(i) == 'a' || loweredEnglishWord.charAt(i) == 'e'
                    || loweredEnglishWord.charAt(i) == 'i' || loweredEnglishWord.charAt(i) == 'o'
                    || loweredEnglishWord.charAt(i) == 'u')
                {
                    indexOfVowel = i;
                    break;
                }
            }

            pigLatinWord = loweredEnglishWord.substring(indexOfVowel)
                + loweredEnglishWord.substring(0, indexOfVowel) + "ay";
        }

        System.out.println(Character.isUpperCase(loweredEnglishWord.charAt(0)));
        if (Character.isUpperCase(englishWord.charAt(0)))
        {
            pigLatinWord = Character.toUpperCase(pigLatinWord.charAt(0))
                + pigLatinWord.substring(1).toLowerCase();
        }
        return pigLatinWord;
    }

    // TODO add additional helper methods

}
