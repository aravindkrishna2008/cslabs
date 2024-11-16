import org.junit.*;

// import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 * Test for the complex number class. w testConstructor1Param - test the 1
 * parameter constructor testConstructor2Param - test the 2 parameter
 * constructor testAddRealAndComplexNum - addition of a complex number with a
 * real number testAdd2ComplexNums - addition of two complex numbers
 * testMultiply2ComplexNums - multiplication of two complex numbers
 * testMultiplyRealAndComplexNum - multiplication of a complex number with a
 * real number testAbsoluteValue - absolute value of a complex number
 *
 * @author Aravind
 * @version Thu Oct 5
 * @author Period: 1
 * @author Assignment: JMCh09Ex17_Complex
 */
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;

public class ComplexJUTest
{

    @Test
    public void testAbs()
    {
        Complex complex1 = new Complex(3, 4);
        assertEquals(5.0, complex1.abs(), 0.001);

        Complex complex2 = new Complex(0, 0);
        assertEquals(0.0, complex2.abs(), 0.001);
    }


    @Test
    public void testComplex2args()
    {
        Complex complex1 = new Complex(3, 4);
        assertEquals("3.0 + 4.0i", complex1.toString());
    }


    @Test
    public void testComplex1args()
    {
        Complex complex1 = new Complex(3);
        assertEquals("3.0 + 0.0i", complex1.toString());
    }


    @Test
    public void testAddComplex()
    {
        Complex complex1 = new Complex(3, 4);
        Complex complex2 = new Complex(1, 2);
        Complex result = complex1.add(complex2);
        assertEquals(new Complex(4, 6).toString(), result.toString());
    }


    @Test
    public void testAddDouble()
    {
        Complex complex1 = new Complex(3, 4);
        double doubleValue = 2.5;
        Complex result = complex1.add(doubleValue);
        assertEquals(new Complex(5.5, 4).toString(), result.toString());
    }


    @Test
    public void testMultiplyComplex()
    {
        Complex complex1 = new Complex(3, 4);
        Complex complex2 = new Complex(1, 2);
        Complex result = complex1.multiply(complex2);
        assertEquals(new Complex(-5, 10).toString(), result.toString());
    }


    @Test
    public void testMultiplyDouble()
    {
        Complex complex1 = new Complex(3, 4);
        double doubleValue = 2.5;
        Complex result = complex1.multiply(doubleValue);
        assertEquals(new Complex(7.5, 10).toString(), result.toString());
    }


    @Test
    public void testToString()
    {
        Complex complex1 = new Complex(3, 4);
        assertEquals("3.0 + 4.0i", complex1.toString());

        Complex complex2 = new Complex(0, 0);
        assertEquals("0.0 + 0.0i", complex2.toString());
    }


    public static void main(String args[])
    {
        org.junit.runner.JUnitCore.main("ComplexJUTest");
    }
}
