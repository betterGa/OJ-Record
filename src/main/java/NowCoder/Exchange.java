package NowCoder;

import java.util.*;

public class Exchange {
    public int[] exchangeAB1(int[] AB) {

        AB[0]=AB[0]+AB[1];
        AB[1]=AB[0]-AB[1];
        AB[0]=AB[0]-AB[1];
        return AB;
        // write code here
    }
    public int[] exchangeAB(int[] AB) {
        AB[0]^=AB[1];
        AB[1]^=AB[0];
        AB[0]^=AB[1];
        return AB;

    }
}