package BitManipulation;

public class SingleNumber {
    public static int single(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num ^= arr[i];

        }
        return num;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 4 };
        System.out.println(single(arr));

    }
}