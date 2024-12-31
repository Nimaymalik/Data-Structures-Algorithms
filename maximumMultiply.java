import java.util.Arrays;

public class maximumMultiply {

    public static int maximumProduct(int[] arr) {

        int n = arr.length - 1;
        Arrays.sort(arr);
        int max = arr[n] * arr[n - 1] * arr[n - 2];
        int max2 = arr[0] * arr[1] * arr[n];
        return Math.max(max, max2);
    }

    public static void main(String[] args) {
        int[] nums = { -100, -98, -1, 2, 3, 4 };
        System.out.println(maximumProduct(nums)); // Output: 39200
    }
}
