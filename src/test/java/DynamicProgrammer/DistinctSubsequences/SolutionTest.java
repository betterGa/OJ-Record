package DynamicProgrammer.DistinctSubsequences;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void numDistinct() {
        int result=solution.numDistinct("babgbag","bag");
        Assert.assertEquals(5,result);
    }
}