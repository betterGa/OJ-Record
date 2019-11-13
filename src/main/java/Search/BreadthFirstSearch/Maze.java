package Search.BreadthFirstSearch;/*package Search.BreadthFirstSearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;

//广度优先搜索，迷宫
//用当前位置带出新的位置——二叉树的层序遍历——队列——先进先出
public class Maze {

    //封装横纵坐标
    class pointCoo
    {

        int x;
        int y;


public pointCoo(int x,int y){this.x=x;this.y=y;}}

    public boolean bfs(int[][] coo2d,int entranceX,int entranceY,int targetX,int targetY)

    {//能否走到出口
        boolean flag=false;
        //行
        int row=coo2d.length;
        //列
        int column=coo2d[0].length;

        //是否走过,默认值0标识没有走过
        int[][] ifThrough=new int[row][column];

        //四个方向
        int[][] direction=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};

        Queue<pointCoo> queue=new ArrayDeque<>();

        //入口入队
        ((ArrayDeque<pointCoo>) queue).push(new pointCoo(entranceX,entranceY));

        //当队不为空
        while (!queue.isEmpty())
        {
            //注意！！！！！如果此时flag=true,退出即可
            if(flag) break;

            //获取当前队头的横纵坐标
            int xNow=((ArrayDeque<pointCoo>) queue).getFirst().x;
            int yNow=((ArrayDeque<pointCoo>) queue).getFirst().y;

            //标记为走过并出队
ifThrough[xNow][yNow]=1;
            queue.poll();



            //上下左右
            for(int i=0;i<4;i++)
            {
                //获取队头上下左右的横纵坐标
                int xAf=xNow+direction[i][0];
                int yAf=yNow+direction[i][1];

                //如果坐标越界，退出循环
                if(xAf>=row||yAf>=column||xAf<0||yAf<0){continue;}

                //如果坐标可以通过，且没有走过
                if(coo2d[xAf][yAf]==0&&ifThrough[xAf][yAf]==0)
                    //这该点坐标入队，以带出新的点
                {
                    ((ArrayDeque<pointCoo>) queue).push(new pointCoo(xAf, yAf));



                    //注意！！！！！这里除了入队以带出新的点，还需要标记为已走过

                    ifThrough[xAf][yAf]=1;
                }



                //遇到障碍——可以不要这一步，自然就继续continue了。
                if(coo2d[xAf][yAf]==1) continue;

                //到达出口
                if(xAf==targetX&&targetY==targetY) {flag=true;break;}

            }

        }

return flag;
    }

}
*/

import java.util.ArrayDeque;
import java.util.Queue;

//再写一遍迷宫
//给定入口，出口，遇"0"可以通过，遇"1"是障碍不可以通过
public class Maze
{
    //封装二维坐标
    class coor2D
    {int x;
    int y;
    public coor2D(int x,int y)
    {this.x=x;
    this.y=y;}
    }

    //广度优先搜索——二叉树的层次遍历——当前点带出新的点——队列
    //传入迷宫阵，入口坐标，出口坐标，返回是否能出
    public boolean bfs(int[][] maze,int startX,int startY,int destX,int destY)
    {
boolean flag=false;
        Queue<coor2D> queue=new ArrayDeque<>();

        //行
        int row=maze.length;
        //列
        int column=maze[0].length;

        //新建二维数组判断是否走过坐标,初始为默认值0，表示没有走过，"1"表示已走过
int[][]ifThrough=new int[row][column];

//先让入口坐标入队
((ArrayDeque<coor2D>) queue).push(new coor2D(startX,startY));

//为上下左右情况创建数组
        int[][]direction=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        //当队不为空时进行广度优先搜索
        while (!queue.isEmpty())
        {//获取队头并出队
            int curX=queue.poll().x;
            int curY=queue.poll().y;
            //已走到出口，可以之间return true。
            if(curX==destX&&curY==destY)
            {return true; }
            //标记为已走过
            ifThrough[curX][curY]=1;

            //遍历上下左右
            for(int i=0;i<4;i++)
            {
                int afterX=curX+direction[i][0];
                int afterY=curY+direction[i][1];
//如果当前坐标非法，continue
                if(afterX<0||afterX>=row||afterY<0||afterY>=column)
                {continue;}

                //如果当前坐标处可以通过且没走过
                if(maze[afterX][afterY]==0&&ifThrough[afterX][afterY]==0)
                {
                    //将它入队
                    ((ArrayDeque<coor2D>) queue).push(new coor2D(afterX,afterY));
                }
                //当前坐标有障碍，不能通过
                if(maze[afterX][afterY]==1) continue;

            }
        }
        return false;
    }
}


