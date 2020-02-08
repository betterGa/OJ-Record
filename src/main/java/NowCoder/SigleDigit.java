package NowCoder;


//给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，
// 请编写程序统计每种不同的个位数字出现的次数。
// 例如：给定N = 100311，则有2个0，3个1，和1个3。

//输入描述:
//每个输入包含1个测试用例，即一个不超过1000位的正整数N。

import java.util.Scanner;

//输出描述:
//对N中每一种不同的个位数字，
// 以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的升序输出。

/*
public class SigleDigit {
    //思路：建个数组0~9用于统计次数M
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int[] times=new int[10];
        while (num>0)
        {
            int D=num%10;
            times[D]++;
            num=num/10;
        }
        for(int i=0;i<10;i++)
        {if(times[i]!=0)
        System.out.println(i+":"+times[i]);}
    }
}
*/

public class SigleDigit {
    //思路：建个数组0~9用于统计次数M
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       String str=in.nextLine();
        int[] times=new int[10];
        for(char c:str.toCharArray())
        {
        times[c-'0']++;
        }
        for(int i=0;i<10;i++)
        {if(times[i]!=0)
            System.out.println(i+":"+times[i]);}
    }}