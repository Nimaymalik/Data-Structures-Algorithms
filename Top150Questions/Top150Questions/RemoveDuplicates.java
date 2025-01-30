package Top150Questions;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int duplicatesremoved(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];

                j++;
            }


        }

        System.out.println(Arrays.toString(nums));

        return j;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(duplicatesremoved(nums));
    }

}
