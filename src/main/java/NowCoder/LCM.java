package NowCoder;

import java.util.Scanner;

//最小公倍数
//正整数A和正整数B的最小公倍数是指能被A和B整除的最小的正整数值，
// 设计一个算法，求输入A和B的最小公倍数。
public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        for (int i = 1; i <=A*B; i++) {
            if (i % A == 0 && i % B == 0)
            {System.out.println(i);break;}
        }
    }
}