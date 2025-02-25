import java.util.Arrays;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {

        // taking above row and filling it with 1
        int[] aboveRow = new int[n];
        Arrays.fill(aboveRow, 1);

        for (int i = 1; i < m; i++) {

            // now taking bottomRow and fill with 1
            int[] curRow = new int[n];
            Arrays.fill(curRow, 1);
            
            for (int j = 1; j < n; j++) {
                curRow[j] = curRow[j - 1] + aboveRow[j];

            }
            aboveRow = curRow;

        }

        return aboveRow[n - 1];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m, n));

    }
}
