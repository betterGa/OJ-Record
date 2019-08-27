package Search.DeepthFirstSearch.Pocker;/* import java.util.Scanner;
 /*
   * 有n个盒子排成一行
   * 有n张牌，上面数字分别为1-n
   * 将这n张牌放入n个盒子有多少种放法


public class PlayCards {
     static int n;
     static int[] a = new int[10];
     static int[] book = new int[10];
     public static void main(String[] args){
                 Scanner scan = new Scanner(System.in);
                 n = scan.nextInt();
                 dfs(1);
             }

             public static void dfs(int step){
              //递归完成的结束条件:如果站在第n+1个盒子前，则放置完成
                 if(step==n+1){//输出放置的顺序
                         for(int i=1;i<=n;i++)
                         {System.out.print(a[i]+" "); }
                       System.out.println();
                         //必须要有return，出递归
                         return; }
                 //面对第step个盒子，从牌1遍历下去，如果发现还在手中则放入盒子，标记，接着递归，再次标记返回上一层递归
                 for(int i=1;i<=n;i++){
                         if(book[i]==0){//看牌。  若book[i]==0说明手里有这张牌，可以放在箱子里
                                 a[step] = i;//把i号牌放到step号箱子中
                                 book[i] = 1;
                                 dfs(step+1);
                        book[i] = 0; }}
               return;
             }
 }
 //https://www.cnblogs.com/yjd_hycf_space/p/7483471.html
*/


/*
自己写一下深度优先搜索，n个盒子放n张牌
*/

import java.util.Scanner;

public class PlayCards
{
  private int[]book=new int[10];//用于标识该牌是否被放到盒子中，若被放下，值为1，没被放仍在手中，值为0
  private  int[]a=new int[10];//用于存放盒子对应的牌号码
private int n=4;
    public void putInto(int box)//对应第box个盒子放扑克牌的规则
    {
        if(box==n+1)
        //走到尽头，需要输出当前放置方案
        {for(int i=1;i<=n;i++)
        {System.out.print(a[i]);}
        System.out.println();//每输出一组方案，需要换行一下
            return;//return用于回退
        }

        //按把手里的牌按从小到大顺序放入盒子中
        for(int j=1;j<=n;j++)
        {if(book[j]==0)
        //该牌还在手里，可以放
        {
            a[box] =j;
            book[j]=1;//改标识，说明该牌已被放入盒
        //接下来需要去访问下一个盒子
            putInto(box+1);
        //在访问下一个盒子后需要写的是回退以后的操作
        //回退以后首先需要把当前盒子里的牌收回
            book[box]=0;}}
        //遍历完牌发现没牌可放再回退，用return
            return;
        }
}