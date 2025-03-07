import java.util.Scanner;

public class Prime {
    public static void checkPrime(int num) {

        if (num < 2) {
            System.out.println("Number is not prime");
        }

        int f = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                f = 1;
            }

        }
        if (f == 0) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        checkPrime(num);
        sc.close();

    }
}