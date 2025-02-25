package Array;

import java.util.Scanner;

public class Recursion {
    public static void fibonacci(int n) {
        int first = 0;
        int second = 1;
        int next;
        
        System.out.print(first + " " + second);
        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(" " + next);
            first=second;
            second=next;

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
        // System.out.println(fibonacci(n));
        sc.close();
    }

}
