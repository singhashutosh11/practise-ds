package DataStructureAndAlgo.problems.BinaryTreeSearchProblem;

import DataStructureAndAlgo.tree.BinarySearchTree;
import DataStructureAndAlgo.tree.BinaryTree;

public class ConvertSortedSLLtoBST {


    public static void main(String[] args) {
        int left,right;
        int[] array = {1, 2, 3, 4, 5, 6};
        left=0;
        right=array.length-1;
        ConvertSortedSLLtoBST cbst=new ConvertSortedSLLtoBST();
        BinaryTree rt=cbst.convertSortedArrayToBST(array,left,right);
        BinaryTree tr=new BinaryTree();
        tr.inorderTraversalRecursively(rt);
    }

    public BinarySearchTree convertSortedArrayToBST(int[] A, int left, int right){



        BinarySearchTree newNode = new BinarySearchTree();
        if(left>right){
            return null;
        }
        if(left==right){
            newNode.setData(A[left]);
            newNode.setRightNode(null);
            newNode.setLeftNode(null);
        }else{

            int mid=left+(right-left)/2;
            newNode.setData(A[mid]);
            newNode.setLeftNode(convertSortedArrayToBST(A,left,mid-1));
            newNode.setRightNode(convertSortedArrayToBST(A,mid+1,right));

        }
        return newNode;



    }

}
