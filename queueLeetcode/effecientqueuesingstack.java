package queueLeetcode;

import java.util.Stack;

public class effecientqueuesingstack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public effecientqueuesingstack() {
        first = new Stack<>();
        second = new Stack<>();

    }

    public void add(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());

        }
        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());

        }

    }

    public int peek() throws Exception {
        return first.peek();

    }

    public int remove(int item) {
        return first.pop();
    }

}
