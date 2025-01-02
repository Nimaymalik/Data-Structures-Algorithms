package leetcode;

import java.util.Scanner;

public class happynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        happynum(n);
        sc.close();

    }

    static void happynum(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = getSquare(slow);
            fast = getSquare(getSquare(fast));

        } while (slow != fast);
        if (slow == 1) {
            System.err.println("Happy number");
        } else {
            System.out.println("Not happy but sad");
        }

    }

    static int getSquare(int n) {
        int ans = 0;
        while (n != 0) {
            int d = n % 10;
            ans += d * d;
            n = n / 10;

        }
        return ans;

    }

}
