package Binary_tree;
   /*     For a given a binary tree of integers and an integer X, find and return
        the total number of nodes of the given binary tree which are having data greater than X.
*/
public class FindgraterthanX {
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root==null){
            return 0;
        }
        int count =(root.data > x) ? 1:0;
        if(root.left!=null){
            count += countNodesGreaterThanX(root.left, x);
        }
        if(root.right !=null){
            count += countNodesGreaterThanX(root.right, x);
        }
        return count;
    }
}
