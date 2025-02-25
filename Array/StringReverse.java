package Array;

public class StringReverse {
    public static String reverse(String s) {
        StringBuilder builder=new StringBuilder(s);
        return builder.reverse().toString();

    }

    public static void main(String[] args) {
        String s = "Nimay malik";
        System.out.println(reverse(s));

    }

}
