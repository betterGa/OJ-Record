package NowCoder;

import java.util.*;
public class ScoreSort {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        HashMap<Integer,String[]> map=new HashMap<>(n);
     int [] scores=new int[n];
        int order=Integer.parseInt(in.nextLine());
       for(int i=0;i<n;i++)
        {String all=in.nextLine();
            String[] ms=all.split(" ");
        String name=ms[0];
            int score=Integer.valueOf(ms[1]);
            map.put(score,ms);
           scores[i]=score;
        }

        Arrays.sort(scores);
        if(order==0)
        {
            for(int i=0;i<scores.length;i++)
            {String[] result=map.get(scores[i]);
                System.out.println(result[0]+" "+result[1]);
        }}
else {
            for(int i=scores.length-1;i>=0;i--)
            {String[] result=map.get(scores[i]);
                System.out.println(result[0]+result[1]);
            }}
    }}

