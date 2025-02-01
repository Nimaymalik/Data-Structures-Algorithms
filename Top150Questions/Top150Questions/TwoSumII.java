package Top150Questions;

import java.util.Arrays;

public class TwoSumII {
    public static int[] sum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum > target) {
                right--;

            } else {
                left++;
            }

        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[] arr = { 5, 25, 75 };
        int target = 100;
        System.out.println(Arrays.toString(sum(arr, target)));
    }
}