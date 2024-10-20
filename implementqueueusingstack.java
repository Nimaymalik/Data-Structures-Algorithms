// this program is  not efficient  as it treversing the whole strack again and again for removal

package queueLeetcode;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();

    }

    public void push(int item) {
        first.push(item);
    }

    public int pop() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;

    }

    public boolean isEmpty() {
        return first.isEmpty();

    }

    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;

    }

}

