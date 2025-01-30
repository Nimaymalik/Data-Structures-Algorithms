package Top150Questions;

import java.util.Arrays;

public class TappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int right[] = new int[n];

        left[0] = height[0];// first element of array
        right[n - 1] = height[n - 1]; // last element of array

        for (int i = 1; i < n; i++) {
            if (height[i] > left[i - 1]) {
                left[i] = height[i];// adding the maximum at the left array
            } else {
                left[i] = left[i - 1];
            }

        }

        System.out.println(Arrays.toString(left));

        for (int i = n - 2; i >= 0; i--) {
            if (height[i] > right[i + 1]) { // adding the maximum int he right array
                right[i] = height[i];
            } else {
                right[i] = right[i + 1];
            }

        }

        System.out.println(Arrays.toString(right));

        int water = 0;
        for (int i = 0; i < n; i++) {
            int x = Math.min(left[i], right[i]);// finding the min in both array
            water += x - height[i];

        }
        return water;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Answer is " + trap(arr));

    }

}