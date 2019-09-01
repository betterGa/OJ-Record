package Search.DeepthFirstSearch.IslandPerimeter;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int num=0;
   List<String> isjudged=new ArrayList<>();
        public int islandPerimeter(int[][] grid) {

            //从左至右从上至下，先找到值为1的坐标
            for(int i=0;i<grid.length;i++)
                for(int j=0;j<grid[0].length;j++)
    {
        if(grid[i][j]==1)
        {judgeIsland(num,grid,i,j);}
    }
        return num;

        }

    public void judgeIsland(int num,int[][] grid,int i,int j)
            {//为避免重复判断,如果已判断过，就回退
                if(isjudged.contains(i+""+j)) return ;

                isjudged.add(i+""+j);
                num++;

            //上
                if(i>0&&grid[i-1][j]==1)
                {judgeIsland(num,grid,i-1,j);}

                //下
                if(i<grid.length-1&&grid[i+1][j]==1)
                {judgeIsland(num,grid,i+1,j);}

                //左
                if(j>0&&grid[i][j-1]==1)
                {judgeIsland(num,grid,i,j-1);}

                //右
                if(j<grid[0].length-1&&grid[i][j+1]==1)
                {judgeIsland(num,grid,i,j+1);}

                //上下左右判断完毕，可回退
                    return ;

            }}


