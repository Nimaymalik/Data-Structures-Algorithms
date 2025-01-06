package Strings;

public class subsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i != s.length() && j != t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            } else {

                j++;
            }

        }
        return i == s.length();

    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgd";

        System.out.println(isSubsequence(s, t));

    }

}
