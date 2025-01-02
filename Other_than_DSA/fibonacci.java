public class fibonacci {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 0; i < num; i++) {

            System.out.println(fibonacciseries(i) + " ");
        }

    }

    static int fibonacciseries(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        return fibonacciseries(num - 1) + fibonacciseries(num - 2);
    }
}
