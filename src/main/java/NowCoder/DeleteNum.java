package NowCoder;

import java.util.*;

public class DeleteNum {
    //题目描述
    //有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，
    // 求最后一个被删掉的数的原始下标位置。
    // 以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),
    // 如此循环直到最后一个数被删除。
    //输入描述:
    //每组数据为一行一个整数n(小于等于1000)，为数组成员数,如果大于1000，则对a[999]进行计算。
    //输出描述:
    //一行输出最后一个被删掉的数的原始下标位置。
    public static void main(String[] args) {

        //思路：利用队列，三个一组，前两个出队并入队，最后一个只出队不入队，就可以实现“循环”
        //直到队列只有两个元素，比如题目的例子，最后会剩下{3,6},3,6,3,删除3，剩下的6是最终结果
        Scanner in=new Scanner(System.in);
        while (in.hasNextInt())
        {int n=in.nextInt();
        if(n>999) n=999;
        Queue queue=new ArrayDeque();
        //先依次入队
        for(int i=0;i<n;i++)
        {
            ((ArrayDeque) queue).addLast(i);
        }
        while (queue.size()!=2)
        {
      ((ArrayDeque) queue).addLast(((ArrayDeque) queue).pollFirst());
            ((ArrayDeque) queue).addLast(((ArrayDeque) queue).pollFirst());
            ((ArrayDeque) queue).pollFirst();
        }
((ArrayDeque) queue).pollFirst();
        System.out.println(((ArrayDeque) queue).pollFirst());}
    }
}
