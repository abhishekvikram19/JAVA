package Binary_tree;

public class PostorderTraversals {
    public static void Postorder(BinaryTreeNode<Integer> root){
        if (root==null)
            return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data +" ");
    }
}
