public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
//        newBST.preOrder(newBST.root);
//        newBST.inOrder(newBST.root);
//        newBST.postOrder(newBST.root);
//        newBST.levelOrder();
//        newBST.search(newBST.root, 40);

//        newBST.levelOrder();
//        System.out.println();
////        newBST.deleteNode(newBST.root, 40);
////        newBST.deleteNode(newBST.root, 90);
//        newBST.deleteNode(newBST.root, 70);
//        newBST.levelOrder();

        newBST.deleteBST();
        newBST.levelOrder();

    }
}