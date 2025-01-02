
public class twosum {
    public int[] sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                int ans = nums[i] + nums[j];
                if (ans == target) {
                    return new int[] { i, j };

                }
            }

        }
        return new int[] { 0 };

    }

    public static void main(String[] args) {
        twosum twosum = new twosum();
        int[] nums = { 2, 5, 5, 15 };
        int target = 10;

        int[] result = twosum.sum(nums, target);
        System.out.println("{" + result[0] + "," + result[1] + "}");
    }
}
