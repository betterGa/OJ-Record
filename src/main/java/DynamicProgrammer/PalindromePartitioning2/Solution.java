/*
链接：https://www.nowcoder.com/questionTerminal/1025ffc2939547e39e8a38a955de1dd3?f=discussion&toCommentId=3560274
来源：牛客网

 回文串分割

 设cut[i]为从第一个字母初到第i个（i>0）字母组成的字符串分隔次数，
 长度为i的字符串，最大分割次数为i-1，这是初状态，
 接下来，如果从j( 0<= j <= i )到i组成的字符串s.substring(j,i)是回文串，
 那么，分割次数为cut[j]+1，即已知到第j个字母需要分割cut[j]次，
 那么后面的j+1到i是回文串，只需要在j和j+1之间分割一次即可。
 而如果是{b,b}这样的字符串，i=2时，首先，j=0,“bb”(s.substring(0,2))是回文串，而cut[0]=0，此时分割次数cut[2]为0+1=1,
 接下来，j=1,“b”(s.substring(1,2))是回文串，而cut[1]=0,此时分割次数为cut[2]=0+1=1,这是不正确的，
 需要和cut[i]做比较，使分割次数为能分成回文串的最小的次数。因此，修改为cut[i]=Math.min(cut[i],cut[j]+1)。

https://blog.csdn.net/ch15029286692/article/details/97403539
 */




package DynamicProgrammer.PalindromePartitioning2;

public class Solution {

    public int minCut(String s) {
        int length=s.length();
        int cut[]=new int[length+1];
for(int i=0;i<length+1;i++)
{ cut[i]=i-1; }

for(int m=1;m<length+1;m++)
    for(int n=0;n<m;n++)
    { if(isPalind(s.substring(n,m))==true)
        { cut[m]=Math.min(cut[m],cut[n]+1); }
    }
return cut[length];
    }
public boolean isPalind(String s)
{ char[]c=s.toCharArray();
    for(int i=0;i<s.length()/2;i++)
    { if(c[i]!=c[s.length()-1-i]) return false; }
return true;
}}
