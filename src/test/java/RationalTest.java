import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        assertEquals(3, x.numerator);
    }
}
