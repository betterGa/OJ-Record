package DynamicProgrammer.ClimbingStairs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void jumpFloorII() {
        int result=solution.JumpFloorII(2);
        Assert.assertEquals(2,result);
    }
}