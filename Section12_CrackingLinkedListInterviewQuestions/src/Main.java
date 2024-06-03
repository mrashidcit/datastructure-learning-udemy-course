public class Main {
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.createLL(1);
//        ll.insertNode(2);
//        ll.insertNode(3);
//        ll.insertNode(4);
//        ll.insertNode(5);
//        ll.traversalLL();
//        Questions questions = new Questions();
//        questions.deleteDups(ll);
//        ll.traversalLL();
//        Node node = questions.nthToLast(ll, 2);
//        System.out.println(node.value);

//        LinkedList ll = new LinkedList();
//        Questions questions = new Questions();
//        ll.createLL(1);
//        ll.insertNode(9);
//        ll.insertNode(5);
//        ll.insertNode(10);
//        ll.insertNode(2);
//        ll.traversalLL();
//        LinkedList t = questions.partition(ll, 4);
//        t.traversalLL();

        // SumLists
//        LinkedList llA = new LinkedList();
//        llA.insertNode(7);
//        llA.insertNode(1);
//        llA.insertNode(6);
//        LinkedList llB = new LinkedList();
//        llB.insertNode(5);
//        llB.insertNode(9);
//        llB.insertNode(2);
//        Questions q = new Questions();
//        LinkedList result = q.sumLists(llA, llB);
//        result.traversalLL();

        // Question 5 - Intersection
        LinkedList llA = new LinkedList();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        LinkedList llB = new LinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);
        Questions q = new Questions();
        q.addSameNode(llA, llB, 7);
        q.addSameNode(llA, llB, 2);
        q.addSameNode(llA, llB, 1);
        Node inter = q.findIntersection(llA, llB);
        System.out.println(inter.value);


    }
}