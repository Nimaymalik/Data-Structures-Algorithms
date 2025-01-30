package Top150Questions;

public class ReverseWordInString {
    public static String reverseWords(String s) {

        // removinf the space for last and from between
        String[] str = s.trim().split("\\s+");

        // use of string builder to append the string into new string
        StringBuilder newStr = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            newStr.append(str[i]);// adding the word to newStr

            // adding the spaces after every word
            if (i > 0) {
                newStr.append(" ");
            }
        }

        return newStr.toString();

    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

}
