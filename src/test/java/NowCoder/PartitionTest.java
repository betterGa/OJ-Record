package NowCoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionTest {
Partition partition=new Partition();

    @Test
    public void partition() {
        ListNode listNode1=new ListNode(6);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(8);
        listNode1.next=listNode2;
        listNode2.next=listNode3;

        ListNode result= partition.partition(listNode1,9);
        while (result!=null)
        {
            System.out.println(result.val);
            result=result.next;
        }
    }
}