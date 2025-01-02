package selectionsort;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = { 6, 0, 3, 5 };
        minimum(arr);

    }

    static void minimum(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int min_indx = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_indx]) {
                    min_indx=j;
                    
                }
                
            }
            if (min_indx != i) {
                swap(arr, i, min_indx);
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
