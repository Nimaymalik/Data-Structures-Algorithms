package StackAndQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {

        CustomQueue queue = new CustomQueue(5);

        queue.insert(23);
        queue.insert(22);
        queue.insert(213);
        queue.insert(223);
        queue.insert(233);

        queue.display();
        System.out.println(queue.delete());
    }

}
