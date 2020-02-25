package NowCoder;
import java.util.*;
public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        HashMap<Integer,Integer> map=new HashMap<>(n);
        for(int i=0;i<gifts.length;i++)
        {
            int money=gifts[i];
            if(map.get(money)==null)
             map.put(gifts[i],1);

            int mTimes=map.get(money);
            if(mTimes+1>n/2) return money;
            if(mTimes!=0) map.put(money,mTimes+1);


        }
        return 0;
    }
}