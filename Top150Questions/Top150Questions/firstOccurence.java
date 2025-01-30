package Top150Questions;

public class firstOccurence {

    public static int strStr(String haystack, String needle) {

        int haylength = haystack.length();// 5
        int needlength = needle.length();// 2

        if (haylength < needlength) {
            return -1;
        }
        for (int i = 0; i < haylength - needlength; i++) {
            int j = 0;
            while (j < needlength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needlength) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String meedle = "sad";
        System.out.println(strStr(haystack, meedle));

    }
}
