package Array;
import java.util.Arrays;

public class productExceptSelf {
    public static int[] productExcept(int[] nums) {

        int size = nums.length;
        int[] arr = new int[size];
        Arrays.fill(arr, 1);// arr={1,1,1,1,1}

        // compute left part
        int curr = 1;
        for (int i = 0; i < size; i++) {
            arr[i] *= curr;
            curr *= nums[i];
        }
        // compoute right part
        // arr[1,1,2,6]
        // nums[1,2,3,4]
        curr = 1;
        for (int i = size - 1; i >= 0; i--) {
            arr[i] *= curr;// 6
            curr *= nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        productExcept(arr);

    }

}
