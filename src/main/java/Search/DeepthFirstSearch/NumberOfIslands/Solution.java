//LeetCode 200岛屿的数量
//遍历数组，遇到陆地"1"进入深度优先搜素
//需要计数启动深度优先搜索的根节点，一个根节点会对应它渲染开来的一个岛屿。
//深度优先搜索中需要把"1"改为"0",这样可以标识这块陆地是这个岛屿的。
//下一次遍历数组时，就不会把这块陆地纳入到别的岛屿中。
//
package Search.DeepthFirstSearch.NumberOfIslands;

public class Solution {
    int time;
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int line=grid.length;
        int column=grid[0].length;
        //遍历数组，遇到"1"进行深度优先搜索
        for(int i=0;i<line;i++)
            for(int j=0;j<column;j++)
            {
                if(grid[i][j]=='1') {time++;dfs(grid,i,j);}
            }
        return time;
    }
    public void dfs(char[][] data,int line,int column)
    {
        if(line<0||line>=data.length||column<0||column>=data[0].length||data[line][column]!='1')
            return;
        data[line][column]='0';

        dfs(data,line-1,column);
        dfs(data,line+1,column);
        dfs(data,line,column-1);
        dfs(data,line,column+1);
        return;
    }
}