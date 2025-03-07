public class Prime1100 {
    public static boolean printPrime(int num) {
        if (num < 2) {
            System.out.println("Number is not prime");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i < n; i++) {
            if (printPrime(i)) {
                System.out.println(i + " ");

            }

        }

    }
}
