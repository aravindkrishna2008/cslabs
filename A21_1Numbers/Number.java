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
public class Number
{
  private ArrayList<Digit> a = new ArrayList<>();

  public Number()
  {
    a.add(new Digit());
  }


  public Number(int number, int base)
  {
    while (number > 0)
    {
      a.add(0, new Digit(number % base, base));
      number /= base;
    }

  }


  public void increment()
  {
    boolean carry = false;
    for (int i = a.size() - 1; i >= 0; i--)
    {
      carry = a.get(i).increment();
      if (i == 0 && carry == true)
        a.add(0, new Digit(1, a.get(0).getBase()));
      if (carry == false)
        break;
    }
  }


  public String toString()
  {
    String k = "";
    for (Digit i : a)
    {  
      k += i.toString();
    }
    return k;
  }


  public static void main(String[] args)
  {
    Number a = new Number(44, 5);
    a.increment();
    System.out.println(a.toString());
  }

}
