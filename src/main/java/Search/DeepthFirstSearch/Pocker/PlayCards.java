 import java.util.Scanner;
 /*
   * 有n个盒子排成一行
   * 有n张牌，上面数字分别为1-n
   * 将这n张牌放入n个盒子有多少种放法
   */

public class PlayCards {
     static int n;
     static int[] a = new int[10];
     static int[] book = new int[10];
     public static void main(String[] args){
                 Scanner scan = new Scanner(System.in);
                 n = scan.nextInt();
                 dfs(1);
                 return;
             }
             public static void dfs(int step){
              //递归完成的结束条件:如果站在第n+1个盒子前，则放置完成
                 if(step==n+1){
                         //输出放置的顺序
                         for(int i=1;i<=n;i++)
                         {System.out.print(a[i]+" "); }
                       System.out.println();
                         //必须要有return，出递归
                         return;
                     }
                 //面对第step个盒子，从牌1遍历下去，如果发现还在手中则放入盒子，标记，接着递归，再次标记返回上一层递归
                 for(int i=1;i<=n;i++){
                         if(book[i]==0){
                                 a[step] = i;
                                 book[i] = 1;
                                 dfs(step+1);
                                 book[i] = 0;
                             }
                  }
               return;
             }
 }