package DynamicProgrammer.ClimbingStairs;

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