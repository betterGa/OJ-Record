package NowCoder;

//链接：https://www.nowcoder.com/questionTerminal/bb06495cc0154e90bbb18911fd581df6
//来源：牛客网
//
//有一组数，对于其中任意两个数组，若前面一个大于后面一个数字，
// 则这两个数字组成一个逆序对。请设计一个高效的算法，计算给定数组中的逆序对个数。
//
//给定一个int数组A和它的大小n，请返回A中的逆序对个数。保证n小于等于5000。

//思路：从最后一个元素开始依次往前比较,也就是需要比n*n-1次
public class AntiOrder {
    public int count(int[] A, int n) {
        // write code here
        int time=0;
        for(int i=n-1;i>=0;i--)
        {
          for(int j=i-1;j>=0;j--)
            if (A[i]<A[j]) time++;

        }

return time;
}
}