package lesson25_Exceptions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by frizzle on 05.12.13.
 */
public class CalculatorTest {
    @Test
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(1, 2), 3.0);
        Assert.assertEquals(calculator.sum(-1, 1), 0.0);
    }

    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.div(10,5), 2.0);

        try {
            calculator.div(5, 0);
            Assert.fail("Must have RuntimeConditionByZeroException exception");
        } catch (RuntimeConditionByZeroException e) {

        } catch (Throwable e) {
            Assert.fail("Must have RuntimeConditionByZeroException exception");
        }

    }
}
