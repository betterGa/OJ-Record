package NowCoder;

import java.util.*;

//有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
//给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，
// 请返回第K大的数，保证答案存在。

//思路：借用最小堆

public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        PriorityQueue p=new PriorityQueue();
        for(int i=0;i<a.length;i++)
        p.add(a[i]);
        while (p.size()>K)
        {p.poll();}
    return (int)p.poll();
    }
}