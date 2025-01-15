package Top150Questions;

import java.util.Arrays;

public class HIndex {
    public static int hIndex(int[] arr) {
        int paper = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < paper; i++) {
            if (arr[i] >= paper - i) {
                return paper - i;

            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 6, 1, 5 };
        System.out.println(hIndex(arr));

    }

}
