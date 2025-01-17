package Merge_sort;

import java.util.Arrays;

public class merge {

    static int[] sort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergesort(left, right);

    }

    static int[] mergesort(int[] left, int[] right) {
        int size = left.length + right.length;
        int[] ans = new int[size];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;

        }
        // it may be possible that one of the array is not complete
        while (i < left.length) {
            ans[k] = left[i];
            i++;
        }
        while (j < right.length) {
            ans[k] = right[j];
            j++;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 12, 5, 6 };
        System.out.println(Arrays.toString(sort(arr)));
    }

}
