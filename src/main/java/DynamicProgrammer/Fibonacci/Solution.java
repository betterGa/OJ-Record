package DynamicProgrammer.Fibonacci;

public class Solution {

    public int Fibonacci(int n)
    { int i=0;
        int[]data=new int[40];
        data[0]=0;
        data[1]=1;
        data[2]=1;
        for (;i<=n;i++)
            {
                if(i>2)
                {data[i]=data[i-1]+data[i-2];}}
        return data[n]; }}
