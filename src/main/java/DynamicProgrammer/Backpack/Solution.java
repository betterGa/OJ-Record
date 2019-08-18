/*
背包问题  https://www.lintcode.com/problem/backpack-ii/description

用来存储价值的二维数组需要增加行和列。

状态方程：
如果A[i-1]>j,那么装不下，
value[i][j]=value[i-1][j]
比如，A={2,3,5,7}
当j=1时，2>1,物品大小大于背包大小，是放不下的，value[1][1]=value[0][1];
当A[i-1]<=j,可以装下，考虑是装还是不装：
如果不装，value[i][j]=value[i-1][j]
如果装，value[i][j]考虑上一个状态，还没装这个物品时，价值为value[i-1][j-A[i-1]],而此时的价值因为装上这个物品，加上V[i]
即：value[i][j]=value[i-1][j-A[i-1]]+V[i-1]

https://blog.csdn.net/qq_38410730/article/details/81667885
 */




package DynamicProgrammer.Backpack;

public class Solution {

    public int backPackII(int m, int[] A, int[] V) {
   int n=A.length;
  int value[][]=new int[n+1][m+1];
       for(int i=0;i<m+1;i++)
       {value[0][i]=0;}
       for(int j=0;j<n+1;j++)
       {value[j][0]=0;}
       for(int x=1;x<n+1;x++)
       { for(int y=1;y<m+1;y++)
       {
           if(A[x-1]>y)
           {//装不下
value[x][y]=value[x-1][y];
           }
           else  value[x][y]=Math.max(value[x-1][y],value[x-1][y-A[x-1]]+V[x-1]);
       }
}
return value[n][m];
}}
