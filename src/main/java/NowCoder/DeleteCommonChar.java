package NowCoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//输入两个字符串，
// 从第一字符串中删除第二个字符串中所有的字符。
// 例如，输入”They are students.”和”aeiou”，
// '则删除之后的第一个字符串变成”Thy r stdnts.”
public class DeleteCommonChar {

    //思路：利用Set的不可重复
    public static String deleteComCha(String string1,String string2)
    {Set<Character> temp=new HashSet<>();
    for(char c:string2.toCharArray())
    {temp.add(c);}
        //遍历第一个字符串
        for (int i=0;i<string1.length();i++)
        {
           if(temp.add(string1.charAt(i))==false) {
                string1 = string1.substring(0, i) + string1.substring(i + 1, string1.length());
            i--;}
           else temp.remove(string1.charAt(i));
        }

    return string1;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       String string1=in.nextLine();
       String string2=in.nextLine();
//string1.contains()
       System.out.println(deleteComCha(string1,string2));
    }
}
