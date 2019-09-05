package Search.DeepthFirstSearch.SurroundedRegions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution=new Solution();
    char[][] data=new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
    char[][] data1=new char[][]{{'O'}};
char[][]data3=new char[][]{{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
char[][]data4=new char[][]{};
    char[][]data2=new char[][]{};
    @Test
    public void solve() {
        solution.solve(data3);
        for(int i=0;i<data3.length;i++)
        { for(int j=0;j<data3[0].length;j++)
            {System.out.print(data3[i][j]);}
            System.out.println();}

    }
}