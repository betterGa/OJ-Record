package NowCoder;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
       char C=in.next().charAt(0);
     for(int i=0;i<Math.round((float) N/2.0);i++)
     {
         if(i%((N-1)/2)==0)
         {for (int j=0;j<N;j++)
             System.out.print(C);
             System.out.println();
         continue;}
         for(int k=0;k<N;k++)
         {if(k%(N-2)==0)
             System.out.print(C);
         System.out.print(" ");}
             System.out.println();


     }
    }


}
