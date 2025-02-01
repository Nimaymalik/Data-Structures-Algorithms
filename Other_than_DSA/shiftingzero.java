import java.util.Arrays;

public class shiftingzero {

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int[] shiftingzero(int[] arr) {
        int prev = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, prev, i);
                prev++;

            }

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 0, 12 };
        System.out.println(Arrays.toString(shiftingzero(arr)));

    }

}