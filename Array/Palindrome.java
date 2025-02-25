package Array;

public class Palindrome {
    public static boolean palindrome(String s) {
        String low = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        if (low.charAt(i) == low.charAt(j)) {
            i++;
            j--;
        } else {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "NimaY";
        System.out.println(palindrome(s));

    }

}
