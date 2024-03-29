package Binary_tree;

public class HeightOfTree {
    public static int height(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root==null)
        {
            return 0;
        }

        int smallLeftOutput=height(root.left);
        int smallRightOutput=height(root.right);
        if (smallLeftOutput>smallRightOutput)
        {
            return smallLeftOutput+1;
        }
        else
        {
            return smallRightOutput+1;
        }
    }
}
