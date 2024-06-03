public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createDLL(1);
        cdll.insertNode(2, 0);
        cdll.insertNode(3, 2);
        cdll.insertNode(4, 3);

//        cdll.traverseCDLL();
//        cdll.reverseTraversalCDLL();
//        cdll.searchNode(9);
        cdll.traverseCDLL();
//        cdll.deleteNode(0);
        cdll.deleteCDLL();
        cdll.traverseCDLL();

    }
}