package Binary_tree;
import java.util.*;
public class BinaryTreeUse{

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

    public static void main(String[] args){

        BinaryTreeNode<Integer> root= takeTreeInputBetter(true, 0, true);
    }
}

