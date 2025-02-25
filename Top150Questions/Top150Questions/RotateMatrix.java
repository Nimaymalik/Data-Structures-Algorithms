import java.util.Arrays;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n -1;

            while (left != right) {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                right--;
                left++;

            }
            
        }
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(arr);
    }
}