package DailyLeetCode;

public class SpecialArray {
    public static boolean isArraySpecial(int[] nums) {
        int len = nums.length;

        if (len <= 1) {

            return true;
        }
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] % 2 == nums[j + 1] % 2) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 10 };
        System.out.println(isArraySpecial(nums));

    }

}
