public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 5);
        sLL.insertInLinkedList(10, 6);
//        System.out.println(" " + sLL.head.next.next.value);
//        sLL.traverseSinglyLinkedList();
//        sLL.searchNode(10);
        sLL.traverseSinglyLinkedList();
//        sLL.deletionOfNode(4);
        sLL.deleteSLL();
        sLL.traverseSinglyLinkedList();

    }
}