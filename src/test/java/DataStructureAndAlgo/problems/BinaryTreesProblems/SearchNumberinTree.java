package DataStructureAndAlgo.problems.BinaryTreesProblems;

import DataStructureAndAlgo.queue.ObjectArrayQueue;
import DataStructureAndAlgo.tree.BinaryTree;

public class SearchNumberinTree {


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

        SearchNumberinTree tr=new SearchNumberinTree();
        tr.searchNumberinTree(bt1,8);

}

    public void searchNumberinTree(BinaryTree root, int data) {

        ObjectArrayQueue queue = new ObjectArrayQueue(1);
        queue.enQueue(root);
        BinaryTree tempNode;
        int temp;
        while (!queue.isQueueEmpty()) {
            tempNode = (BinaryTree) queue.deQueue();
            temp = tempNode.getData();
            if (temp == data) {
                System.out.println("found");
                break;
            }
            if (tempNode.getLeftNode() != null)
                queue.enQueue(tempNode.getLeftNode());
            if (tempNode.getRightNode() != null)
                queue.enQueue(tempNode.getRightNode());
        }

    }

}
