package StringBuffer;

import java.math.BigInteger;

public class factorial {
    static BigInteger fact(int num) {

        BigInteger ans = new BigInteger("1");
        for (int i = 2; i < num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));

        }
        return ans;

    }

}