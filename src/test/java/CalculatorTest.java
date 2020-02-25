import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void TestAdd() {
       Assert.assertEquals(Calculator.add(1,1),2);
    }
    @Test
    public void TestAddmorethentwo() {
        Assert.assertEquals(Calculator.add(1,1,1),3);
    }
    @Test
    public void Testmultiply() {
        Assert.assertEquals(Calculator.multiply(2,2),4);
    }
    @Test
    public void Testmultiplymorethantwo() {
        Assert.assertEquals(Calculator.multiply(2,2,2),8);
    }


}
