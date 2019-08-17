
package DynamicProgrammer.Backpack;

public class Solution {

    public int backPackII(int m, int[] A, int[] V) {
   int n=A.length;
  int value[][]=new int[m][n];
       for(int i=0;i<m;i++)
       {value[0][i]=0;}
       for(int j=0;j<n;j++)
       {value[j][0]=0;}
       int capacity=0;
       for(int x=1;x<n;x++)
       { for(int y=1;y<m;y++)
       {capacity=capacity+A[x];
           if(capacity>m)
           {
value[x][y]=value[x-1][y];
           }
           else  value[x][y]=Math.max(value[x-1][y],value[x-1][y-A[x]]+V[x]);
       }
}
return value[m][n];
}}
