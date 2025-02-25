package Array;

import java.util.Scanner;

public class MaximumInArray {

    public static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Maximum element in an array is:" + max(arr));
        sc.close();

    }

}
