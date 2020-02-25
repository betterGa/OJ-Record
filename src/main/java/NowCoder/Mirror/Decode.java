package NowCoder.Mirror;
import java.util.*;
public class Decode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNextLine())
        {
            String str=in.nextLine();
          get(str);
        }
    }

    public static void get(String str)
    {String s="VWXYZABCDEFGHIJKLMNOPQRSTU";
    char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++)
        {if(chars[i]==' ')  System.out.print(" ");
else System.out.print(s.charAt((chars[i]-'A'+26)%26));
        }
    }
}
