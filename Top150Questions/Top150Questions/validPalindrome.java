package Top150Questions;

public class validPalindrome {
    public static boolean isPalindrome(String str) {

        String lower = str.toLowerCase().replaceAll("[: , .]", "");

        int i = 0;
        int j = lower.length() - 1;

        if (str.length() <= 1) {
            return true;
        }

        while (i < j) {
            if (lower.charAt(i) == lower.charAt(j)) {

                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "a.";
        System.out.println(isPalindrome(s));

    }
}