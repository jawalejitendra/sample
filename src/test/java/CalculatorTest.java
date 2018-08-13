import com.pack.one.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd2NumFunction() {
        Assert.assertEquals(7, calculator.add2Num(3, 4));
    }

    @Test
    public void testMultiply2NumFunction() {
        Assert.assertEquals(12, calculator.multiply2Num(3, 4));
    }

    @Test
    public void testDivide2NumFunction() {
        Assert.assertEquals((float)(7.5), calculator.divide2Num(30, 4), 0.0);
    }


}
