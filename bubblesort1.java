package Bubblesort;

import java.util.Arrays;

public class bubblesort1 {
    public static void main(String[] args) {
        int[] arr = { 6, 0, 8, 3, 1, 5, 2, 5, 8, 6, 3, 5 };
        bubble(arr);

    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);

                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
