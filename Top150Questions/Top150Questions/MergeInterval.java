import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {

        // sorting of array
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        int n = intervals.length;
        int i = 0;

        // checking the arrays
        for (int[] ins : intervals) {
            if (ins[0] <= intervals[i][1]) {
                intervals[i][1] = Math.max(intervals[i][1], ins[1]);
            } else {
                intervals[++i][0] = ins[0];
                intervals[i][1] = ins[1];
            }

        }
        //check if the pointer has reached the last index
        if (i == n - 1) {
            return intervals;
        }
        
        return Arrays.copyOfRange(intervals, 0, i + 1);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(Arrays.deepToString(merge(arr)));

    }

}
