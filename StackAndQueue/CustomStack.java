package StackAndQueue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];

    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack isFUll");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackExceptions {
        if (isEmpty()) {
            throw new StackExceptions("Cannot pop from empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws StackExceptions {
        if (isEmpty()) {
            throw new StackExceptions("Cannot show item as stack is empty");
        }
        return data[ptr];
    }

    protected boolean isFull() {
        return ptr == data.length - 1;

    }

    protected boolean isEmpty() {
        return ptr == -1;
    }

}
