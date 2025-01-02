
public class binarysearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        int target = 3;
        System.out.println("Index of the searched element is:" + BSearch(arr, target));

    }

    static int BSearch(int[] arr, int target) {

        int start = arr[0];
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {

                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }

        return -1;

    }

}
