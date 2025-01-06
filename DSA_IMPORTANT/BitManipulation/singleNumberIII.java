package BitManipulation;

import java.util.Arrays;

public class singleNumberIII {
    public static int[] singleNumber(int[] nums) {
        int num = 0;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = num ^ i;

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 5 };
        // int[] nums = { 2, 2, 1 };

        System.out.println(Arrays.toString(singleNumber(nums)));
    }

}
