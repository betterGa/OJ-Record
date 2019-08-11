package DynamicProgrammer.Fibonacci;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void fibonacci() {
      int result=  solution.Fibonacci(4);
        Assert.assertEquals(3,result);}
}