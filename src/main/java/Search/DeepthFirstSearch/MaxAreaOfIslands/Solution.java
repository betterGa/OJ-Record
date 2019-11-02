//LeetCode 695岛屿的最大面积。
//Java实现，已通过。深度优先搜索，执行用时 :4 ms内存消耗 :43.3 MB。
// 在上一题“岛屿数量"的启发下，遍历数组，遇到陆地“1”就进行深度优先搜索。
// 在深度优先搜素的操作中，需要把当前的陆地“1"改为“0”
// （表示这块陆地是这块岛屿的，避免和别的岛重复。），
// 这当前岛屿设置一个num，用来记录小岛屿数量即岛屿面积，递归调用，
// 从当前陆地渲染开，看当前坐标的上、下、左、右，上下左右都遍历完就回退。
// 这个回退前需要num++,当然，坐标非法或者遇到水“0”时也是需要回退的。
// 对当前陆地“1”搜素完成后，需要将num存到areaSave数组中。
// 需要注意，这个areaSave数组的大小需要为50*50.
// 每次要进入一个新的岛屿时需要num置为0，重新计数。
// 最后找到areaSave数组中的最大值即可
package Search.DeepthFirstSearch.MaxAreaOfIslands;

public class Solution {

    int num=0;
    public int maxAreaOfIsland(int[][] grid) {
        int line = grid.length;
        int column = grid[0].length;
        //题目中说grid大小不会超过50，那么岛屿的面积存储数组的大小应是50*50
        int[] areaSave=new int[50*50];
        int k=0;
        for (int i = 0; i < line; i++)
            for (int j = 0; j < column; j++) {
            num=0;
                if (grid[i][j] == 1){ dfs(grid, i,j);areaSave[k++]=num;}
            }
            //找出面积数组的最大值
            int max=areaSave[0];
       for (int m=1;m<k;m++)
           if(areaSave[m]>max) max=areaSave[m];
    return max;
    }


    public void dfs(int[][] grid,int line,int column)
    {
        if(line<0||line>=grid.length||column<0||column>=grid[0].length||grid[line][column]==0)
        return;
        grid[line][column]=0;
        dfs(grid,line-1,column);
        dfs(grid,line+1,column);
        dfs(grid,line,column-1);
        dfs(grid,line,column+1);
        //这里的num记录的时小岛屿个数，即岛屿的面积
        num++;
       return;

    }
}




