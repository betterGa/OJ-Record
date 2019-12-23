package Search.BreadthFirstSearch.ladderLength;
import org.junit.Assert;
import org.junit.Test;
import Search.BreadthFirstSearch.ladderLength.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void ladderLength() {
        Solution solution=new Solution();
        String beginWord="hit";
        String endWord="cog";
        List<String> wordList=new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("log");
        wordList.add("cog");
        Assert.assertEquals(5,solution.ladderLength(beginWord,endWord,wordList));
    }

    @Test
    public void ladderLength2()
    {
        /**
         "hit"
         "cog"
         ["hot","dot","dog","lot","log","cog"]
         */
        Solution solution=new Solution();
        String benginWord="hit";
        String endWord="cog";
        ArrayList<String> wordList=new ArrayList();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        Assert.assertEquals(5,solution.ladderLength(benginWord,endWord,wordList));
    }

    @Test
    public void compare1()
    {
        String s1="a";
        String s2="a";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
@Test
    public void compare2()
{
    String s1=new String("a");
    String s2=new String("a");
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));

System.out.println("a"==s1);
System.out.println("a".equals(s1));
}


}