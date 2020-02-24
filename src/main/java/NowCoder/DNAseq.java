package NowCoder;


import java.util.*;

//
//输入描述:
//输入一个string型基因序列，和int型子串的长度

       // 输出描述:
       // 找出GC比例最高的子串,如果有多个输出第一个的子串
public class DNAseq {
           public static void main(String[] args) {
               Scanner in=new Scanner(System.in);
               String str=in.nextLine();
               int length=in.nextInt();
double pro=0;
double maxpro=0;
               String maxStr="";
               for(int i=length;i<str.length();i++)
               {
                   String result=LongestSeq(str,i);
                   int times=GCtimes(result);
                   pro=(double)times/i;
                   if(pro>maxpro)
                   {maxpro=pro;
                   maxStr=result;
                   }
               }
               System.out.println(maxStr);
           }
public static int GCtimes(String result)
{
int times=0;
for(int i=0;i<result.length();i++)
{if(result.charAt(i)=='C'||result.charAt(i)=='G')
times++;
}
return times;
}
           public static String LongestSeq(String str,int length) {
               char[] result = str.toCharArray();
               boolean[] flag=new boolean[str.length()];
               int count = 0;

               for (int i = 0; i < length; i++) {
                   if(result[i]=='G'||result[i]=='C')
                   { flag[i]=true;
                       count++;}
               }

               int max=count;

               int start = 0;
               int end = length;
               int maxStart=0;
               int maxEnd=end;

               for (int i = 0; i <str.length()-length; i++)
               {
                   if(result[end]=='G'||result[end]=='C')
                       flag[end]=true;

                   if(flag[start])
                   {if(!flag[end])
                       count--;
                   }
                   else {if(flag[end]) count++;}


                   if(count>max)
                   {max=count;
                       maxStart=end-length+1;
                       maxEnd=end;
                   }

                   start++;
                   end++;
               }

               String result1="";
               for(int k=maxStart;k<=maxEnd;k++)
               {result1=result1+result[k];}
        return result1;
           }


}