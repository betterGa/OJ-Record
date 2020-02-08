package NowCoder;

import Search.BreadthFirstSearch.ladderLength.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrayCodeTest {
 GaryCode grayCode=new GaryCode();
    @Test
    public void getGray() {
        String[] result=grayCode.getGray(3);
        for(int i=0;i<result.length;i++)
        System.out.println(result[i]);
    }
}