package DynamicProgrammer.Fibonacci;

/*
已知第0项是0，第1项是1，第2项是1，接下来的项都满足值等于前两项的和。用整形数组保存已处理好的结果。
*/


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
