package DynamicProgrammer.UniquePaths;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void uniquePaths() {
       int result= solution.uniquePaths(1,10);
        Assert.assertEquals(1,result);
    }
}