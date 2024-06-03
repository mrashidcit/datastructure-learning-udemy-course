package QueueUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList newQLL = new QueueLinkedList();
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
//        System.out.println(newQLL.isEmpty());
//        System.out.println(newQLL.deQueue());
//        System.out.println(newQLL.deQueue());
//        System.out.println(newQLL.peek());
//        System.out.println(newQLL.peek());
        newQLL.deleteQueue();

    }
}
