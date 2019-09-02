package Search.DeepthFirstSearch.IslandPerimeter;/*
用深度优先搜索遇到了问题，如果该坐标已被判断，是需要回退的，而且两个连在一起的话是需要-2的，这样就矛盾了。
 */

/*
package Search.DeepthFirstSearch.IslandPerimeter;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int num=0;
    List<String> isjudged=new ArrayList<>();
        public int islandPerimeter(int[][] grid) {
isjudged.clear();
num=0;
            //从左至右从上至下，先找到值为1的坐标
            for(int i=0;i<grid.length;i++)
                for(int j=0;j<grid[0].length;j++)
    {
        if(grid[i][j]==1)
        {judgeIsland(grid,i,j);break;}}

        return num;}



    public void judgeIsland(int[][] grid,int i,int j)
            {//为避免重复判断,如果已判断过，就回退
                if(isjudged.contains(i+""+j)){
                    num=num-2;
                    isjudged.remove(i+""+j);
                    return ;}

                isjudged.add(i+""+j);
                num=num+4;
            //上
                if(i>0&&grid[i-1][j]==1)
                {judgeIsland(grid,i-1,j);}

                //下
                if(i<grid.length-1&&grid[i+1][j]==1)
                {judgeIsland(grid,i+1,j);}

                //左
                if(j>0&&grid[i][j-1]==1)
                {judgeIsland(grid,i,j-1);}

                //右
                if(j<grid[0].length-1&&grid[i][j+1]==1)
                {judgeIsland(grid,i,j+1);}

                //上下左右判断完毕，可回退
                    return;

            }}

*/
public class Solution {
public int islandPerimeter(int[][] grid) {
    int num=0;
for(int i=0;i<grid.length;i++)
    for(int j=0;j<grid[0].length;j++)
    {if(grid[i][j]==1)
    {num=num+4;
    //上
    if(i>=1&&grid[i-1][j]==1)num=num-1;
    //下
        if(i<grid.length-1&&grid[i+1][j]==1)num=num-1;
        //左
        if(j>=1&&grid[i][j-1]==1) num=num-1;
        //右
        if(j<grid[0].length-1&&grid[i][j+1]==1) num=num-1; }}
        return num;
        }
        }
