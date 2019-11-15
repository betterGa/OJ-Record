package Search.BreadthFirstSearch.RottingOrange;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    class coor2d
    {int x;
    int y;
    public coor2d(int x,int y)
    {this.x=x;
    this.y=y;
    }
    }

    int time=0;
    //队列实现深度优先搜索
    Queue<coor2d> queue=new LinkedList();

    public int orangesRotting(int[][] grid) {



        //是否经过判断

        //遍历二维数组，遇到腐烂橘子进队
        //行
        int row=grid.length;
        //列
        int column=grid[0].length;
        for(int i=0;i<row;i++)
        {    for(int j=0;j<column;j++)
            { if(grid[i][j]==2)
                {
                    //第一个腐烂橘子入队
                    coor2d firstOrange=new coor2d(i,j);
                    queue.add(firstOrange);
                i=row+1;j=column+1;
            }}
    }
    //广度优先搜索——当队列不为空时
        //与迷宫思路类似
while (!queue.isEmpty())
{
    //保存队头
    coor2d head=queue.peek();
    int nowX=head.x;
    int nowY=head.y;

//为上下左右四个清空设置数组
    int[][]direction=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    int size=queue.size();

    for(int i=0;i<4;i++)
    { int afterX=nowX+direction[i][0];
        int afterY=nowY+direction[i][1];
        if(afterX>=row||afterX<0||afterY>=column||afterY<0)
        {continue;}
        //使上下左右橘子腐烂
        if(grid[afterX][afterY]==1)
        {
            //有新鲜的可以被腐坏
            grid[afterX][afterY]=2;
        //使上下左右腐烂橘子进队
            coor2d nowOrange=new coor2d(afterX,afterY);
        queue.add(nowOrange);
        }

    }
    if(size!=queue.size())time++;
    //队头出队
    queue.poll();


    }

    //遍历二维数组看是否烂透了
        for(int i=0;i<row;i++)
        { for (int y=0;y<column;y++)
            {
                if(grid[i][y]==1) time=-1;

            }
        }

 return time;

    }
}



