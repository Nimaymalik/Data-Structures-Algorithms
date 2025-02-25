import java.util.Scanner;

// to create a non static method we have to create an instance of the mehtod
class NotStatic {
    public int NonStatic(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        NotStatic ans = new NotStatic();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("The sum is: " + ans.NonStatic(a, b));
        sc.close();
    }
}