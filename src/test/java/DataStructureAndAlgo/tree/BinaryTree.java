package DataStructureAndAlgo.tree;

import DataStructureAndAlgo.queue.ObjectArrayQueue;
import DataStructureAndAlgo.stack.ObjectArrayStack;

public class BinaryTree {

    private int data;
    private BinaryTree leftNode;
    private BinaryTree rightNode;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setLeftNode(BinaryTree leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTree getLeftNode() {
        return leftNode;
    }

    public void setRightNode(BinaryTree rightNode) {
        this.rightNode = rightNode;
    }

    public BinaryTree getRightNode() {
        return rightNode;
    }

    public static void main(String[] args) {

        BinaryTree bt1=new BinaryTree();
        BinaryTree bt2=new BinaryTree();
        BinaryTree bt3=new BinaryTree();
        BinaryTree bt4=new BinaryTree();
        BinaryTree bt5=new BinaryTree();
        BinaryTree bt6=new BinaryTree();
        BinaryTree bt7=new BinaryTree();
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

        System.out.println("PreOrder");
        bt1.preOrderTraversalRecursively(bt1);
        System.out.println();
        bt1.preOrderTraversalWithoutRecursion(bt1);
        System.out.println();
        System.out.println("InOrder");
        bt1.inorderTraversalRecursively(bt1);
        System.out.println();
        bt1.inorderTraversalWithoutRecursively(bt1);
        System.out.println();
        System.out.println("PostOrder");
        bt1.postOrderTraversalRecursively(bt1);
        System.out.println();
        System.out.println("LevelOrde");
        bt1.levelOrderTraversing(bt1);



    }

    public void preOrderTraversalRecursively(BinaryTree root){

        if(root!=null){
            System.out.print(root.getData());
            preOrderTraversalRecursively(root.getLeftNode());
            preOrderTraversalRecursively(root.getRightNode());

        }
    }

    public void preOrderTraversalWithoutRecursion(BinaryTree root){

        ObjectArrayStack stack= new ObjectArrayStack();


        while (true){

            while (root!=null){

                System.out.print(root.getData());
                stack.pushData(root);
                root=root.getLeftNode();
            }
            if(stack.isStackEmpty()){
                break;
            }

           root=(BinaryTree)stack.pop();
            root=root.getRightNode();
        }
        return;
    }

    public void inorderTraversalRecursively(BinaryTree root){

        if(root!=null){
            inorderTraversalRecursively(root.getLeftNode());
            System.out.print(root.getData());
            inorderTraversalRecursively(root.getRightNode());
        }
    }

    public void inorderTraversalWithoutRecursively(BinaryTree root){

        ObjectArrayStack stack=new ObjectArrayStack();

        while (true){

            while (root!=null){

                stack.pushData(root); //use root
                root=root.getLeftNode();
            }

            if(stack.isStackEmpty()){
                break;
            }
            root=(BinaryTree)stack.pop();
            System.out.print(root.getData());
            root=root.getRightNode();
        }
        return;

    }

    public void postOrderTraversalRecursively(BinaryTree root){

        if(root!=null){

            postOrderTraversalRecursively(root.getLeftNode());
            postOrderTraversalRecursively(root.getRightNode());
            System.out.print(root.getData());

        }

    }
  // not completed
    public void postOrderTraversalWithoutRecursion(BinaryTree root) {

        ObjectArrayStack stack = new ObjectArrayStack();

        while (true) {

            while (root != null) {

                stack.pushData(root);
                root = root.getLeftNode();
            }
            if (stack.isStackEmpty()) {
                break;
            }

            if (((BinaryTree)stack.top()).getRightNode() == null)  //actual DataStructureAndAlgo.stack.top().getRightNode
            {


                root=(BinaryTree)stack.pop();

                System.out.print(root.getData());
                if(root==((BinaryTree)stack.top()).getRightNode()){

                }


            }
        }

    }

    public void levelOrderTraversing(BinaryTree root) {

        ObjectArrayQueue queue= new ObjectArrayQueue(1);
        queue.enQueue(root);

        if(root==null){
            return;
        }

        while(!queue.isQueueEmpty()){

            BinaryTree temp=(BinaryTree) queue.deQueue();
            System.out.print(temp.getData());
            if(temp.getLeftNode()!=null){
                queue.enQueue(temp.getLeftNode());
            }
            if(temp.getRightNode()!=null){
                queue.enQueue(temp.getRightNode());
            }

        }
    }
}
