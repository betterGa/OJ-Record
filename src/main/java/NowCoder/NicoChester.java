package NowCoder;
import java.util.*;
public class NicoChester {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
    System.out.println(new NicoChester().GetSequeOddNum(m));}

        public String GetSequeOddNum(int m)
        {  String result="";
            int start=m*m-(m-1);
        for(int i=0;i<m;i++)
        {result=result+start;
        if(i==m-1) break;
        start=start+2;
      result=result+"+";}
      return result;
    }
}
