public class ddEven {

    public static void oddpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print((2 * j) - 1+ " ");
            }

            System.out.println(" ");

        }

    }

    public static void evenpyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(2 * j +" " );
            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        int n = 6;

        oddpyramid(n);
        evenpyramid(n);

    }

}
