public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//        csll.createCSLL(5);
//        System.out.println(csll.head.value);
//        System.out.println(csll.head.next.value);

//        csll.createCSLL(5);
//        csll.insertCLL(4,0);
//        csll.insertCLL(4,1);
//        csll.insertCLL(3,8);
////        System.out.println(csll.head.value);
//        System.out.println(csll.tail.value);

//        csll.createCSLL(5);
//        csll.insertCLL(4,0);
//        csll.insertCLL(6,1);
//        csll.insertCLL(7,8);
//        csll.traverseCSLL();
//        csll.searchNode(10);

//        csll.createCSLL(5);
//        csll.insertCLL(4,0);
//        csll.insertCLL(6,1);
//        csll.insertCLL(7,8);
//        csll.traverseCSLL();
//        csll.deleteNode(5);
//        csll.traverseCSLL();

        csll.createCSLL(5);
        csll.insertCLL(4,0);
        csll.insertCLL(6,1);
        csll.insertCLL(7,8);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();

    }
}