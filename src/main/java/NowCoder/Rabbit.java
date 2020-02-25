package NowCoder;

public class Rabbit {
    public static int getTotalCount(int monthCount)
    {
       int[] rabbit=new int[monthCount];
       rabbit[0]=1;
       rabbit[1]=0;
     for(int i=2;i<monthCount;i++)
     {rabbit[i]=rabbit[i-1]+rabbit[i-2];}
     int count=0;
for(int j=0;j<monthCount;j++)
{
    count=count+rabbit[j];
}
return count;
    }


}
