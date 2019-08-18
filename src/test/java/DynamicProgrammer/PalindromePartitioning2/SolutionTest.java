package DynamicProgrammer.PalindromePartitioning2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void isPalind() {
   String s1="ab";
   String s2="aabbaa";
   boolean r=solution.isPalind(s1);
        Assert.assertEquals(false,r);

    }

    @Test
    public void minCut()
    {
        String s="aab";
       int result=solution.minCut(s);
    Assert.assertEquals(1,result);
    }

}