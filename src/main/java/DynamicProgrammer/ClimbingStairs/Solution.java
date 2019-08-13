package DynamicProgrammer.ClimbingStairs;
/*
链接：https://www.nowcoder.com/questionTerminal/22243d016f6b47f2a6928b4313c85387?toCommentId=3466684
来源：牛客网

变态青蛙跳台阶

  设跳n级台阶的方法数为method(n)种。
  现在有n级台阶，如果跳了一次一次1级的，那么剩下n-1级台阶，就需要method(n-1)种方法，而一次1级只有一种方法，即这种跳法有method(n-1)种。如果跳了一次一次2级的，那么剩下n-2级台阶，需要method(n-2)种方法，同理，一次2级只有一种方法，即这种跳法有method(n-2)种......  这样思考不会有重复情况，可以得到式子：method(n)=method(n-1)+method(n-2)+...+一直加到跳了一次一次n-1级台阶的，这种跳法有method(1)种和跳了一次一次n级台阶的，也就是1种，记为method(0)。
   那么method(1)=1,method(0)=1。
   由method(2)=method(1)+method(0);
       method(3)=method(2)+method(1)+method(0)=2(method(0)+method(1));
       method(4)=method(3)+method(2)+method(1)+method(0)=4(method(0)+method(1))......
   依次类推，可以得到公式：method(n)=2^(n-2)*(method(0)+method(1))。
   在java中可以用位移表示2的次方，<<2,而注意当n=2时,会导致结果为0，因此用Math.pow(2,n-2).
 */

public class Solution {
    public int JumpFloorII(int target) {
        int[] method = new int[100];
        if (target == 0 || target == 1)
        {method[target]=1;}
    else {
    method[0]=1;
method[1]=1;
method[target]=(int) Math.pow(2,target-2)*(method[0]+method[1]);}
return method[target];
    }}