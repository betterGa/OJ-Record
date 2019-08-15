/*
三角矩阵

链接：https://www.nowcoder.com/questionTerminal/2b7995aa4f7949d99674d975489cb7da?f=discussion&toCommentId=3524154
来源：牛客网

题里的矩阵是这样的：
      [2]
    [3] [4]
  [6] [5] [7]
[4] [1] [8] [3]
设从（0，0）到（i,j）的最短路径和为Sum(i,j)，当j != 0和i != j时，(也就是三角形除边以外中间的元素)，到达（i,j）有两种路径，一种是从(i-1,j-1)到（i,j）,另一种是从(i-1,j)到(i,j),
那么Sum(i,j)=min(Sum(i-1,j)+triangle(i,j),Sum(i-1,j-1)+triangle(i,j))。
而初始状态是Sum(0,0)=triangle(i,j)。需要注意的
是，每行第一个，也就j=0，到(i,j)只有一条路径，即：Sum(i,j)=Sum(i-1,0)+triangle(i,j);还有当i=j，也就是每行最后一个，到（i,j）也是只有一条路径，即：Sum(i,j)=Sum(i-1,i-1)。这两种情况应该分别讨论。
最后在Sum(triangle.size)中找最小值，即为最短路径和。
 */



package DynamicProgrammer.Triangle;

import  java.util.ArrayList;

public class Solution {

  public int minimumTotal(ArrayList<ArrayList<Integer>> triangle)
    {
        int size=triangle.size();
int[][]min=new int[size][size];
min[0][0]=triangle.get(0).get(0);
        int result=0;
for(int i=1;i<size;i++)
{for(int j=0;j<i+1;j++)
    if(j>0&&i!=j)
    {min[i][j]=Math.min(min[i-1][j-1]+triangle.get(i).get(j),min[i-1][j]+triangle.get(i).get(j));}
    else{ if(j==0) {min[i][j]=min[i-1][j]+triangle.get(i).get(j);}
else min[i][j]=min[i-1][j-1]+triangle.get(i).get(j);}
}
result=min[size-1][0];
for(int m=0;m<size;m++)
{if(min[size-1][m]<result)
    result=min[size-1][m];}
return result;
    }
    }




