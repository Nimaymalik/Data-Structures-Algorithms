import java.util.Scanner;

public class ByteMystery {
    static int split(int n) {

        while (n > 10) {
            int add = 0;
            while (n != 0) {

                int d = n % 10;// 4
                add += d;// 8
                n /= 10;
            }
            n = add;

        }
        return n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = split(n);// 314

        if (num == 8) {
            System.out.println("It is holy stone");
        } else {
            System.out.println("It is not an holy stone");
        }

        sc.close();

    }
}