package Binary_tree;

public class ReplaceNodeWithDepth {
    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        //Your code goes here
        changeToDepthTree(root,0);
    }

    public static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth)
    {
        if (root==null)
        {
            return;
        }
        root.data=depth;
        changeToDepthTree(root.left,depth+1);
        changeToDepthTree(root.right,depth+1);
    }
}
