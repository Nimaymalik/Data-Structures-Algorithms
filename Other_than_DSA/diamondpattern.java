import java.util.Scanner;

public class diamondpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inp = sc.next().charAt(0);

        for (char i = 'A'; i <= inp; i++) {

            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println(" ");
        }

        for (char i = (char) (inp - 1); i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println(" ");

        }

        sc.close();

    }

}
