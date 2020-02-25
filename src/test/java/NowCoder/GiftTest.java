package NowCoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class GiftTest {
Gift gift=new Gift();
    @Test
    public void getValue() {
        System.out.println(gift.getValue(new int[]{1,2,3,2,2},5));
    }
}