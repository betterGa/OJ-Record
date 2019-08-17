package DynamicProgrammer.UniquePaths2;/*
package DynamicProgrammer.UniquePaths2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length=obstacleGrid.length;
        int width=obstacleGrid[0].length;
    int[][]method=new int[length][width];


    if(obstacleGrid[0][0]==1||obstacleGrid[length-1][width-1]==1)return 0;



    if(length==1&&width==1)
    {if(obstacleGrid[0][0]==0)return 1; else return 0;}
if(length==1&&width>0)
{if(obstacleGrid[0][0]==0&&obstacleGrid[0][1]==0) return 1;
else return 0;}

if(width == 1&&length>0)
{if(obstacleGrid[0][0] == 0 && obstacleGrid[1][0] == 0)
    return 1;
    else return 0;}

        for (int i = 0; i < length; i++)
            for (int j = 0; j < width; j++)
            {if(i==0&&j==0) method[i][j]=0;
                else{if (i == 0&&j!=0) {if(obstacleGrid[i][j]!=1)method[i][j] = 1; else method[i][j]=0;}
                else {
                    if (j == 0&&i!=0){if(obstacleGrid[i][j]!=1)method[i][j] = 1; else method[i][j]=0;}
                    else {
                        if (obstacleGrid[i][j] == 1) {
                            method[i - 1][j] = 0;
                            method[i][j - 1] = 0;
                        } else method[i][j] = method[i - 1][j] + method[i][j - 1];
                    }}
                }
            }


return method[length-1][width-1];




    }
}
*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length = obstacleGrid.length;
        int width= obstacleGrid[0].length;
        int[][] dp = new int[length][width];
        for (int i = 0; i < length&& obstacleGrid[i][0] != 1; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j <width && obstacleGrid[0][j] != 1; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < width; j++) {
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[length - 1][width - 1];
    }
}

*/





/*
链接：https://www.nowcoder.com/questionTerminal/3cdf08dd4e974260921b712f0a5c8752?f=discussion&toCommentId=3550403
来源：牛客网
最小路径和

与上一道路径总数思路相同，先写状态方程：
M(x,y)=M(x-1,y)+M(x,y-1)。
  而如果坐标(x,y)处有障碍，那么从(0,0)到达(x,y)处的路径数为0，
  而需要注意是，如果矩阵的边边处(i==0或j==0)有障碍，那么该边障碍及以后的元素的方法数都应置为0，（如果不这么置，矩形边边元素赋值时将会报错数组越界。）
  后续再用状态方程求方法数。
   如{0,0}
     {1,1}
     0,0}的Method数组应是：{{0,0},
                           {0,0}
                           {0,0}};

       {0,0}
       {1,0}的Method数组应是： 先是{0,1}
                                   {0,0},       再由状态方程，锝Method数组为：{0,1}
                                                                              {0,1}
    而边边元素的赋值应分别遍历 i 和 j ，首先数组元素的默认值为0，因此，当遍历到的obstacleGrid[i][j]为0时，才给Method[i][j]赋值为1，
    一旦边边有障碍物，该行都为0；可以写成：
for(int i=0;i<length&&obstacle[0][i]==0;i++)
    method[i][j]=1;
  那么，一旦出现obstacle[i][j]==1,就不会进循环，那么Method元素的值就为默认值0。
  或者写成
for(int i=0;i<length;i++)
{if(obstacle[i][0]==0) method[i][0]=1;
 else break; }
  一旦有障碍，障碍和后面的都跳出循环，即为默认值0.。

 */








public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length = obstacleGrid.length;
        int width = obstacleGrid[0].length;
int[][]method=new int[length][width];
int lflag=0;
int wflag=0;
//obstacleGrid矩阵边边全为 0 时，赋值为1；遇到边边有障碍，它以后的值为默认值0，不需要赋值。
for(int i=0;i<length;i++)
{if(obstacleGrid[i][0]==0) method[i][0]=1;
else break;}

for(int j=0;j<width;j++)
{if(obstacleGrid[0][j]==0) method[0][j]=1;
else break;}





for(int i=1;i<length;i++)
{    for(int j=1;j<width;j++)
    {
        if(obstacleGrid[i][j]==1) method[i][j]=0;
        else method[i][j]=method[i-1][j]+method[i][j-1];
    }}

return method[length-1][width-1];



    }}