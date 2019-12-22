package Search.BreadthFirstSearch.ladderLength;
/**
package Search.BreadthFirstSearch.ladderLength;
import java.util.*;

1.LeetCode官方题解，用到了javafx.util.Pair
可是我看不懂。

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

 Since all words are of same length.
        int L = beginWord.length();

        // Dictionary to hold combination of words that can be formed,
        // from any given word. By changing one letter at a time.
        HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();

        wordList.forEach(
                word -> {
                    for (int i = 0; i < L; i++) {
                                                                                                                                                                                                                              // Key is the generic word
                        // Value is a list of words which have the same intermediate generic word.
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                        ArrayList<String> transformations =
                                allComboDict.getOrDefault(newWord, new ArrayList<String>());
                        transformations.add(word);
                        allComboDict.put(newWord, transformations);
                    }
                });

        // Queue for BFS
        Queue<Pair<String, Integer>> Q = new LinkedList<Pair<String, Integer>>();
        Q.add(new Pair(beginWord, 1));

        // Visited to make sure we don't repeat processing same word.
        HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
        visited.put(beginWord, true);

        while (!Q.isEmpty()) {
            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < L; i++) {

                // Intermediate words for current word
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

                // Next states are all the words which share the same intermediate state.
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
                    // If at any point if we find what we are looking for
                    // i.e. the end word - we can return with the answer.
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    // Otherwise, add it to the BFS Queue. Also mark it visited
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        Q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }

        return 0;
    }
}

*/


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//3.参考评论
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String>q = new LinkedList<String>();
        q.add(beginWord);//先将初始节点加进去
        int steps=0;
        while(!q.isEmpty()){
            int sizeQ=q.size();
            for(int i=0;i<sizeQ;i++){//遍历当前层的节点
                String temp=q.poll();
                if(temp.equals(endWord)){
                    return steps+1;
                }
                Iterator<String> it =wordList.iterator();
                while(it.hasNext()){
                    String current = it.next();
                    //队列中的头和list表中的当前遍历值可以转换
                    if(canTransform(temp,current)){
                        q.offer(current);
                        //使用集合对象 all 的 remove() 方法后，迭代器的结构被破坏了，遍历停止了
                        //wordList.remove(current);
                        it.remove();
                    }
                }
            }
            steps++;
        }
        return 0;
    }
    //比较两个单词是否可以转换，也就是只有一位不同
    boolean canTransform(String word1, String word2){
        int cnt=0;//记录word1 word2不相等字符个数
        for(int i=0;i<word1.length();i++){
            if(word1.charAt(i)!=word2.charAt(i)){
                cnt++;
            }
        }
        return cnt==1;
    }
}
*/

 //3.试着自己写一下，用队列实现，广度优先搜索
//关键是计算层数

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //易错：注意：如果beginWors和endWord都不在wordList中，也是有可能通过wordList转换得来的。
        // 应当是：如果wordList为0.返回0
        if(wordList.size()==0) return 0;
        //初始化层数
        int layer = 0;
        //首先将beginWord入队
        Queue<String> queue = new LinkedList();
        ((LinkedList) queue).addLast(beginWord);
        //当queue队不为空时，通过队的size控制在本层。
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //将本层的元素依次出队
                String head = ((LinkedList<String>) queue).pollFirst();
                //如果出队的元素已经是endWord，说明这时的这个head已经是最后一层。返回layer+1即可。

                //注意这里用的是equals，而不是==,equals比较的是内容，==比较引用地址。
                if(head.equals(endWord)) return layer+1;
                //遍历wordList，遇到可以从head转换而来的元素，就把该元素入队
                Iterator<String> iterator = wordList.iterator();
                while (iterator.hasNext()) {
                    String current = iterator.next();
                    if (ifTransfprm(head,current)) {
                        ((LinkedList<String>) queue).addLast(current);
                        //并将该元素从wordList中删除
                        iterator.remove();
                    }
                }

                //当该层的元素都出队去与wordList中的元素依次比较完了，这一层也就完了，给layer+1即可。
            }
            layer++;}


        //如果在遍历wordList的过程中始终没有找到可以转换的单词，说明无法从beginWord转换到endWord,
        //返回0即可。
        return 0;}

    //用来判断能否转换
    public boolean ifTransfprm(String s1,String s2)
    {
        //初始化不相等位数
        int codeL=0;
        int length=s1.length();
        for(int j=0;j<length;j++)
        {
            if(s1.charAt(j)!=s2.charAt(j))
            {codeL++;}
        }
        return codeL==1;

    }
}



