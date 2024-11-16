import java.lang.reflect.Array;
import java.util.*;

/**
 * RPN Calculator
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period: TODO Your Period
 * @author Assignment: AB31RPN Calculator
 * @author Sources: TODO List Collaborators
 */
public class RPN
{
    Scanner                scan = new Scanner(System.in);

    private Stack<Integer> myStack;
    private Queue<String>  myQ;

    /**
     * Constructs an RPN Calculator
     */
    public RPN()
    {
        scan = new Scanner(System.in);
        myStack = new Stack<>();
        myQ = new LinkedList<>();
    }


    /**
     * **** Used for testing - Do Not Remove *** Constructs an RPN Calculator
     * and then redirects the Scanner input to the supplied string.
     * 
     * @param console
     *            replaces console input
     */
    public RPN(String console)
    {
        this();
        scan = new Scanner(console);
    }


    /**
     * TODO Write your method description here.
     */
    public void calculate()
    {
        ArrayList<String> thing = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        int answer = 0;
        while (scan.hasNextLine())
        {
            String curr = scan.nextLine();
            if (curr.toLowerCase().equals("q"))
            {
                break;
            }

            thing.add(curr);
            temp.add(curr);
        }
        scan.close();
        while (thing.size() > 1)
        {
            for (int i = 0; i < thing.size(); i++)
            {
                if (thing.get(i).equals("+"))
                {
                    answer = addition(
                        Integer.parseInt(thing.get(i - 1)),
                        Integer.parseInt(thing.get(i - 2)));
                    thing.remove(i);
                    thing.remove(i - 1);
                    thing.remove(i - 2);
                    thing.add(i - 2, answer + "");
                    break;
                }

                if (thing.get(i).equals("-"))
                {
                    answer = subtraction(
                        Integer.parseInt(thing.get(i - 1)),
                        Integer.parseInt(thing.get(i - 2)));
                    thing.remove(i);
                    thing.remove(i - 1);
                    thing.remove(i - 2);
                    thing.add(i - 2, answer + "");
                    break;
                }

                if (thing.get(i).equals("/"))
                {
                    answer = division(
                        Integer.parseInt(thing.get(i - 1)),
                        Integer.parseInt(thing.get(i - 2)));
                    thing.remove(i);
                    thing.remove(i - 1);
                    thing.remove(i - 2);
                    thing.add(i - 2, answer + "");
                    break;
                }

                if (thing.get(i).equals("*"))
                {
                    answer = multiplication(
                        Integer.parseInt(thing.get(i - 1)),
                        Integer.parseInt(thing.get(i - 2)));
                    thing.remove(i);
                    thing.remove(i - 1);
                    thing.remove(i - 2);
                    thing.add(i - 2, answer + "");
                    break;
                }
            }
        }
        for (String i : temp)
        {
            System.out.print(i + " ");
        }

        System.out.print("= " + answer);
        System.out.println();
    }


    private int addition(int a, int b)
    {
        return a + b;
    }


    private int subtraction(int a, int b)
    {
        return b - a;
    }


    private int multiplication(int a, int b)
    {
        return a * b;
    }


    private int division(int a, int b)
    {
        return b / a;
    }


    /**
     * Instantiates an RPN Calculator and invokes it calculate method
     * 
     * @param args
     *            command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        RPN rpn = new RPN();
        rpn.calculate();
    }
}
