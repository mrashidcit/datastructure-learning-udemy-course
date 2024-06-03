package CircularQueueUsingArray;

public class Main {
    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(3);
//        System.out.println(newCQ.isEmpty());
//        System.out.println(newCQ.isFull());
        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
//        System.out.println(newCQ.deQueue());
//        System.out.println(newCQ.deQueue());

//        System.out.println(newCQ.peek());
//        System.out.println(newCQ.peek());
//        System.out.println(newCQ.peek());

        newCQ.deleteQueue();
        newCQ.enQueue(10);

    }

}
