package LeetcodeEasy;

import java.util.Arrays;

class defuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] newarr = new int[len];

        if (k == 0) {
            Arrays.fill(newarr, 0);

        } else if (k > 0) {
            for (int i = 0; i < len; i++) {
                for (int j = 1; j <= k; j++) {
                    newarr[i] += code[(i + j) % len];
                }
            }
        } else {
            for (int i = 0; i < len; i++) {
                for (int j = 1; j <=-k; j++) {
                    newarr[i] += code[(len + i - j) %len];
                }
            }
        }

        return newarr;
    }

    public static void main(String[] args) {
        int[] code = { 2, 4, 9, 3 };
        int k = 2;
        int[] ans = decrypt(code, k);
        System.out.println(Arrays.toString(ans));

    }

}