package NowCoder;

import java.util.ArrayList;
import java.util.Scanner;

//有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
// 她最多可以换多少瓶汽水喝？”答案是5瓶，
// 方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，
// 喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，
// 这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，
// 喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，
// 最多可以换多少瓶汽水喝？
public class SodaBottles {

    //思路：如果遇到3的倍数的空瓶子，只要不停地对3求商，直到1，把结果相加即可
    public static int HowManybottles(int emptyBottle)
    {if(emptyBottle==0) return 0;
        int flag=0;
        if(emptyBottle%3==0) flag=1;

        int bottle=0;

            while (emptyBottle!=1)
            {
                emptyBottle=emptyBottle/3;
                bottle=bottle+emptyBottle;
            }
        if(flag==1)
        return bottle;

        //对于对3取余结果为1或2的，可以喝到的瓶子数都是对3不断求商直到1，最后的结果还要+1
        else return bottle+1;
    }


    //输入文件最多包含10组测试数据，每个数据占一行，
    // 仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。
    // n=0表示输入结束，你的程序不应当处理这一行。
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      // int[] empty=new int[]{1,1,1,1,1,1,1,1,1,1};
       int i=0;
     while (in.hasNextInt())
        {
         System.out.println(HowManybottles(in.nextInt()));
        }
    /*    for(int j=0;j<empty.length;j++)
    System.out.println(HowManybottles(empty[j]));*/
    }
}
