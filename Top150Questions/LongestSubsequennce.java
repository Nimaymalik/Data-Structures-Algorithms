import java.util.Arrays;

public class LongestSubsequennce {

    public static void subsequence(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        if (n == 0) {
            System.out.println("Empty array there is : " + 0);
        } else if (n <= 1) {
            System.out.println("Array contain only one element: " + 1);
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] != (i + 1)) {
                    System.out.println("Sequence is :" + i);
                    break;
                }

            }

        }

    }

    public static void main(String[] args) {

        int[] arr = { 0, 4 };
        // int[] arr = { 9, 1, 4, 3, 2, 6, 5 };
        subsequence(arr);
    }
}
