import java.util.Arrays;

public class firstMissingPositive {

    public static int firstMissing(int[] arr) {

        Arrays.sort(arr);

        int missing = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == missing) {
                missing++;
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0 };
        System.out.println(firstMissing(arr));

    }

}
