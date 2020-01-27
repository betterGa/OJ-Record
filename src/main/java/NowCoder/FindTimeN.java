package NowCoder;

import java.util.Arrays;
import java.util.Scanner;

//输入n个整数，输出出现次数大于等于数组长度一半的数。
//每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
public class FindTimeN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       String[] dateStr=in.nextLine().split(" ");
       int[] date=new int[dateStr.length];
       for(int i=0;i<dateStr.length;i++)
       {
        date[i]=Integer.valueOf(dateStr[i]);
    }
        Arrays.sort(date);
       System.out.println(date[date.length/2-]);

}
