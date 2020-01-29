package NowCoder;

import java.util.Scanner;

public class DoNot2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
       int[][] module=new int[][]{{1,1,0,0},{1,1,0,0},{0,0,1,1},{0,0,1,1}};
       int[][] current=new int[m][n];
       int count=0;
       for(int i=0;i<m;i++)
           for(int j=0;j<n;j++)
           {
               current[i][j]=module[i%4][j%4];
               if(current[i][j]==1)count++;
           }
           System.out.println(count);
    }
}
