import java.util.Arrays;
import java.util.HashSet;

public class DustributeCandy {
    public static int distributeCandies(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int num = n / 2;
        int type = 1;
        int first = 0;
        int second = 1;

        while (second <= n - 1) {
            if (arr[first] != arr[second]) {
                type++;

            }
            second++;
            first++;
        }

        if (type == num) {
            return num;
        }
        return Math.min(type, num);

    }

    public static int usingHashSet(int[] arr) {
        int n = arr.length / 2;

        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hash.add(arr[i]);
        }
        int ans = hash.size();
        return Math.min(n, ans);

    }

    public static void main(String[] args) {
        int[] arr = { 6, 0, 6, 0, 6, 0, 6, 0, 6, 0, 6, 0 };
        // System.out.println(distributeCandies(arr));
        System.out.println(usingHashSet(arr));

    }

}
