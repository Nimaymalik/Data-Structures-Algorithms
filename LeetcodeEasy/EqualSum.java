
public class EqualSum {
    static boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j]) {
                    return true;
                }

            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 3 };

        System.out.println(check(arr));

    }

}
