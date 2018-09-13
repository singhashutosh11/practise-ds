package DataStructureAndAlgo.problems.BinaryTreesProblems;

import DataStructureAndAlgo.queue.ObjectArrayQueue;
import DataStructureAndAlgo.tree.BinaryTree;

public class FindMaxinTree {

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

        FindMaxinTree tr=new FindMaxinTree();
        System.out.println(tr.findMaxValueinTreeUsngQueue(bt1));
        System.out.println(tr.findMaxUsingRecursion(bt1));


    }

    public int findMaxValueinTreeUsngQueue(BinaryTree root){

        ObjectArrayQueue queue=new ObjectArrayQueue(1);
        int max=0;
        queue.enQueue(root);
        BinaryTree tempNode;
        int temp;
        while (!queue.isQueueEmpty()) {
            tempNode = (BinaryTree) queue.deQueue();
            temp = tempNode.getData();
            if (temp > max) {
                max = temp;
            }
            if (tempNode.getLeftNode() != null)
                queue.enQueue(tempNode.getLeftNode());
            if (tempNode.getRightNode() != null)
                queue.enQueue(tempNode.getRightNode());
        }
         return max;
        }

        public  int findMaxUsingRecursion(BinaryTree root){
        int value,left,right,max=0;
        if(root!=null){

             value=root.getData();
             left=findMaxUsingRecursion(root.getLeftNode());
             right=findMaxUsingRecursion(root.getRightNode());


        if(left<right){
            max=right;
        }else {
            max=left;
        }
        if(value>max){
            max=value;
        }
            }

        return max;
        }
    }



