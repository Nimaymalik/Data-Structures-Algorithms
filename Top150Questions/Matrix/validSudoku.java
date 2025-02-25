import java.util.HashSet;

public class validSudoku {

    public static boolean isValidSudoku(char[][] board) {

        HashSet<String> check = new HashSet<>();
        // for row
        for (int i = 0; i < board.length; i++) {
            // for column
            for (int j = 0; j < board.length; j++) {

                char x = board[i][j];
                // checking if the char is not '.'
                if (x != '.') {
                    // check in the 3x3 matrix and adding in hashset if return false ,means its
                    // already present
                    if (!check.add(x + " in row " + i) || !check.add(x + " " + j)
                            || !check.add(x + "" + i / 3 + "to" + j / 3)) {
                        return false;
                    } else {

                    }
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        char[][] arr = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(arr));

    }
}