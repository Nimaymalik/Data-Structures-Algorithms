package StringBuffer;

import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
        double ans = y - x;
        System.out.println(ans);
    }

    static void BigInteger() {
        // StringBuffer buffer = new StringBuffer();
        BigInteger a = BigInteger.valueOf(5);
        BigInteger b = BigInteger.valueOf(5);
        int c = b.intValue();// convert BigInteger to int
        BigInteger C = new BigInteger("2112421412412121312");
        BigInteger X = new BigInteger("2112421412412121312");

        // constants
        BigInteger D = BigInteger.TEN;
        // System.out.println("D:" + D);

        // addition
        BigInteger e = C.add(X);
        // System.out.println("Addition:" + e);

        // multiply
        BigInteger m = C.multiply(X);
        // System.out.println("Multiply:" + m);

        // substract
        BigInteger n = C.subtract(X);
        // System.out.println("substract:" + n);

        // divide
        BigInteger o = C.divide(X);
        // System.out.println("Divide:" + o);

        // if (C.compareTo(X) == 0) {
        // System.out.println("Equal");

        // }

        System.out.println(factorial.fact(2345));

        BigInteger ab = new BigInteger("0.03");
        BigInteger abb = new BigInteger("0.03");
        BigInteger ans = abb.subtract(ab);
        System.out.println(ans);

    }
}
