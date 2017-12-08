import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void multiply() throws Exception {
        Rational r1 = new Rational(4, 2);
        Rational r2 = new Rational(2, 3);
        Rational result = r1.multiply(r2);
        int expected= 4/3;
        Assert.assertEquals(result,expected);
    }

}