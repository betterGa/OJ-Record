package Search.DeepthFirstSearch.FloodFill;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
int[][]data=new int[][]{{1,1,1},{1,1,0},{1,0,1}};
int[][]result=new int[data.length][data[0].length];
    @Test
    public void floodFill() {
      result=solution.floodFill(data,1,1,2);
      for(int i=0;i<result.length;i++) {
          for (int j = 0; j < result[0].length; j++) {
              System.out.print(result[i][j]);}
      System.out.println(); }
      }
    }
