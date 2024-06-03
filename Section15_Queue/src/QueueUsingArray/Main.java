package QueueUsingArray;

public class Main {
    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(3);
//        System.out.println(newQueue.isEmpty());
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());

//        System.out.println(newQueue.peek());
//        System.out.println(newQueue.peek());
//        System.out.println(newQueue.peek());

        newQueue.deleteQueue();
        System.out.println(newQueue.peek());

    }
}
