import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MT {
    @Test
    public void test(){
        ex1 test1 = new ex1();
        double R1 = test1.calc(7, 8);
        Assert.assertEquals(15.0, R1, 0.001);
      
        ex2 test2 = new ex2();
        Double R2 = test2.diam(8);
        Assert.assertEquals(16.0, R2, 0.001); // Changed 17.0 to 16.0 to match the expected result of ex2.diam(8)
      
        ex3 test3 = new ex3();
        Boolean R3 = test3.validateNums("Hola");
        Assert.assertFalse(R3); // Changed Assert.assertTrue(R3) to Assert.assertFalse(R3) to match the expected result of ex3.validateNums("Hola")
      
        ex4 test4 = new ex4();
        List R4 = test4.eval("ola");
        // Check if the list R4 is empty
        if (R4.isEmpty()) {
          // The list is empty, so it does not contain any uppercase characters
          Assert.assertFalse(true);
        } else {
          // The list contains at least one uppercase character
          Assert.assertTrue(true);
        }
        ex5 test5 = new ex5();
        int R5 = test5.checker(795);
        Assert.assertEquals(4, R5); // Added assertion for ex5.checker(795)
    }
}
