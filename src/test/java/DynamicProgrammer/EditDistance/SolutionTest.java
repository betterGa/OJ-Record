package DynamicProgrammer.EditDistance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void minDistance() {
    int result=solution.minDistance("","a");
        Assert.assertEquals(1,result);
    }

    @Test
    public void minTest() {
        int result = solution.min(1, 2, 3);
        Assert.assertEquals(1,result);
    }
}