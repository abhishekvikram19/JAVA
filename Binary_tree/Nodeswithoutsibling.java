package Binary_tree;

import java.util.Scanner;

public class Nodeswithoutsibling {

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }
        else{
            if(isLeft){
                System.out.println("Enter left child of "+ parentData);
            }
            else{
                System.out.println("Enter right child of"+ parentData);
            }
        }
        Scanner s= new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
        root.left= leftChild;
        root.right= rightChild;
        return root;
    }



    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root==null)
        {
            return;
        }

        if (root.left==null && root.right==null)
        {
            return;
        }

        if (root.left==null)
        {
            System.out.print(root.right.data+" ");
            printNodesWithoutSibling(root.right);
        }
        else if (root.right==null)
        {
            System.out.print(root.left.data+" ");
            printNodesWithoutSibling(root.left);

        }
        else
        {
            printNodesWithoutSibling(root.left);
            printNodesWithoutSibling(root.right);
        }
    }
    public static void main(String[] args){

        BinaryTreeNode<Integer> root= takeTreeInputBetter(true, 0, true);
        System.out.println(printNodesWithoutSibling(root.data));
    }

    private static boolean printNodesWithoutSibling(Integer data) {
        return false;
    }
}
