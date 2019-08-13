/*
链接：https://www.nowcoder.com/questionTerminal/459bd355da1549fa8a49e350bf3df484?f=discussion&toCommentId=3487050
来源：牛客网

 题目中也说了，“向量中包含负数，是否应该包含某个负数，并期望旁边的正数会弥补它呢？”，这道题麻烦的地方就在于有负数。 “连续”也是关键。我们想知道加不加上这个数，其实将加上这个数之后的和与这个数本身做比较，比如说1，2，3，-1，开始最大和是1，（max[0]=array[0]，这也是初始状态方程），到array[1]时，加上它之后的和是3，3>2,那么这时最大和为3，到array[2]时，加上它之后的和为6，6>3，那么这时最大和为6，到array[3]时，加上它之后的和是5，5>-1，那么这时最大和为5。因此，创建个数组放最大值，最后遍历最大和数组，找到最大值即是求解结果。
  状态方程为：
  max[i]=Max(max[i-1]+array[i],array[i]);
   其中，max[i]表示的是从0开始，到第i位，连续的子数组的最大和。
  有了最大和数组，就可以保证“连续”，数组的最大值才是“连续子数组的最大和”。
  如果将状态方程写成了max[i]=Max{max[i-1]+array[i],max[i-1]}，在正数情况下是没差别的，一遇到负数就很容易出错。
   java语言中有Math.max(int a,int b)可比较两数大值。
 */
package DynamicProgrammer.MaximumSubarry;
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] max = new int[array.length];
        max[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            max[i] = Math.max(array[i], max[i - 1] + array[i]);
        }
        int result=max[0];
        for(int j=0;j<array.length;j++)
        {
            if(max[j]>result) result=max[j];
        }
return  result;        }
    }




