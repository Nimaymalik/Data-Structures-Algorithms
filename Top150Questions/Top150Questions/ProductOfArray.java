package Top150Questions;

import java.util.Arrays;

public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;

        for (int i = 1; i < n; i++) {
            curr *= nums[i - 1];
            ans[i] *= curr;

        }
        curr = 1;
        for (int i = n - 2; i >= 0; i--) {
            curr *= nums[i + 1];
            ans[i] *= curr;

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

}
