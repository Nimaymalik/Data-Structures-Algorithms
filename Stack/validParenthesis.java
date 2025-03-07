package Stack;

import java.util.Stack;

public class validParenthesis {
    public static int valid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')' && !stack.isEmpty()) {
                stack.pop();
                count += 2;

            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = ")()())()(()";
        System.out.println(valid(s));

    }

}
