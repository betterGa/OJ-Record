package DynamicProgrammer.RectCover;
/*
链接：https://www.nowcoder.com/questionTerminal/72a5a919508a4251859fb2cfb987a0e6?toCommentId=3485746
来源：牛客网

  覆盖无非是两种：横着或者竖着。假设2*n大矩形的覆盖方法有Method(n）种。如果第一次横着盖，那么此时剩下的大矩形变成了2*(n-1)，所以第一次横着盖的方法数为1*Method(n-1);如果第一次竖着盖，那么此时剩下的大矩形变成了2*(n-2),所以第一次竖着盖的方法数为1*Method(n-2)。这和变态青蛙跳台阶一样，只需要考虑第一次的几种情况，把方法数加起来即可。
 */




public class Solution {
    public int RectCover(int target) {

        int[] method=new int[100];
method[0]=0;
method[1]=1;
method[2]=2;
    for (int i = 3; i <= target; i++) {
        method[i] = method[i - 1] + method[i - 2];
    }


return method[target];

    }
}
