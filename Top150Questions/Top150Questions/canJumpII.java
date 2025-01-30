package Top150Questions;

public class canJumpII {
    public static int jump(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int end = 0;// for counting the jumps of each window
        int fardest = 0;
        for (int i = 0; i < n - 1; i++) {
            fardest = Math.max(fardest, nums[i] + i);
            if (fardest >= n - 1) {
                ans++;
                return ans;
            }
            if (i == end) {
                ans++;
                end = fardest;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        System.out.println(jump(arr));

    }

}
