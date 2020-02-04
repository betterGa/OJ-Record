package NowCoder;

//输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,
// 所以答案为2
//输入描述:
//输入为一行，n(1 ≤ n ≤ 1000)

import java.util.Scanner;

//输出描述:
//输出一个整数,即题目所求
public class HowManyZeros {

    //思路：
    //这道题主要是要发现：末尾0是由偶数*5得到的，而偶数个数很多，我们可以找5的个数，
    // 当前n=5的倍数，最小5起步，它之前一定能找到偶数，
    // （不愁偶数或2 的个数，5的倍数中间隔4隔数，一定可以分解出偶数 或2的。）
    // 每个偶数*5可以得到末尾1个0，而（偶数*5）*（偶数*5）可以得到末尾2个0 ，
    // 同理，（偶数*5）*（偶数*5）*（偶数*5）可以得到末尾3个零，也就是说，
    //从当前数字n一直到1 ，可以得到的“5”的个数之和，就是末尾0的个数。
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int zeros=0;

        for(int i=n;i>0;i--)
        {
            int m=i;
            while (m%5==0)
            {
                zeros++;
                m=m/5;
            }
        }
        System.out.println(zeros);


    }
}
