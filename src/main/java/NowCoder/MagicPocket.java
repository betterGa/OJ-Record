package NowCoder;

//[编程题]神奇的口袋
//有一个神奇的口袋，总的容积是40，
// 用这个口袋可以变出一些物品，这些物品的总体积必须是40。
// John现在有n个想要得到的物品，每个物品的体积分别是a1，a2……an。
// John可以从这些物品中选择一些，如果选出的物体的总体积是40，
// 那么利用这个神奇的口袋，John就可以得到这些物品。
// 现在的问题是，John有多少种不同的选择物品的方式。

/*
 *思路：动态规划：建立 (n+1)*(40+1) 的表格dp
 * dp表示i中物品构成容积为j的方法数
 *重点在于dp公式的推导:
 * 若j>=items[?]，说明i种有机会构成j体积的物品，
 * 比如，当前是第3种物品，该物品对应的体积为30
 * 即items[?]=30,当j=35时，即需要求第3种物品构成35体积的方法数method(3,35)
 * 而第2种物品构成体积30的方法数为1，这时就需要知道构成35-30=5的方法数
 * method(3,35)=method(2,35-30)*第3种物品构成30体积这1种方法+
 *              method(2,35)*第3种物品构成0体积这1种方法。
 * 因此method(3,35)=method(2,35-30)+method(2,35)
 *则dp[i][j]=dp[i-1][j-items[?]]+dp[i-1][j]
 *若j<items[?]，说明新的第i种物品不足以单个构成j体积的物品，
 * 那么dp[i][j]=dp[i-1][j]*第i种物品构成0体积这1种方法。
 **/


import java.util.Scanner;

public class MagicPocket {
//输入的第一行是正整数n (1 <= n <= 20)，表示不同的物品的数目。
// 接下来的n行，每行有一个1到40之间的正整数，分别给出a1，a2……an的值。



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] items=new int[n];
        int[][]dp=new int[n+1][41];
        for(int i=0;i<n;i++)
        {
            items[i]=in.nextInt();
        }
System.out.println(kindsOfMethods(items,dp));
    }


    //传入每个物体的体积和dp数组
public static int  kindsOfMethods(int[] items,int[][] dp)
{
    //dp数组第一列均为1，因为第i种物品构成0的体积的方法数为1
    //因为后续如果遇到j=items[i-1]时
    //dp[i][j]=dp[i-1][j]*1(第i种物品构成0体积)
    // +dp[i-1][0]*1(第i种物品构成j体积)
    //这时的dp[i-1][0]应为1，所以第一列的所有数字(包括dp[0][0])都是1
    for(int i=0;i<dp.length;i++)
    {
        dp[i][0]=1;
    }
    for(int i = 1;i<dp[0].length;i++){
        dp[0][i] = 0;
    }
//遍历dp数组,为dp数组赋值
    //行
    for (int i=1;i<dp.length;i++)
        //列
    {  for(int j=1;j<dp[0].length;j++)
        {
            if(j>=items[i-1])
            {
                dp[i][j]=dp[i-1][j]+dp[i-1][j-items[i-1]];
            }
else dp[i][j]=dp[i-1][j];
        }
}
return dp[items.length][40];}



}
