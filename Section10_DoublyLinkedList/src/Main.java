public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(5, 7);
//        System.out.println(dll.head.next.value);
//        System.out.println(dll.tail.value);
//        dll.traverseDLL();
//        dll.reverseTraverseDLL();
//        dll.searchNode(7);
//        dll.traverseDLL();
//        dll.deleteNodeDLL(3);
        dll.traverseDLL();
        dll.deleteDLL();
        dll .traverseDLL();
    }
}