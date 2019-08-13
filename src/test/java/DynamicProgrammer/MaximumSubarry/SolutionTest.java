package DynamicProgrammer.MaximumSubarry;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void findGreatestSumOfSubArray() {
        int[]array={6,-3,-2,7,-15,1,2,2};
int result=solution.FindGreatestSumOfSubArray(array);
        Assert.assertEquals(8,result);
    }
}