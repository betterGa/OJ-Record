package LeetCode.minNumberInRotateArray153;


//https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/comments/
public class Solution {
public int findMin(int[] nums) {
        if(nums==null||nums.length==0)
        {return 0;}
        if(nums.length==1) return nums[0];
        int head=0;
        int tail=nums.length-1;

        while (head!=tail)
        {
        int mid=(head+tail)/2;
        if(nums[head]>nums[tail])
        {
        if(head+1==tail) return nums[tail];
        else  head=mid;
        }
        else
        {tail=head;
        head=0;}
        }
        return nums[head];
        }
        }