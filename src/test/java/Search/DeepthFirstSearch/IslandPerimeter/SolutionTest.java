package Search.DeepthFirstSearch.IslandPerimeter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
int[][]data=new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
int[][]data2=new int[][]{{1}};
int[][]data3=new int[][]{{1,1},{1,1}};
    @Test
    public void islandPerimeter() {
       int result=new Solution().islandPerimeter(data);
        Assert.assertEquals(16,result);
        int result2=solution.islandPerimeter(data2);
        Assert.assertEquals(4,result2);
        int result3=solution.islandPerimeter(data3);
        Assert.assertEquals(8,result3);
    }

    @Test
    public void judgeIsland() {
    }
}