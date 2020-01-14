package NowCoder;
//统计回文

import java.util.Scanner;

/**链接：https://www.nowcoder.com/questionTerminal/9d1559511b3849deaa71b576fa7009dc
        来源：牛客网

 “回文串”是一个正读和反读都一样的字符串，
 比如“level”或者“noon”等等就是回文串。
 花花非常喜欢这种拥有对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。
 现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。
 你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。
 如果字符串B插入的位置不同就考虑为不一样的办法。
        例如：
        A = “aba”，B = “b”。这里有4种把B插入A的办法：
        * 在A的第一个字母之前: "baba" 不是回文
        * 在第一个字母‘a’之后: "abba" 是回文
        * 在字母‘b’之后: "abba" 是回文
        * 在第二个字母'a'之后 "abab" 不是回文
        所以满足条件的答案为2
 */
public class StatisticalPalindrome {
//思路：需要一个方法判断是否回文串
    //将字符串视为char数组，从前向后从后向前遇到不一样的就说明不是回文串
    //(也可以不拆，直接用charAt() )
    public static boolean isPalindrome(String str)
    {
        char[] split=str.toCharArray();
        int start=0;
        int end=split.length-1;
        while (start<end)
        {
            if(split[start]!=split[end])
            {return false;}
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
        //读输入数据
        Scanner in=new Scanner(System.in);
        while (in.hasNext())
        {
            String s1=in.nextLine();
            String s2=in.nextLine();
            int method=0;
            //将s2插入s1
           for(int i=0;i<=s1.length();i++)
           {
               StringBuilder newStr=new StringBuilder(s1);
               newStr.insert(i,s2);
               if(isPalindrome(newStr.toString())) method++;
           }
           System.out.println(method);
        }

    }



}
