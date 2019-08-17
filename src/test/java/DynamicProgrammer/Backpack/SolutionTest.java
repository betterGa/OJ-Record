package DynamicProgrammer.Backpack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void backPackII() {
       int m = 10;
       int[]A ={2, 3, 5, 7};
       int[]V ={1, 5, 2, 4};
       int result=solution.backPackII(m,A,V);
        Assert.assertEquals(9,result);
    }
}