package NowCoder;
import java.util.*;
//有多组测试用例，每一组第一行输入一个正整数N（0<N<10），第二行包括N个正整数，范围为1到9。
public class ArrivalOfTrain
{
    static int[]flag;
    static int[] train;
    static int[] result;
    static int N;
    static int[] sort;
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
while (in.hasNext())
{
N=in.nextInt();
train=new int[N+1];
result=new int[N+1];
flag=new int[N+1];
sort=new int[N+1];
for(int i=1;i<=N;i++)
{train[i]=in.nextInt();
sort[i]=i;}
Sout(1);

    }}
    //深度优先搜索

    public static void Sout(int i)
    {if(i==N+1&&IsSuitable(train,result))
    {
        for(int k=1;k<=N;k++)
        {System.out.print(result[k]+" ");}
System.out.println();
        return;
    }
        for(int j=1;j<=N;j++)
        {
            if(flag[j]==0)
            {
                result[i]=sort[j];
                flag[j]=1;
                Sout(i+1);
                flag[j]=0;
            }
        }

return;
    }

    public static boolean IsSuitable(int[] sample,int[] test)
    {
        Stack<Integer> stack=new Stack<>();
        int length=sample.length;
        int index=1;
        for(int i=1;i<length;i++)
        {
            stack.add(sample[i]);
            while (!stack.isEmpty()) {
                if (stack.peek() == test[index]) {
                    stack.pop();
                    index++;
                }
                else break;
            }

    }
    while (!stack.isEmpty())
    {
    if(stack.peek()==test[index])
    {stack.pop();
    index++;}
    else return false;
    }
    return true;
    }

}
