package Search.BreadthFirstSearch.RottingOrange;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    @Test
    public void orangesRotting() {
        int[][]grid=new int[][]{{1},{2},{1},{2}};
        int result=solution.orangesRotting(grid);
        Assert.assertEquals(1,result);
    }
    @Test
    public void test1()
    {int size = Integer.MAX_VALUE;
        System.out.println(size);
        size++;
        System.out.println(size);
    }
}