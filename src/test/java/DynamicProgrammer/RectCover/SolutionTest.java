package DynamicProgrammer.RectCover;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void rectCover() {
        int result=solution.RectCover(4);
        Assert.assertEquals(5,result);
    }
}