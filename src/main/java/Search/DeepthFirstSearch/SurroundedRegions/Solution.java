package Search.DeepthFirstSearch.SurroundedRegions;

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
        //左边界
for(int i=0;i<board.length;i++)
{ if(board[i][0]=='O') judgeLeft(board,i); }
//右边界
        for(int i=0;i<board.length;i++)
        { if(board[i][board[0].length-1] =='O') judgeRight(board,i); }
//上边界
        for(int i=0;i<board[0].length;i++)
        {if(board[0][i]=='O') judgeUp(board,i);}
//下边界
        for(int i=0;i<board[0].length;i++)
        {if(board[board.length-1][i]=='O') judgeDown(board,i);}
for(int i=0;i<board.length;i++)
    for(int j=0;j<board[0].length;j++)
    {if(board[i][j]=='O'&&!save.contains(i+""+j))
    { board[i][j]='X'; }
    }


    }
}