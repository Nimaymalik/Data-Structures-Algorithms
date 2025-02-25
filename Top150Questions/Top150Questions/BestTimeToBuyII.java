
public class BestTimeToBuyII {
    public static int maxProfit(int[] prices) {

        int profit = 0;
        int n = prices.length - 1;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i ] - prices[i-1];

            }

        }

        return profit;

    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr));

    }

}
