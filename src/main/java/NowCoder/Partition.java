package NowCoder;
import java.util.*;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
//思路：新建两个链表
        ListNode less=null;
        ListNode more=null;
        ListNode moreHead=null;
        ListNode lessHead=null;
        while (pHead!=null)
        {
         if(pHead.val<x)
         {if(less==null) {
             lessHead = new ListNode(pHead.val);
             less=lessHead;
         }
        else {

             less.next = new ListNode(pHead.val);
             less = less.next;
         }
         }
            else
         {if(more==null) {
             moreHead= new ListNode(pHead.val);
             more=moreHead;
         }
           else   {more.next=new ListNode(pHead.val);
more=more.next;
         }}
            pHead=pHead.next;
        }
        if(less==null) {return moreHead;}

less.next=moreHead;
        return lessHead;

}
}