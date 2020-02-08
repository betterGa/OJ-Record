package NowCoder;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<=1) {System.out.println(0);return;}
        //构造fibonacci数组
        int[] fibonacci=new int[n];
        fibonacci[0]=0;
        fibonacci[1]=1;
        int flag=0;
        for (int i=2;i<n;i++)
        {fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        if(fibonacci[i-1]<=n&&fibonacci[i]>=n)
        {flag=i;
            break;
        }}
        int min=n-fibonacci[flag-1]<fibonacci[flag]-n?fibonacci[flag-1]:fibonacci[flag];
      System.out.println(Math.abs(n-min));




    }
}
