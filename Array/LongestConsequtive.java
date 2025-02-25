package Array;

import java.util.Arrays;

public class LongestConsequtive {

    public int longestConsecutive(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        if (arr == null || n == 0) {
            return 0;
        }

        int i = 1;
        int j = 1;
        for (int j2 = 0; j2 < arr.length - 1; j2++) {
            if (arr[j2] == arr[j2 + 1]) {
                continue;
            } else if (arr[j2 + 1] == arr[j2] + 1) {
                j++;
            } else {
                i = Math.max(i, j);
                j = 1;
            }

        }
        return Math.max(i, j);

    }

    public static void main(String[] args) {
        LongestConsequtive ans = new LongestConsequtive();
        int[] arr = { 0, 1, 2, 0 };
        System.out.println(ans.longestConsecutive(arr));

    }

}
