package Bubblesort;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 6, 0, 3, 5 };
        int n = arr.length;
        bubble(arr, n);

    }

    static void bubble(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
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
