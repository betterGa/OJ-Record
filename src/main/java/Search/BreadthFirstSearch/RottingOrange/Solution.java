package Search.BreadthFirstSearch.RottingOrange;

import java.util.*;

public class Solution {
    class coor2d
    {int x;
        int y;

        public coor2d(int x, int y)
        {this.x=x;
            this.y=y;}
    }

    int time=0;
    //队列实现深度优先搜索
    Queue<coor2d> queue=new LinkedList();
    boolean flag=false;
    public int orangesRotting(int[][] grid) {
        //遍历二维数组，遇到腐烂橘子进队
        //行
        int row=grid.length;
        //列
        int column=grid[0].length;
        //遍历二维数组，遇到腐烂橘子就进队，不是说找到一个腐烂橘子就可以退出循环了，是所有的腐烂橘子都需要进队
        //注意“同时性”，不是一个一个挨个腐烂，是几个橘子同时腐烂
        for(int i=0;i<row;i++)
        {    for(int j=0;j<column;j++)
        { if(grid[i][j]==2)
            queue.add(new coor2d(i,j));
        }}
        //广度优先搜索——当队列不为空时
        //与迷宫思路类似
        while (!queue.isEmpty())

        {

            //设置为没遇到新鲜橘子
            flag=false;
            //与二叉树的层次遍历思路类似
            //先获取当前队列长度，即循环次数,这几个橘子是同时腐烂的
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                //保存队头并使队头出队
                coor2d head= queue.poll();;
                int nowX=head.x;
                int nowY=head.y;
//为上下左右四个清空设置数组
                int[][]direction=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
                for(int j=0;j<4;j++)
                { int afterX=nowX+direction[j][0];
                    int afterY=nowY+direction[j][1];
                    if(afterX>=row||afterX<0||afterY>=column||afterY<0)
                    {continue;}

                    if(grid[afterX][afterY]!=1) continue;
                    //使上下左右新鲜橘子腐烂
                    if(grid[afterX][afterY]==1)
                    {flag=true;
                        //有新鲜的可以被腐坏
                        grid[afterX][afterY]=2;
                        //使上下左右腐烂橘子进队
                        coor2d nowOrange=new coor2d(afterX,afterY);
                        queue.add(nowOrange);
                    }
                }}

            if(flag==true)
            {time=time+1;}
        }

        //遍历二维数组看是否烂透了
        for(int i=0;i<row;i++)
        { for (int y=0;y<column;y++)
        {
            if(grid[i][y]==1) {time=-1;
                y=column;i=row;}
        }
        }

        return time;

    }
}



