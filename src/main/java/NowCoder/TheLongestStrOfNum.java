package NowCoder;

import java.util.ArrayList;
import java.util.Scanner;

public class TheLongestStrOfNum {


   //思路1：数字嘛，也就从0到9，那最长的数字串无非是“123456789”，
   // 先查字符串里有无此序列，再缩成"12345678"，
   // 看字符串里有无此序列......
    //如果缩到字符串长度为0了还没有，返回空串即可。
    public static String theLongestNum(String str) {
        String numStr="123456789";
        while (numStr.length()!=0) {
            if (str.contains(numStr))
                return numStr;
            else numStr=numStr.substring(0,numStr.length()-1);
        }
    return "";
    }

    //思路2：有个记长度的变量，当遇到字母时，长度需要重新置为0，
    //有个长度最大值max
    //遇到数字时长度+1，如果长度>max，需要把长度值赋给max
    public static String theLongestNum1(String str) {
    int max=0;
        int length=0;
        int end=0;//用于指示数字串最末
        char[] strToChar=str.toCharArray();
    for(int i=0;i<strToChar.length;i++)
    {
        //遇到数字
        if(str.charAt(i)>='0'&&str.charAt(i)<='9')
        {
            length++;
            if(length>max)
            {max=length;
            //换max值时end下标需要跟过来
                end=i;
            }
        }
        //不是数字，需要length重新赋为0
        else
        {length=0;}
    }
    //有max个数。
        return str.substring(end-max+1,end+1);



    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(theLongestNum1(in.nextLine()));
    }
}