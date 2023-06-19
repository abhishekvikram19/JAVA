package Binary_tree;

public class PreorderTraversals {
    public static void Preorder(BinaryTreeNode<Integer> root){
        if (root==null)
            return;
        System.out.println(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
}
