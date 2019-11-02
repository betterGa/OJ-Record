package Search.DeepthFirstSearch.NumberOfIslands;

public class Solution {
    int time;
    public int numIslands(char[][] grid) {
        int line=grid.length;
        int column=grid[0].length;
        //遍历数组，遇到"1"进行深度优先遍历
        for(int i=0;i<line;i++)
            for(int j=0;j<column;j++)
            {
                if(grid[i][j]=='1') dfs(grid,i,j);
            }
return time;
    }
    public void dfs(char[][] data,int line,int column)
    {
        if(line<0||line>data.length||column<0||column>data[0].length||data[line][column]!='1')
            return;
        dfs(data,line-1,column);
        dfs(data,line+1,column);
        dfs(data,line,column-1);
        dfs(data,line,column+1);
time++;
return;
    }
}
