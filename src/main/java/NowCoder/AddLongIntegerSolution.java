package NowCoder;


// 请设计一个算法完成两个超长正整数的加法。

import java.util.Scanner;

/*
 请设计一个算法完成两个超长正整数的加法。
 输入参数：
 String addend：加数
 String augend：被加数
 返回值：加法结果
 */
public class AddLongIntegerSolution {


     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         while (in.hasNext())
         { String addend=in.nextLine();
         String augend=in.nextLine();
         System.out.print(new AddLongIntegerSolution().AddLongInteger(addend,augend));}
     }
     //思路：拆成各个位相加，先做无进位加法
     //最后再加上进位
     public  String AddLongInteger(String addend, String augend) {
         int digits=Math.max(addend.length(),augend.length());
         char[] addends=null;
         char[] augends=null;
         if(addend.length()==digits) {
            addends = addend.toCharArray();
             String zeros="";
         for(int i=0;i<digits-augend.length();i++)
         {zeros=zeros+"0";}
        augends=(zeros+augend).toCharArray();
         }
         else
         {
          augends = augend.toCharArray();
         String zeros="";
         for(int i=0;i<digits-addend.length();i++)
         {zeros=zeros+"0";}
       addends=(zeros+addend).toCharArray();
     }

char[] result=new char[digits];
         int carry=0;
         for(int i=digits-1;i>=0;i--)
         {
             int origin=addChars(addends[i],augends[i])+carry;
if(origin>9)
{result[i]=(char)(origin-10+'0');
carry=1;}
else result[i]=(char) ('0'+origin);
         }

String finalR="";
         if(carry==1)
             finalR="1";
for(int i=0;i<digits;i++)
{
    finalR=finalR+result[i];
}
         return finalR;
     }
public static int addChars(char c1,char c2)
{
    return c1-'0'+c2-'0';
}
 }
