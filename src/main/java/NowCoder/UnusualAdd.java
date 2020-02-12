package NowCoder;

import java.util.*;

public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        //思路：利用位运算，
        // 异或：0^0=0,1^0=1,1^1=0
        //先将数字无进位相加
        //再用与运算0&0=0,1&0=0,1&1=1
        //将与运算的结果左移1位即可变为进位位
        //一直加到进位位为0结束计算
        int carry=(A&B)<<1;
        A=A^B;
        B=carry;
        while (B!=0)
        {carry=(A&B)<<1;
           A=A^B;
           B=carry;
        }
return A;
    }
}