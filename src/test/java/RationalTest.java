import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class RationalTest {

    @Test
    public void testConstructor(){
        try{
            new Rational();
            new Rational(1,2);
            new Rational(-10, -5);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }

    @Test
    public void testSubtract() throws Rational.Illegal {
        Rational x = new Rational(2,3);
        Rational y = new Rational(2,6);
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(3, x.denominator);

    }

    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational x = new Rational(4,5);
        Rational y = new Rational(2,3);
        x.multiply(y);
        Assert.assertEquals(8, x.numerator);
        Assert.assertEquals(15, x.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal {
        Rational x = new Rational(1,3);
        Rational y = new Rational(4,3);
        x.divide(y);
        Assert.assertEquals(1,x.numerator);
        Assert.assertEquals(4,x.denominator);
    }

    @Test
    public void testEquals() throws Rational.Illegal {
        Rational x = new Rational(5,6);
        Rational y = new Rational(5,6);
        Assert.assertTrue(x.equals(y));
    }

    @Test
    public void testCompareTo() throws Rational.Illegal{
        Rational x = new Rational(2,3);
        Rational y = new Rational(3,4);
        Assert.assertEquals(-1,x.compareTo(y));
    }

    @Test
    public void testToString() throws Rational.Illegal{
        Rational x = new Rational(1,2);
        Assert.assertEquals("1/2", x.toString());
    }
}
