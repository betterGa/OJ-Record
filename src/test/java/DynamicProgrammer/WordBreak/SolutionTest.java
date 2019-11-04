package DynamicProgrammer.WordBreak;

import DynamicProgrammer.WordBreak.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SolutionTest {

      Solution solution = new Solution();
    public String s = "aaaaaaa";
    public Set<String> dict = new HashSet();

    @Test
    public void wordBreak() {
        dict.add("aaaa");
        dict.add("aaa");
        boolean result=solution.wordBreak(s,dict);
        Assert.assertEquals(true,result);
        }
}