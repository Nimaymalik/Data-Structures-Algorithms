package Top150Questions;

import java.util.Arrays;

public class RemoveOccurence {
    public static int remove(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count]=nums[i];//this will replace the 3 with 2
                count++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return count;

    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        System.out.println(remove(nums, val));

    }

}
