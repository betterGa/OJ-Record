/*
编辑距离
链接：https://www.nowcoder.com/questionTerminal/81d7738f954242e5ade5e65ec40e5027?f=discussion&toCommentId=3563193
来源：牛客网

像之前的背包问题、回文串分割问题，都需要一张二维表。设word1的第i个字母转换成word2的第j个字母需要的操作步骤数为dis[i][j],则有：如果word1.charAt[i-1]==word2.charAt[j-1],比如"abdce"中的"c"
和"fgc"中的"c",那么dis[4][3]=dis[3][2],即等于从"abd"转换成"fg"需要的操作步骤，因为相等的字母不涉及删除、添加、替换操作。而如果word1.charAt[i-1]!=word2.charAt[j-1]时，dis[ i ][ j ]=min(dis[ i-1 ][ j ],dis[ i ][ j-1 ],min[ i-1 ][ j-1 ])+1,在二维表中，当前的转换可由左边+添加操作、上边+删除操作、左上边+替换操作。所以是三者操作数中最小的，再加1。
  需要单独讨论的情况是当word1或者word2为空串时，步骤数为不为空的字符串的长度。

  https://www.cnblogs.com/littlepanpc/p/7895810.html
 */




package DynamicProgrammer.EditDistance;

public class Solution {

    public int minDistance(String word1, String word2) {
int length=word1.length()+1;
int width=word2.length()+1;
int [][]dis=new int[length][width];
for(int i=0;i<length;i++)
    dis[i][0]=i;
for(int j=0;j<width;j++)
    dis[0][j]=j;
if(length>1&&width>1)
{for(int m=1;m<length;m++)
{ for(int n=1;n<width;n++)
    {
        if(word1.charAt(m-1)==word2.charAt(n-1))
        {dis[m][n]=dis[m-1][n-1];}

        else{dis[m][n]=min(dis[m-1][n],dis[m][n-1],dis[m-1][n-1])+1;}

    }}}
    return  dis[length-1][width-1];}

public int min(int a,int b,int c)
{int min=Math.min(a,b);
min=Math.min(min,c);
return min; }
}

