import java.util.Arrays;

public class DistributeCandies {
    public static int[] distributeCandies(int candies, int n) {
        int[] arr = new int[n];
        Arrays.fill(arr, 0);

        int add = 1;
        int i = 0;

        while (candies > 0) {
            if (candies >= add) {
                arr[i % n] += add;
                candies -= add;
            } else {
                arr[i] += candies;
                break;
            }
            add++;
            i++;

        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(distributeCandies(10, 3)));

    }
}