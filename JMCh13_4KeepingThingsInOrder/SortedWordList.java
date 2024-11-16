import java.util.ArrayList;

/**
 * Implements a sorted list of words
 * 
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 * @author Assignment - Java Methods 13.4 Lab: Keeping Things in Order
 * @author Sources - TODO list collaborators
 */
public class SortedWordList
  extends java.util.ArrayList<String>
{
  public SortedWordList()
  {
  }


  public SortedWordList(int a)
  {
    super(a);
  }


  private int indexOf(String value)
  {
    int left = 0;
    int right = this.size() - 1;
    while (left <= right)
    {
      int middle = (left + right) / 2;
      if (value == this.get(middle))
      {
        return middle;
      }
      else if (value.compareToIgnoreCase((this.get(middle))) < 0)
      {
        right = middle - 1;
      }
      else
      {
        left = middle + 1;
      }
    }
    return -1;
  }


  public boolean contains(String word)
  {
    int a = indexOf(word);
    return a >= 0;
  }


  public String set(int i, String word)
  {
    if (i > 0 && this.get(i - 1).compareTo(word) < 0)
    {
      String temp = this.get(i);
      super.set(i, word);
      return temp;
    }
    else if (i == 0 && this.get(i + 1).compareTo(word) > 0)
    {
      String temp = this.get(i);
      super.set(i, word);
      return temp;
    }

    return "";
  }


  public void add(int i, String word)
  {
    if (i > 0 && this.get(i - 1).compareTo(word) < 0)
    {
      super.add(i, word);
      return;
    }
    else if (i == 0 && this.get(i + 1).compareTo(word) > 0)
    {
      super.add(i, word);
      return;
    }
    // IllegalArgumentException expected
    throw new IllegalArgumentException();

  }


  public boolean add(String word)
  {
    // add it in sorted
    int i = 0;
    if (this.contains(word))
    {
      return false;
    }
    while (i < this.size() && this.get(i).compareTo(word) < 0)
    {
      i++;
    }
    super.add(i, word);
    return true;
  }


  public void merge(SortedWordList additionalWords)
  {
    for (int i = 0; i < additionalWords.size(); i++)
    {
      this.add(additionalWords.get(i));
    }
  }


  public static void main(String[] args)
  {
    SortedWordList names1 = new SortedWordList(12);
    names1.add("Barb");
    names1.add("Ellen");
    names1.add("Dan");
    names1.set(1, "Foosie");

    System.out.println("names1 = " + names1);

  }

}
