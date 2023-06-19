package Binary_tree;

public class DiameterOfBinaryTree {
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null) {
            return 0;
        }
        return findHeight(root.left) + findHeight(root.right) + 1;
    }

    public static int findHeight(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

}
