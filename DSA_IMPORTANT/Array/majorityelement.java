package Array;
import java.util.Arrays;

public class majorityelement {

    public static int majorityElement(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length - 1;
        return arr[n / 2];

    }

    public static void main(String[] args) {
        int[] arr = { 1,2,2,1,2,2,1};

        System.out.println(majorityElement(arr));

    }

}
