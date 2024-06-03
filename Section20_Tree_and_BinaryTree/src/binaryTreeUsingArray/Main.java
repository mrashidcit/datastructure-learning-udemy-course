package binaryTreeUsingArray;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
//        binaryTree.insert("N8");
//        binaryTree.insert("N9");
//        binaryTree.insert("N6");
//        binaryTree.preOrder(1);
//        binaryTree.inOrder(1);
//        binaryTree.postOrder(1);
//        binaryTree.levelOrder();
//        binaryTree.search("N5");
//        binaryTree.levelOrder();
//        System.out.println();
//
//        binaryTree.delete("N5");
//        binaryTree.levelOrder();

        binaryTree.deleteBT();
        binaryTree.levelOrder();
    }


}
