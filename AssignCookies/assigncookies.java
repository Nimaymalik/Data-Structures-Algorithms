package AssignCookies;

import java.util.Scanner;

public class assigncookies {
    public static void main(String[] args) {

        int[] g = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the greedy array");
        for (int i = 0; i < 3; i++) {
            g[i] = sc.nextInt();

        }
        System.out.println("Enter the cookie array");

        int[] s = new int[2];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }

        System.out.println(findContentChildren(g, s));
        sc.close();

    }

    static int findContentChildren(int[] g, int[] s) {

        int ChildrenNumber = g.length;
        int CookieNumber = s.length;

        int ChildrenCount = 0;
        int greedFactor = 0;
        int cookieSize = 0;

        while (greedFactor < ChildrenNumber) {
            while (cookieSize < CookieNumber && s[cookieSize] < g[greedFactor]) {
                cookieSize++;
            }
            if (cookieSize < CookieNumber) {
                ChildrenNumber++;
                cookieSize++;

            } else {
                break;
            }
            greedFactor++;

        }
        return ChildrenCount;

    }

}
