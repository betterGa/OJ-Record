package DynamicProgrammer.Triangle;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
    ArrayList<Integer> in0=new ArrayList<>();

        ArrayList<Integer> in1=new ArrayList<>();
    ArrayList<Integer> in2=new ArrayList<>();
        ArrayList<Integer> in3=new ArrayList<>();
        ArrayList<ArrayList<Integer>> out=new ArrayList<>();

        @Test
    public void minimumTotal() {
        in0.add(2);
        in1.add(3);
        in1.add(4);
        in2.add(6);
        in2.add(5);
        in2.add(7);
        in3.add(4);
        in3.add(1);
        in3.add(8);
        in3.add(3);
        out.add(in0);
        out.add(in1);
        out.add(in2);
        out.add(in3);

        /*in0.add(1);
        in1.add(2);
        in1.add(3);
        out.add(in0);
        out.add(in1);*/


       /* int result=out.get(0).get(0);
        Assert.assertEquals(2,result);*/

        int result=solution.minimumTotal(out);
         Assert.assertEquals(11,result);

        }
    }
