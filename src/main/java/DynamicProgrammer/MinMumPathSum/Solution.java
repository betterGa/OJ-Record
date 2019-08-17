/*
链接：https://www.nowcoder.com/questionTerminal/23462ed010024fcabb7dbd3df57c715e?f=discussion&toCommentId=3551785
来源：牛客网
最小路径和

和之前的路径和一样，状态方程为：中间矩形的路径和
Sum(i,j)=Min(Sum(i-1,j)+grid[i][j],Sum(i,j-1)+grid[i][j])
边边( i=0或j=0),如i=0时，路径和为Sum(0,j)=Sum(0,j)+grid[i][j]
 */

package DynamicProgrammer.MinMumPathSum;

public class Solution {
    public int minPathSum(int[][] grid) {
        int length=grid.length;
        int width=grid[0].length;
        int[][]sum=new int[length][width];
        sum[0][0]=grid[0][0];
        for(int i=1;i<length;i++)
        { sum[i][0]=sum[i-1][0]+grid[i][0]; }
        for(int j=1;j<width;j++)
        {sum[0][j]=sum[0][j-1]+grid[0][j];}
        for(int m=1;m<length;m++)
        {    for(int n=1;n<width;n++)
            {
                sum[m][n]=Math.min(sum[m-1][n]+grid[m][n],sum[m][n-1]+grid[m][n]);
            }}
            int min=sum[length-1][0];
            for(int x=0;x<width;x++)
            {if(sum[length-1][x]<min) min=sum[length-1][x];}
    return sum[length-1][width-1];}
}
