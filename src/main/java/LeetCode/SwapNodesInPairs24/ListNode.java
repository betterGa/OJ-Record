package LeetCode.SwapNodesInPairs24;

public class ListNode {
          int val;
     ListNode next;
          ListNode(int x) { val = x; }

    class Solution {
        public ListNode swapPairs(ListNode head) {


            if(head==null||head.next==null) return head;
            else
            {
                ListNode temp=head.next;
                head.next=swapPairs(temp.next);
                temp.next=head;
                return temp;}
        }
    }



}
