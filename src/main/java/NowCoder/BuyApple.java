package NowCoder;


import java.util.Scanner;

public class BuyApple {
    //链接：https://www.nowcoder.com/questionTerminal/61cfbb2e62104bc8aa3da5d44d38a6ef
    //来源：牛客网
    //
    //小易去附近的商店买苹果，
    // 奸诈的商贩使用了捆绑交易，
    // 只提供6个每袋和8个每袋的包装(包装不可拆分)。
    // 可是小易现在只想购买恰好n个苹果，
    // 小易想购买尽量少的袋数方便携带。
    // 如果不能购买恰好n个苹果，小易将不会购买。
    public static int howManyApple1(int total)
    {
//思路：想要尽可能少的袋数，先整除8.如果有余数，
// 就先保留商，用余数除以6
        //如果除以6也有余数，说明为了能恰好买n个苹果，要先整除6+8=14
        //然后用余数先/8，后/6
        int result=-1;
        int temp=0;
        int time=1;
if(total%8==0) result=total/8;
else {
if((total%8)%6==0) result=total/8+total%8/6;
else
if(total%14==0) result=total/14*2;
       else if((total%14)%8==0) result=2+total%14/8;
        else{if((total%14)%6==0)
        result=2+total%14/6;
        else {    while (true) {
    total = total - 14;
    //1个14相当于2个袋子
    if (total % 8 == 0) {
        result = time * 2 + total / 8;
        break;
    } else if (total % 6 == 0) {
        result = time * 2 + total / 6;
        break;
    }
    time++;
}
        }}
        } return result;
    }


//您的代码已保存
//运行超时:您的程序未能在规定时间内运行结束，请检查是否循环有错或算法复杂度过大。
//case通过率为70.00%



    //思路二：已通过。
    // 先看能否被8整除，不行的话每次减14，再去整除8或6
    //如果减到负的了，判断一下能否被6整除，不行的话就说明没有袋子方案
    public static int howManyApple(int total)
    {
        int result=-1;
        int time=1;
        int temp=total;
        if(total%8==0)
        { result=total/8;}
        else
        {while (total>0)
        {
            total=total-14;
            if(total%8==0) {result=time*2+total/8;break;}
            else if(total%6==0) {result=time*2+total/6;break;}
            time++;
        }
            if(total<=0)
            {if(temp%6==0) result=temp/6;}

        }
    return result;
    }





    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(howManyApple(in.nextInt()));
    }
}
