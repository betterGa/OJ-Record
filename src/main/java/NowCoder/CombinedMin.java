package NowCoder;

//给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
        // 目标是使得最后得到的数尽可能小（注意0不能做首位）。例如：

        //给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。

        //现给定数字，请编写程序输出能够组成的最小的数。




import java.util.*;

//每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，
// 顺序表示我们拥有数字0、数字1、……数字9的个数。
// 整数间用一个空格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。
public class CombinedMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] times=in.nextLine().split(" ");
  String result="";
    for(int i=0;i<10;i++)
    { //遍历输入用例，遇到数字出现次数不为 0 的情况
    {//转换成整数
        int time=Integer.valueOf(times[i]);
        for(int j=0;j<time;j++)
          result=result+i;}
    }

    if(!times[0].equals("0"))
//如果有0，需要把第一个不为0的数与第一个0交换，即可得到最小数
    { String origin=result;
    String zeros="";
        int zeroTime=Integer.valueOf(times[0]);
String  start= String.valueOf(result.charAt(zeroTime));
for(int i=0;i<zeroTime;i++)
{
 zeros="0"+zeros;
}
  result=start+zeros+result.substring(zeroTime+1,result.length());
    }
    System.out.println(result);


    }



}
