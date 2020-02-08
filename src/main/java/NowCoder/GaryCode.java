package NowCoder;

import java.util.*;

public class GaryCode{
    public String[] getGray1(int n) {
        // write code here
        int length=(int) Math.pow(2,n);
        String[] result = new String[length];
        if (n == 1) {
            result[0] = "0";
            result[1] = "1";
            return result;
        }
        String[] j=getGray(n-1);
        for (int i = 0; i <length / 2; i++) {

            result[i] = "0" + j[i];
            result[length-1-i]="1"+j[i];
        }
return result;
    }
    public String[] getGray(int n)
    {
        if(n==1) return new String[]{"0","1"};
        String[] prev=getGray(n-1);
        int length=prev.length;
        String[] result=new String[length*2];
        for(int i=0;i<length/2;i++)
        {
            result[i]="0"+prev[i];
            result[length-1-i]="1"+prev[i];

        }


        return result;
    }
}