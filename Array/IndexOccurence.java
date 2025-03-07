package Array;

import java.util.Arrays;

public class IndexOccurence {
    public static int[] occurence(int[] nums, int target) {
        int[] arr = { -1, -1 };
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[j] = i;
                j++;
            }

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(occurence(nums, 8)));
    }

}
