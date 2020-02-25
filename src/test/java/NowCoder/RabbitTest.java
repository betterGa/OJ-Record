package NowCoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class RabbitTest {
Rabbit rabbit=new Rabbit();
    @Test
    public void getTotalCount() {
        System.out.println(Rabbit.getTotalCount(9));
    }
}