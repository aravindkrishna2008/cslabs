/**
 * Represents a complex number of the form a + bi. Provides methods for adding,
 * multiplying and calculating the absolute value.
 *
 * @author aravind
 * @version wed oct 2021
 * @author Period: 1
 * @author Assignment: JMCh09Ex17_Complex
 * @author Sources: TODO List collaborators
 */
public class Complex
{
    private double a;
    private double b;

    /**
     * @param a
     *            is the real coefficient
     */
    public Complex(double a)
    {
        this.a = a;
        this.b = 0.0;
    }


    /**
     * @param a
     *            real part
     * @param b
     *            imaginary part
     */
    public Complex(double a, double b)
    {
        this.a = a;
        this.b = b;
    }


    /**
     * @return the magnitude of the imaginary num
     */
    public double abs()
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }


    /**
     * @param otherComplex
     *            complex number
     * @return the sum of the 2 nums
     */
    public Complex add(Complex otherComplex)
    {
        return new Complex(this.a + otherComplex.a, this.b + otherComplex.b);
    }


    /**
     * @param otherComplex
     *            double
     * @return sum of the 2 nums
     */
    public Complex add(double otherComplex)
    {
        return new Complex(this.a + otherComplex, this.b);
    }


    /**
     * @param otherComplex
     *            complex number
     * @return the product of the 2 nums
     */
    public Complex multiply(Complex otherComplex)
    {
        return new Complex(
            this.a * otherComplex.a - this.b * otherComplex.b,
            this.a * otherComplex.b + this.b * otherComplex.a);
    }


    /**
     * @param otherComplex
     *            real number
     * @return the product of these two numbers
     */
    public Complex multiply(double otherComplex)
    {
        return new Complex(this.a * otherComplex, this.b * otherComplex);
    }


    /**
     * @return the string version of this number
     */
    public String toString()
    {
        return a + " + " + b + "i";
    }
}
