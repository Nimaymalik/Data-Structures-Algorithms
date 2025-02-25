import java.util.Arrays;

public class SetMatrixZero {
    private void setZeroes(int[][] matrix) {
        int n = matrix.length;// for row
        int m = matrix[0].length;// for column

        // boolean[] row=new boolean[]
        boolean[][] zeroarray = new boolean[n][m];

        // finding the z0 in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroarray[i][j] = true;
                }

            }
        }

        // making the corresponding elemet as zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (zeroarray[i][j] == true) {

                    // for rows
                    for (int k = 0; k < m; k++) {

                        matrix[i][k] = 0;
                    }
                    for (int l = 0; l < n; l++) {
                        matrix[l][j] = 0;

                    }
                }

            }

        }
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void main(String[] args) {
        SetMatrixZero matrix = new SetMatrixZero();

        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        matrix.setZeroes(arr);

    }
}
