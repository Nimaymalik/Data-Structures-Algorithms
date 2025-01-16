package Top150Questions;

import java.util.Arrays;

public class Candy {
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];

        Arrays.fill(candy, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;

            }

        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i] && candy[i + 1] >= candy[i]) {
                candy[i] = candy[i + 1] + 1;
            }

        }
        int ans = 0;
        for (int i = 0; i < candy.length; i++) {
            ans += candy[i];

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] rating = { 1, 0, 2 };
        System.out.println(candy(rating));

    }

}
