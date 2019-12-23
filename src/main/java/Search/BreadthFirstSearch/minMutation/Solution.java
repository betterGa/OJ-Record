package Search.BreadthFirstSearch.minMutation;
/*
参考单词接龙的做法
 */

import java.util.*;
public class Solution {
public int minMutation(String start, String end, String[] bank) {
if(bank.length==0) return -1;
Queue<String> queue=new LinkedList();
//初始化变化次数
    int time=0;
//先让start进队
    ((LinkedList<String>) queue).addFirst(start);
    //当队列不为空时
while (!queue.isEmpty())
{
    //通过当前队列的size控制使在本层
    int size=queue.size();
    for(int i=0;i<size;i++)
    {
        //本层元素依次出队
        String current=((LinkedList<String>) queue).pollLast();
        if(current.equals(end)) return time+1;
        //遍历bank数组
        for(int j=0;j<bank.length;j++)
        {
            //如果可以转换得到
            if(ifChanged(current,bank[j]))
                //进队
            {
                ((LinkedList<String>) queue).addFirst(bank[j]);
                //并将该元素置为null
                bank[j] = null;
            }
        }
    }
time++;
}

return  0;
        }

        public boolean ifChanged(String s1,String s2)
        {
            if(s2==null) return false;
            int changedTime=0;
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
changedTime++;
            }
            return changedTime==1;
        }

        }
