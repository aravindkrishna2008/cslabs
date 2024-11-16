
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
import java.util.*;

public class Heapsort
{
    public static void sort(double[] a)
    {
        int n = a.length;
        for (int i = n / 2; i > 0; i--)
        {
            reheapDown(a, i, n);
        }
        for (int i = n; i > 1; i--)
        {
            double temp = a[0];
            a[0] = a[i - 1];
            a[i - 1] = temp;
            reheapDown(a, 1, i - 1);
        }
    }


    // Should be private - made public for testing
    public static void reheapDown(double[] a, int i, int n)
    {
        i = i - 1;
        int l;
        int r;
        while (i < n)
        {
            l = 2 * i + 1;
            r = 2 * i + 2;

            if (l >= n)
                break;
            else
            {
                int smallest = l;
                if (r < n && a[r] > a[l])
                    smallest = r;
                if (a[smallest] > a[i])
                {
                    double temp = a[i];
                    a[i] = a[smallest];
                    a[smallest] = temp;
                    i = smallest;
                }
                else
                    break;
            }
        }
    }


    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(6);
        pq.add(2);
        pq.add(5);
        System.out.println(pq.remove());
        System.out.println(pq.toString());

        double[] a = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        sort(a);

    }
}
