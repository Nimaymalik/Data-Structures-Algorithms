// Counting Sort Algorithm
package CountSort;

import java.util.Arrays;
import java.util.Scanner;

public class countsort {
    // example array[2,5,3,0,2,3,0,3]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the size of the array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // taking inputs in the array
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum element is:" + maximum(arr, size));
        int max = maximum(arr, size);

        // making the new Array of size+1 than the maximum element in the input array
        int[] newArray = new int[max + 1];

        // filling the zero inside the array
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = 0;

        }
        System.out.println("Putting the value zero:" + Arrays.toString(newArray));

        // calculating the occcurence of the element
        for (int i = 0; i < arr.length; i++) {
            newArray[arr[i]]++;

        }

        System.out.println("Occurence of the element is:" + Arrays.toString(newArray));

        for (int i = 1; i < newArray.length; i++) {
            newArray[i] += newArray[i - 1];

        }
        System.out.println("Adding the element:" + Arrays.toString(newArray));

        int[] output=new int[size];
        for (int i =size-1; i >=0; i--) {
// 
            output[newArray[arr[i]] - 1] = arr[i];
            newArray[arr[i]]--;
            
        }
        System.out.println("Sorted array"+Arrays.toString(output));

        sc.close();
    }

    static int maximum(int[] arr, int size) {
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
