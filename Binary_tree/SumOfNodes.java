package Binary_tree;

public class SumOfNodes {
    public static int getSum(BinaryTreeNode<Integer> root) {
        if (root==null)
            return 0;
        int Leftsum = getSum(root.left);
        int Rightsum = getSum(root.right);
        return Leftsum + Rightsum + root.data;
    }
}
