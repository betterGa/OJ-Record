package NowCoder;

//测试输入包含若干测试用例，每个测试用例的格式为

//
//第1行：N
//第2行：N名学生的成绩，相邻两数字用一个空格间隔。
//第3行：给定分数
//
//当读到N=0时输入结束。其中N不超过1000，成绩分数为（包含）0到100之间的一个整数。
import java.util.*;
public class TheSameScore
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNextInt())
        {
          int N=in.nextInt();
            if(N==0) return;
          int[] scores=new int[N];
          for(int i=0;i<N;i++)
          {
scores[i]=in.nextInt();
          }
int score=in.nextInt();
          int count=0;
          for(int i=0;i<N;i++)
          {if(scores[i]==score) count=count+1;}
          System.out.println(count);
        }
    }
}
