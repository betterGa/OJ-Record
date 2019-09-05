package Search.DeepthFirstSearch.SurroundedRegions;/*package Search.DeepthFirstSearch.SurroundedRegions;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    List<String> save=new ArrayList<>();


    public void judgeLeft(char[][]board,int i)
    {save.add(i+""+0);
        int row=board.length;

        if(board[i][1]=='O') save.add(i+""+1);
    }
    public void judgeRight(char[][]board,int i)
    {
        int col=board[0].length-2;
        int col1=board[0].length-1;
        save.add(i+""+col1);
        if(board[i][col]=='O') save.add(i+""+col);
    }
    public void judgeUp(char[][]board,int i)
    {save.add(0+""+i);
        if(board[1][i]=='O') save.add(1+""+i);
    }
    public void judgeDown(char[][]board,int i)
    { int row1=board.length-1;
        int row=board.length-2;
        save.add(row1+""+i);
        if(board[row][i]=='O') save.add(row+""+i);
    }




    public void solve(char[][] board) {
if(board.length==0||(board.length==1&&board[0].length==1)) return ;
        //左边界
for(int i=0;i<board.length;i++)
{ if(board[i][0]=='O'&&board[0].length>1) judgeLeft(board,i); }
//右边界
        for(int i=0;i<board.length;i++)
        { if(board[i][board[0].length-1] =='O'&&board[0].length>1) judgeRight(board,i); }
//上边界
        for(int i=0;i<board[0].length;i++)
        {if(board[0][i]=='O'&&board.length>1) judgeUp(board,i);}
//下边界
        for(int i=0;i<board[0].length;i++)
        {if(board[board.length-1][i]=='O'&&board.length>1) judgeDown(board,i);}

        for(int i=0;i<board.length;i++)
    for(int j=0;j<board[0].length;j++)
    {if(board[i][j]=='O'&&!save.contains(i+""+j))
    { board[i][j]='X'; }
    }


    }
}
*/

import java.util.ArrayList;
import java.util.List;

//以上对题目的理解有问题。比如测试中的data3，就出现了问题，第三行的'O'是不被围绕的，却被改成了'X'
//找被围绕的'O'不易，可以转换角度，找到不被围绕的'O'
// 应是从边界开始搜索，首先，边界如果有'O',这些'O'是一定不被围绕的
//自然，与边界相连的'O'也是不被围绕的
// 如果边界遇到了'O',就从当前坐标向上下左右四个方向搜索，如果也是'O',那么当前坐标也是不可能被围绕的
//再向上下左右进行搜索，直到遇到'X',回退
//在上下左右的搜索过程中，对每个坐标进行操作时，也会涉及回退，最后可保证每个的上下左右都被操作
public class Solution{
List<String> ifjudged=new ArrayList();
    public void judge(int[][]tag,char[][] board,int i,int j)
    {if(ifjudged.contains(i+""+j)==true) return;
        //如果当前坐标是'O',需要给tag数组标记为1,说明不能被包围
        if(board[i][j]=='O')
        {ifjudged.add(i+""+j);
        tag[i][j]=1;

        //上
            if(i>0)
            {if(board[i-1][j]=='O')judge(tag,board,i-1,j); }
            //下
            if(i<board.length-1)
            {if(board[i+1][j]=='O')judge(tag,board,i+1,j); }
        //左
    if(j>0)
    {if(board[i][j-1]=='O')judge(tag,board,i,j-1); }
    //右
if(j<board[0].length-1)
{if(board[i][j+1]=='O')judge(tag,board,i,j+1); }}
    return;}


    public void solve(char[][] board) {
ifjudged.clear();
            if(board.length==0||(board.length==1&&board[0].length==1)) return ;
        int[][]tag=new int[board.length][board[0].length];
            //左边界
            for(int i=0;i<board.length;i++)
            { if(board[i][0]=='O'&&board[0].length>1) judge(tag,board,i,0); }
//右边界
            for(int i=0;i<board.length;i++)
            { if(board[i][board[0].length-1] =='O'&&board[0].length>1) judge(tag,board,i,board[0].length-1); }
//上边界
            for(int i=0;i<board[0].length;i++)
            {if(board[0][i]=='O'&&board.length>1) judge(tag,board,0,i);}
//下边界
            for(int i=0;i<board[0].length;i++)
            {if(board[board.length-1][i]=='O'&&board.length>1) judge(tag,board,board.length-1,i);}
for(int i=0;i<board.length;i++)
    for(int j=0;j<board[0].length;j++)
    {if(tag[i][j]==0&&board[i][j]=='O')
    {board[i][j]='X';}}

        }
}