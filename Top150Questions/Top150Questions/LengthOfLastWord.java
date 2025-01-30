package Top150Questions;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        int len = 0;
        String space = s.trim();
        // starting from the last element
        for (int i = space.length() - 1; i >= 0; i--) {
            if (space.charAt(i) != ' ') {
                len++;

            } else {
                break;
            }

        }
        return len;

    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));

    }

}
