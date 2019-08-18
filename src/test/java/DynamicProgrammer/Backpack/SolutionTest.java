package DynamicProgrammer.Backpack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void backPackII() {
       int m = 10;
       int[]A ={2,3,8};
       int[]V ={2,5,8};
       int result=solution.backPackII(m,A,V);
        Assert.assertEquals(10,result);
    }
}