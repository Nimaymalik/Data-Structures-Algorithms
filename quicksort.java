package Quicksort;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1 };
        quicks(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr,int s,int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

    static void quicks(int[] arr, int low, int high) {

        //base condition of the array is empty
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(arr,start,end);
                start++;
                end--;

            }
        }
        quicks(arr, low, end);
        quicks(arr, start, high);
    }

}
