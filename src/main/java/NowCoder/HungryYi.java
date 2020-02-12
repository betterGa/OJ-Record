package NowCoder;

//小易总是感觉饥饿，所以作为章鱼的小易经常出去寻找贝壳吃。
// 最开始小易在一个初始位置x_0。对于小易所处的当前位置x，
// 他只能通过神秘的力量移动到 4 * x + 3或者8 * x + 7。
// 因为使用神秘力量要耗费太多体力，所以它只能使用神秘力量最多100,000次。
// 贝壳总生长在能被1,000,000,007整除的位置
// (比如：位置0，位置1,000,000,007，位置2,000,000,014等)。
// 小易需要你帮忙计算最少需要使用多少次神秘力量就能吃到贝壳。

//输入描述:
//输入一个初始位置x_0,范围在1到1,000,000,006

//输出描述:
//输出小易最少需要使用神秘力量的次数，如果使用次数使用完还没找到贝壳，则输出-1


import java.util.Scanner;

public class HungryYi {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            long x=in.nextLong();
            if(x==0) System.out.println("1");
            else
                System.out.println(gettimes(x));
        }
        public static long gettimes(long x)
        {
            long temp=x;
            for(int i=1;i<=300000;i++)
            {
                temp=(temp*2+1)%1000000007;
                if(temp==0)
                {
                    for(int j=0;j<=(i/2);j++)
                    {
                        if((i-j*2)%3==0)
                        {
                            return (i+j)/3;
                        }
                    }


                }
            }
            return -1L;
        }

    }
