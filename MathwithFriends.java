import java.util.Scanner;

public class MathwithFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int fourth = a + b + s;
            a = b;
            b = s;
            s = fourth;

            System.out.print(fourth + " ");
        }

        sc.close();

    }

}
