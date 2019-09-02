package Search.DeepthFirstSearch.SurroundedRegions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution=new Solution();
    char[][] data=new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
    @Test
    public void solve() {
        solution.solve(data);
        for(int i=0;i<data.length;i++)
        { for(int j=0;j<data[0].length;j++)
            {System.out.print(data[i][j]);}
            System.out.println();}

    }
}