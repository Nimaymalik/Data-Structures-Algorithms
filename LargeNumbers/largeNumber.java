package LargeNumbers;

import java.math.BigInteger;

public class largeNumber {
    public static void main(String[] args) {

        BigInteger A = BigInteger.valueOf(32);
        BigInteger B = BigInteger.valueOf(1000000000);
        BigInteger C = new BigInteger("3747389");
        System.out.println(A + " " + B + " " + C);

        // constants
        BigInteger D = BigInteger.ZERO;
        System.out.println(D);

        // addition
        BigInteger sum = A.add(B);
        System.out.println(sum);

    }

}
