package Array;
import java.util.Arrays;

public class moveZero {

    public static void moveZeroes(int[] nums) {
        int prev = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[prev];
                nums[prev] = temp;

                prev++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);

    }
}