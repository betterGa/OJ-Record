package NowCoder;

import java.util.*;

public class shuffle {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=0;i<n;i++)
{
    int num=in.nextInt()*2;
    int [] origin=new int[num];
    int [] result=new int[num];
    int times=in.nextInt();
    for(int j=0;j<num;j++)
    {origin[j]=in.nextInt();}
    for (int k=0;k<times;k++)
    {origin=shuffleOnce(origin);
    }
    result=origin;
    for(int m=0;m<num;m++)
    {if(m==0) {System.out.print(result[m]);}
    else  {System.out.print(" ");
        System.out.print(result[m]);}

    }
    System.out.println();
}
    }
    public static int[] shuffleOnce(int[] origin)
    {
        int length=origin.length;
        int right=length-1;
        int left=(length-1)/2;
        int[] resuilt=new int[length];
        for(int i=0;i<length;i=i+2)
        {int r=length-1-i;
            resuilt[r--]=origin[right--];
        resuilt[r]=origin[left--];}
        return resuilt;
    }
}
