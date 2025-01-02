import java.util.Arrays;

class moveZeroe {

    public static void moveZeroes(int[] arr) {
        int prev=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp=arr[i];
                arr[i]=arr[prev];
                arr[prev]=temp;
               
                prev++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 0, 12 };
        moveZeroes(arr);

    }
}