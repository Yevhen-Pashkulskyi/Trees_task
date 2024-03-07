public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createTree();
        System.out.println("Неупорядкований обхід (Inorder traversal):");
        tree.inorderTraversal(tree.root);
        System.out.println();
        System.out.println("Обхід передупорядкований (Preorder traversal):");
        tree.preorderTraversal(tree.root);
        System.out.println();
        System.out.println("Обхід поступорядкований (Postorder traversal):");
        tree.postorderTraversal(tree.root);
        System.out.println();
    }
}
