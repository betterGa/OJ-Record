package NowCoder;

import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[]infor=in.nextLine().split(" ");
        int i0=Integer.valueOf(infor[0]);
        int i2=Integer.valueOf(infor[2]);
        int i3=Integer.valueOf(infor[3]);
        int A=(i0+i2)/2;
        int B=A-Integer.valueOf(infor[0]);
        int C=B-Integer.valueOf(infor[1]);
        if((i0+i2)%2!=0||A*B*C<0||B+C!=i3)
        {System.out.println("No");return;}
       else System.out.print(A+" "+B+" "+C);

    }
}
