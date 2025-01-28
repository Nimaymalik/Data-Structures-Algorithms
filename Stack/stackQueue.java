package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(3);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(34);
        queue.add(45);
        queue.add(3);
        queue.add(9);
        queue.add(18);

        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }

}
