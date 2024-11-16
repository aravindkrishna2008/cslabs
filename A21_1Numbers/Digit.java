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
public class Digit
{
  private int base;
  private int num;

  public Digit(int num, int base)
  {
    this.num = num;
    this.base = base;
  }


  public Digit()
  {
    this.num = 0;
    this.base = 10;
  }


  public boolean increment()
  {
    if (num + 1 >= base)
    {
      num = 0;
      return true;
    }
    else
    {
      num++;
      return false;
    }
  }


  public String toString()
  {
    if (num < 10)
      return num + "";
    else
    {
      char letter = (char)('A' - 1 + num-9);
      return letter + "";
    }
  }


  public int getBase()
  {
    return base;
  }


  public int getNum()
  {
    return num;
  }

}
