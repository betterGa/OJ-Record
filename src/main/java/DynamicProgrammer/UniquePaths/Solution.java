/*
链接：https://www.nowcoder.com/questionTerminal/166eaff8439d4cd898e3ba933fbc6358?toCommentId=3530785
来源：牛客网
路径总数

运行时间：18ms占用内存：9280k。
设方法数为Method(i,j)其中，i为Start与Finish间隔的行数，j为列数。
那么，当第一步是向下走时，此时的方法数为Method(i-1,j);当第一步时向右走时，此时的方法数为Method(i,j-1)，
因此，状态方程为：Method(i,j)=Method(i-1,j)+Method(i,j-1);
需要注意的特殊情况是，当传入的参数m=1或n=1时，只有一种方法，m=1时，Start和Finish在同一列,只有一种方法，即向下走；
n=1时，同理......在一行......返回的结果是Method[m-1][n-1],
因此当i=0或j=0时需要单独讨论。初始状态为Method[0][0]=0。
 */
package DynamicProgrammer.UniquePaths;

public class Solution {
    public int uniquePaths(int m, int n) {
int method[][]=new int[m][n];
for(int i=0;i<m;i++)
        { for (int j=0;j<n;j++)
            if(i==0||j==0)
           method[i][j]=1;
        else
            method[i][j]=method[i][j-1]+method[i-1][j];}

return method[m-1][n-1];
    }
}


