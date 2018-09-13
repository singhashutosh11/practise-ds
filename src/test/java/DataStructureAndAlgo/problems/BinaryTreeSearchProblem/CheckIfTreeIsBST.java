package DataStructureAndAlgo.problems.BinaryTreeSearchProblem;

import DataStructureAndAlgo.stack.ObjectArrayStack;
import DataStructureAndAlgo.tree.BinarySearchTree;

public class CheckIfTreeIsBST extends BinarySearchTree{

    public static void main(String[] args) {

        BinarySearchTree bt1 = new BinarySearchTree();
        BinarySearchTree bt2 = new BinarySearchTree();
        BinarySearchTree bt3 = new BinarySearchTree();
        BinarySearchTree bt4 = new BinarySearchTree();
        BinarySearchTree bt5 = new BinarySearchTree();
        BinarySearchTree bt6 = new BinarySearchTree();
        BinarySearchTree bt7 = new BinarySearchTree();
        bt1.setData(4);
//        bt2=bt1.getLeftNode();
        bt1.setLeftNode(bt2);
        bt2.setData(2);
        bt1.setRightNode(bt3);
        bt3.setData(6);
//        bt3=bt2.getLeftNode();
        bt2.setLeftNode(bt4);
        bt4.setData(1);
//        bt4=bt2.getRightNode();
        bt2.setRightNode(bt5);
        bt5.setData(3);
        bt3.setLeftNode(bt6);
        bt6.setData(5);
        bt3.setRightNode(bt7);
        bt7.setData(7);

        CheckIfTreeIsBST bst=new CheckIfTreeIsBST();
        System.out.println(bst.isBST(bt1));
        System.out.println(bst.isBSTotherway(bt1));

    }

    public boolean isBST(BinarySearchTree root){

        if(root==null) return true;

        if(root.getLeftNode()!=null && findMaximumInBSTWithRecursion(root.getLeftNode())>root.getData()) return false;
        if(root.getRightNode()!=null && findMinimumInBSTusingRecursive(root.getRightNode())<root.getData()) return false;
        if(!(isBST(root.getLeftNode())) || !(isBST(root.getRightNode()))) return false;
        else
            return true;
    }

    public boolean isBSTotherway(BinarySearchTree root){

        int temp=0;

        ObjectArrayStack stack=new ObjectArrayStack();

        while (true){

            while (root!=null){

                stack.pushData(root); //use root
                root=root.getLeftNode();
            }

            if(stack.isStackEmpty()){
                break;
            }
            root=(BinarySearchTree) stack.pop();
            if(temp>root.getData()){
                return false;
            }else {
                temp=root.getData();
            }
            root=root.getRightNode();
        }
        return true;

    }
}
