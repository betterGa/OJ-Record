package NowCoder;

import org.junit.Test;

import static NowCoder.MagicPocket.kindsOfMethods;
import static org.junit.Assert.*;

public class MagicPocketTest {
MagicPocket magicPocket=new MagicPocket();
    @Test
    public void main() {

    }

    @Test
    public void kindsOfMethod() {
        int[]items=new int[]{20,20,20};
        int[][] dp=new int[4][41];
        System.out.println(kindsOfMethods(items,dp));
    }
}