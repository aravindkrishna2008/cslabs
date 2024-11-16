import java.util.*;

public class Test
{
    public static void printX(int n)
    {
        if (n <= 0)
            System.out.print(0);
        else
        {
            printX(n - 1);
            System.out.print(n);
            printX(n - 2);
        }
    }


    public static void enigma(int n)
    {
        for (int i = 0; i < n; i++)
            enigma(i);
        System.out.print(n);
    }


    public static void display(int x)
    {
        if (x >= 10)
        {
            display(x / 10);
            System.out.print(x % 10);
        }
    }

    // public static double max(double[] v, int n)
    // {

    // double m = v[n - 1], m2;

    // if (true)
    // {
    // v.

    // if (m2 > m)
    // m = m2;
    // }
    // return m;
    // }


    public static double pow(double x, int n)
    {
        double y;
        if (n == 1)
            y = x;
        else
        {
            System.out.println("mult");
            y = pow(x, n / 2) * pow(x, n - n / 2);
        }  // Line 7
        return y;
    }


    public static int mysterySum(int n)
    {
        if (n == 1)
            return 1;
        else
            return mysterySum(n - 1) + 2 * n - 1;
    }


    public static void main(String[] args)
    {
        System.out.println(mysterySum(10));
    }

}
