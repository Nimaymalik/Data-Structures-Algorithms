package StackAndQueue;

public class CustomQueue {
    private int[] data;
    static private int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);

    }

    public CustomQueue(int size) {
        this.data = new int[size];

    }

    // queue is empty
    int end = -1;

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        end++;
        data[end] = item;

        return true;

    }

    public int delete() throws Exception {
        if (isEmpty()) {
            throw new Error("Queue is Empty");

        }
        int removed = data[0];

        // shift the lement to left
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];

        }
        end--;
        return removed;

    }

    public void display() {

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "<-");

        }
        System.out.println("END");
    }

    public int front(int item) throws Exception {
        if (isEmpty()) {
            throw new Error("Queue is Empty");

        }
        return data[0];
    }

    public boolean isFull() {
        return end == data.length - 1;

    }

    public boolean isEmpty() {
        return end == -1;
    }

}
