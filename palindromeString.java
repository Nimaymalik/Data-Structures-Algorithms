import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();

        builder.append(inp);
        builder.reverse();

        if (inp.equals(builder.toString())) {
            System.out.println("Mirror is Super Fun ");
        } else {
            System.out.println("Mirror is not Super Fun");
        }

        sc.close();

    }

}
