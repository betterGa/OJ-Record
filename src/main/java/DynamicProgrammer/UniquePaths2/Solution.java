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

/*
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length=obstacleGrid.length;
        int width=obstacleGrid[0].length;
        int[][]method=new int[length][width];
        for(int i=0;i<length;i++)
        {for(int j=0;j<width;j++)
            {
                if(obstacleGrid[0][0]==1||obstacleGrid[length-1][width-1]==1)
                    return 0;

                if(i==0||j==0)
                {if(obstacleGrid[i][j]!=1)
                {method[i][j]=1;}
else {method[i][j]=0;if(length==1||width==1) break; }}
else
                { if(obstacleGrid[i][j]==1) method[i][j]=0;
   else method[i][j]=method[i-1][j]+method[i][j-1];
                }}}
    return method[length-1][width-1];
    }}
*/