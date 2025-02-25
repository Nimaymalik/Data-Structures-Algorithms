import java.util.Arrays;

public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;

        int i = 0;
        int j = 1;

        if (n < 1) {
            return 0;
        }

        while (j < n) {
            if (nums[i] == nums[j]) {
                ans = nums[i];
            }
            i++;
            j++;

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 3, 3, 3 };
        System.out.println(findDuplicate(arr));
    }

}
