package NowCoder;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    CopyOmWriteArrayList<> list=new CopyOnWriteArrayList<>()
    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode Head=null;
        ListNode node=null;
        int digit=0;
        while (a!=null&&b!=null)
        {
            int current=a.val+b.val+digit;
            if(current>=10)
            {current=current%10;
                digit=1;
            }
            else digit=0;
            if(Head==null)
            {Head=new ListNode(current);
                node=Head;
            }
            else {node.next=new ListNode(current);
                node=node.next;}
            a=a.next;
            b=b.next;
        }
        if(digit==0)
        {
        if(a==null&&b==null) return Head;
        if (a==null)
        {
            node.next=b;
            return Head;
        }
        if(b==null) node.next=a;
        return Head;

        // write code here
    }
    else
        {
if(a==null&&b==null)
{
    node.next=new ListNode(1);
    return Head;
}

if(a==null)
{
    while (b!=null)
    {int val=digit+b.val;
    if(val==10)
    {  node.next=new ListNode(0);
    digit=1;}
    else digit=0;
        node=node.next;
        b=b.next;

    }
}
else
            {
                while (a!=null)
                {int val=digit+a.val;
                    if(val==10)
                    {  node.next=new ListNode(0);
                        digit=1;}
                    else digit=0;
                    node=node.next;
                    a=a.next;




                }

        }

return Head;

    }


}}