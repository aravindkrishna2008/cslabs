import java.util.ArrayList;

public class FinalPractice
{
    // create swap method for lists
    public static void sort(ArrayList<String> items)
    {
        int n = items.size();
        while (n > 1)
        {
            sortHelper(items, n - 1);
            System.out.println(items);
            n--;
        }
    }


    private static void sortHelper(ArrayList<String> items, int last)
    {
        int k, m = last;
        for (k = 0; k < last; k++)
        {
            System.out.println(items.get(k) + " " + items.get(m));
            if (items.get(k).compareTo(items.get(m)) < 0)
                m = k;
        }
        String temp = items.get(m);
        items.set(m, items.get(last));
        items.set(last, temp);
    }


    public static void main(String[] args)
    {
        int x = 987, y = 0;
        while (x > 0)
        {
            y = y * 10;
            y = y + (x % 10);
            x = x / 10;
            System.out.println("x" + " " + x);
            System.out.println("y" + " " + y);
        }
    }
}
