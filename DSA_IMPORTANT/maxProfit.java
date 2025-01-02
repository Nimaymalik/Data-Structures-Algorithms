public class maxProfit {
    public static int Profit(int[] prices) {
        int profit = 0;

        for (int i = 0; i <= prices.length-1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
            System.out.println(profit);
        }

        return profit;

    }

    public static void main(String[] args) {
        int[] arr = { 7,1,5,3,6,4 };

        System.out.println(Profit(arr));

    }

}
