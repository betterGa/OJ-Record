package DynamicProgrammer.UniquePaths2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void uniquePathsWithObstacles() {

        int[][]test=new int[][]{{0,0}};
       int result=solution.uniquePathsWithObstacles(test);
        Assert.assertEquals(1,result);
    }
}