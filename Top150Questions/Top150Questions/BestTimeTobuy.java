public class BestTimeTobuy {
    private static int profit(int[] nums) {
        int profit = 0;
        int buy = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (buy > nums[i]) {
                buy = nums[i];

            }
            profit = Math.max(profit, nums[i] - buy);

        }
        return profit;
    }

    public static void main(String[] args) {
        int[] num = {7,6,4,3,1 };
        System.out.println(profit(num));

    }

}
