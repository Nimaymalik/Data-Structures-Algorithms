import java.util.Arrays;

class ReverseKarray {
    public static int[] reverseArray(int[] arr, int first, int last) {
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;

        }

        return arr;

    }

    public int[] reverseArray(int[] arr, int k) {

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
        return arr;

    }

    public static void main(String[] args) {

        ReverseKarray arr = new ReverseKarray();
        int[] rev = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        System.out.println(Arrays.toString(arr.reverseArray(rev, k)));
    }
}