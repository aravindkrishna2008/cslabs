/**
Cool math stuff
 *
 * @author Aravindkrishna Arivudainambi
 * @version Fri Sept 9
 * @author Period: 1
 * @author Assignment: JMCh08_PerfectNumbers
 * @author Sources: N/A
 */
public class MyMath
{
    /**
     * Returns true if n is a prime; otherwise returns false.
     * 
     * @param n
     *            number to check if prime
     * @return true if n is a prime; otherwise returns false
     */
    public static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;

        int m = 2;

        while (m * m <= n)
        {
            if (n % m == 0)
                return false;
            m++;
        }

        return true;
    }


    /**
     * Question 8-15 Returns the n-th Fibonacci number Find and read a few
     * informative websites dedicated to Fibonacci numbers. The following
     * recursive method returns the n-th Fibonacci number: // Returns the n-th
     * Fibonacci number. // Precondition: n >= 1 public static long
     * fibonacci(int n) { if (n == 1 || n == 2) return 1; else return
     * fibonacci(n - 1) + fibonacci(n - 2); } Rewrite it without recursion,
     * using one loop.
     *
     * @param n
     *            Fibonacci number to find
     * @return n-th Fibonacci number
     */
    public static long fibonacci(int n)
    {
        long a = 0;
        long b = 1;
        for (int i = 1; i <= n; i++)
        {
            long c = b;
            b = a + b;
            a = c;
        }

        return a;
    }


    /**
     * Returns true if n is a perfect number, false otherwise.
     * 
     * @param n
     *            number to test
     * @return true if n is a perfect number, false otherwise.
     */
    public static boolean isPerfect(int n)
    {
        int sumFactors = 0;
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sumFactors += i;
            }
        }

        return sumFactors == n;
    }


    /**
     * Prints the first n perfect numbers
     * 
     * @param n
     *            number of perfect numbers to print
     */
    public static void printPerfectNums(int n)
    {
        System.out.println("Perfect Numbers: ");
        n += 1;
        for (int i = 1; i < n; i++)
        {
            if (isPerfect(i))
            {
                System.out.print(i + " ");
            }
            else
            {
                n++;
            }
        }
        System.out.println();
    }


    /**
     * Prints the first n Mersenne primes
     * 
     * @param n
     *            number of Mersenne primes to print
     */
    public static void printMersennePrimes(int n)
    {
        System.out.println("Mersenne primes: ");
        n += 1;
        for (int i = 2; i <= n; i++)
        {
            int mersenne = pow2(i) - 1;
            if (isPrime(mersenne))
            {
                System.out.print(mersenne + " ");
            }
            else
            {
                n++;
            }
        }
        System.out.println();
    }


    public static int pow2(int a)
    {
        int power = 1;
        for (int i = 0; i < a; i++)
        {
            power *= 2;
        }

        return power;
    }


    /**
     * Prints the first n even perfect numbers
     */
    public static void printEvenPerfectNums(int n)
    {
        System.out.println("Even perfect numbers: ");

        long count = 0;
        for (long i = 2; count < n; i *= 2)
        {
            if (isPrime(i - 1))
            {
                System.out.print((i-1)*(i/2) + " ");
                count++;
            }

        }

        System.out.println();
    }


    /*********************************************************************/

    public static void main(String[] args)
    {
        int n = 19;
        System.out.println(n + "-th Fibonacci number = " + fibonacci(19));
        printPerfectNums(4);
        printMersennePrimes(6);
        printEvenPerfectNums(6);
    }
}
/*
 * 19-th Fibonacci number = 4181 Perfect numbers: 6 28 496 8128 Mersenne primes:
 * 3 7 31 127 8191 131071 Even perfect numbers: 6 28 496 8128 33550336
 * 8589869056
 */
