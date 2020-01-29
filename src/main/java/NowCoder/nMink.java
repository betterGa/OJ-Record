package NowCoder;

import java.util.Arrays;
import java.util.Scanner;

public class nMink {
    public static void main(String[] args) {
        //输入描述:
        //每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
        //不超过100。
        //
        //
        //输出描述:
        //输出n个整数里最小的k个数。升序输出

        Scanner in=new Scanner(System.in);
        String[] date=in.nextLine().split(" ");
        int[] intDate=new int[date.length];
        for(int i=0;i<date.length;i++)
        {
            intDate[i]=Integer.valueOf(date[i]);
        }
        int k=intDate[intDate.length-1];
        intDate=Arrays.copyOf(intDate,intDate.length-1);
        Arrays.sort(intDate);
        for (int j=0;j<k;j++)
        {System.out.print(intDate[j]+" ");}
        System.out.print(intDate[intDate.length-1]);
    }
}
