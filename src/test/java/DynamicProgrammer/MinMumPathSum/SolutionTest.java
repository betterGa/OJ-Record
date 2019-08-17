package DynamicProgrammer.MinMumPathSum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void minPathSum() {
        int[][]date={{1,2},{1,1}};
        int result=solution.minPathSum(date);
        Assert.assertEquals(3,result);
    }
}