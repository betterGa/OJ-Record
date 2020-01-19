package NowCoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SodaBottlesTest {
SodaBottles sodaBottles=new SodaBottles();
    @Test
    public void howManybottles() {
   Assert.assertEquals(40,sodaBottles.HowManybottles(81));
   Assert.assertEquals(1,sodaBottles.HowManybottles(3));
   Assert.assertEquals(5,sodaBottles.HowManybottles(10));
    }
}