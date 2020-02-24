package NowCoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class shuffleTest {
shuffle s=new shuffle();
    @Test
    public void main() {
    }

    @Test
    public void shuffleOnce() {
        int []origin=new int[]{1,2,3,4,5,6};
        s.shuffleOnce(origin);
   for(int i=0;i<6;i++)
        System.out.println(origin[i]);
    }
}