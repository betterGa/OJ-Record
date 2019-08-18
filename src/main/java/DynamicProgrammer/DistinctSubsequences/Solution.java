/*
链接：https://www.nowcoder.com/questionTerminal/ed2923e49d3d495f8321aa46ade9f873?toCommentId=3565782
来源：牛客网

java实现，动态规划算法。
设S到第i个字母能匹配的T到第j个字母的个数为num[i][j],
像之前编辑距离的题一样，需要拓展行和列，表示空串，
任何字符串匹配搭配空串的个数为1，空串匹配到任何字符串的个数为0。
判断如果S的第i个字母!=T的第j个字母，那么num[i][j]=num[i][j-1],即与左边元素值相等；
当S的第i个字母==T的第j个字母时，那么num[i][j]=num[i][j-1]+num[i-1][j-1],即与左边元素和左上元素值之和相等，
如：S：“rabbb”，T:"rab",这时num[4][6]=num[4][5]+num[3][5]。
其中，num[4][5]=2,那2个匹配为："rab",(1)"ra b",(2)num[3][5]=1,那1个匹配为“ra”(3),而num[4][6]是“rab”,(1)"ra b"(2)和“ra  b”(3)。
 */


package DynamicProgrammer.DistinctSubsequences;

public class Solution {
    public int numDistinct(String S, String T) {
int length=T.length()+1;
int width=S.length()+1;
int[][]num=new int[length][width];
for(int i=0;i<length;i++)
    num[i][0]=0;
for(int n=0;n<width;n++)
    num[0][n]=1;
for(int j=1;j<length;j++)
    for(int m=1;m<width;m++)
    {
        if(S.charAt(m-1)==T.charAt(j-1))
        {num[j][m]=num[j][m-1]+num[j-1][m-1]; }
        else num[j][m]=num[j][m-1];
    }

return num[length-1][width-1];
    }
}
