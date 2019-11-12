package Search.BreadthFirstSearch;

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
