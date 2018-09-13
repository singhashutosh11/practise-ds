package DataStructureAndAlgo.problems.BinaryTreesProblems;

import DataStructureAndAlgo.queue.ObjectArrayQueue;
import DataStructureAndAlgo.tree.BinaryTree;

public class InsertElementInTree {

    public static void main(String[] args) {


        BinaryTree bt1 = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();
        BinaryTree bt3 = new BinaryTree();
        BinaryTree bt4 = new BinaryTree();
        BinaryTree bt5 = new BinaryTree();
        BinaryTree bt6 = new BinaryTree();
        BinaryTree bt7 = new BinaryTree();
        bt1.setData(1);
//        bt2=bt1.getLeftNode();
        bt1.setLeftNode(bt2);
        bt2.setData(2);
        bt1.setRightNode(bt3);
        bt3.setData(3);
//        bt3=bt2.getLeftNode();
        bt2.setLeftNode(bt4);
        bt4.setData(4);
//        bt4=bt2.getRightNode();
        bt2.setRightNode(bt5);
        bt5.setData(5);
        bt3.setLeftNode(bt6);
        bt6.setData(6);
        bt3.setRightNode(bt7);
        bt7.setData(7);

        InsertElementInTree tr= new InsertElementInTree();
        tr.insetElementInTree(bt1,8);
        bt1.preOrderTraversalRecursively(bt1);

    }
    public void insetElementInTree(BinaryTree root, int data){

        BinaryTree newNode=new BinaryTree();
        BinaryTree tempNode;
        newNode.setData(data);
        newNode.setLeftNode(null);
        newNode.setRightNode(null);
        ObjectArrayQueue queue=new ObjectArrayQueue(1);
        queue.enQueue(root);
        while(root!=null){

            tempNode=(BinaryTree) queue.deQueue();

            if(tempNode.getLeftNode()!=null){
                queue.enQueue(tempNode.getLeftNode());
            }else {
                tempNode.setLeftNode(newNode);
                return;
            }
            if(tempNode.getRightNode()!=null){
                queue.enQueue(tempNode.getRightNode());
            }else {
                tempNode.setRightNode(newNode);
                return;
            }

        }
    }
    }
