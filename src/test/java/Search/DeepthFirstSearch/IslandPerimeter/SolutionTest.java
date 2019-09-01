package Search.DeepthFirstSearch.IslandPerimeter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
int[][]data=new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
    @Test
    public void islandPerimeter() {
        int result=solution.islandPerimeter(data);
        Assert.assertEquals(7,result);
    }

    @Test
    public void judgeIsland() {
    }
}