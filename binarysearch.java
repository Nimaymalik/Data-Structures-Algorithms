// package BinarySearch;

public class binarysearch {
    public static void main(String[] args) {
        int target = -7;
        int[] arr = {-45,-7,-1,-2,0,2, 4, 9, 10, 12, 10, 15, 18, 19 };

      
        System.out.println(binarysearch(arr, target));
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
        
        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            // answer found
            return mid;
        }
    }
        return -1;
    }
}