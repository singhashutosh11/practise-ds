package DataStructureAndAlgo.tree;

public class BinarySearchTree extends BinaryTree{

    private int data;
    private BinarySearchTree leftNode;
    private BinarySearchTree rightNode;


    public void setData(int data) {

        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setLeftNode(BinarySearchTree left) {
        this.leftNode = left;
    }

    public BinarySearchTree getLeftNode() {
        return leftNode;
    }

    public void setRightNode(BinarySearchTree right) {
        this.rightNode = right;
    }

    public BinarySearchTree getRightNode() {
        return rightNode;
    }

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

        BinarySearchTree bst=new BinarySearchTree();
//        BinarySearchTree bst1=(bst.findElementInBSTUsingRecursive(bt1,5));
//        System.out.println(bst1.getData());
//        BinarySearchTree bst2=(bst.findElementInTree(bt1,6));
//        System.out.println(bst2.getData());
        System.out.println(bst.findMinimumInBSTusingRecursive(bt1));
        System.out.println(bst.findMinimumInBSTwithoutRecursion(bt1));
        System.out.println(bst.findMaximumInBSTWithRecursion(bt1));
        BinarySearchTree bst3=(bst.insertNewData(bt1,9));
        System.out.println(bst3.findMaximumInBSTWithRecursion(bst3));
        BinaryTree tr=new BinaryTree();
        tr.inorderTraversalRecursively(bst3);
        BinarySearchTree bst4=bst3.deleteElementFromBST(bst3,8);
        System.out.println();
        tr.inorderTraversalRecursively(bst4);
    }

    public BinarySearchTree findElementInBSTUsingRecursive(BinarySearchTree root, int data){

        if(root==null) return null;
       // if(data==root.getData()) return root;

        if(data<root.getData()){

            return findElementInBSTUsingRecursive(root.getLeftNode(),data);
        }else if(data>root.getData()){

            return findElementInBSTUsingRecursive(root.getRightNode(),data);
        }

        return root;
    }

    public BinarySearchTree findElementInTree(BinarySearchTree root, int data){

        if(root==null) return null;
        while(root!=null){

            if(data==root.getData()) return root;
            if(data<root.getData()){

                root=root.getLeftNode();
            }else if(data>root.getData()){

                root=root.getRightNode();
            }
        }
        return root;
    }

    public int findMinimumInBSTusingRecursive(BinarySearchTree root){
        int data=0;
        if(root==null) return 0;

        if(root.getLeftNode()==null) {

            return root.getData();
        }  else {
            return findMinimumInBSTusingRecursive(root.getLeftNode());

        }
    }

    public int findMinimumInBSTwithoutRecursion(BinarySearchTree root) {
        int data = 0;
        if (root == null) return 0;
        while (root.getLeftNode() != null) {

            root = root.getLeftNode();
            data = root.getData();
        }
        return data;
    }

    public int findMaximumInBSTWithRecursion(BinarySearchTree root){

        if(root==null) return 0;
        if(root.getRightNode()==null){
            return root.getData();
        }else {

            return findMaximumInBSTWithRecursion(root.getRightNode());
        }

    }

    public BinarySearchTree insertNewData(BinarySearchTree root, int data){

        if(root==null){{
            root=new BinarySearchTree();
        }
        if(root==null) {

            System.out.println("memory error");
        }else{

            root.setData(data);
            root.setLeftNode(null);
            root.setRightNode(null);
        }}else {

            if(data<root.getData()){
                root.setLeftNode(insertNewData(root.getLeftNode(),data));
            }else if(data>root.getData()){
                root.setRightNode(insertNewData(root.getRightNode(),data));
            }


        }
        return root;
    }

    // not completed

    public BinarySearchTree deleteElementFromBST(BinarySearchTree root, int data) {

        BinarySearchTree tempNode;
        if (root == null) {
            System.out.println("Data not found in tree");
            return null;
        }
        if (data < root.getData()) {
            root.leftNode = deleteElementFromBST(root.getLeftNode(), data);
        } else if (data > root.getData()) {
            root.rightNode = deleteElementFromBST(root.getRightNode(), data);
        }else {
            // if nodeToBeDeleted have both children
            if (root.getLeftNode()!= null && root.getRightNode() != null) {

                // Finding maximum element from left
                int temp = findMaximumInBSTWithRecursion(root.getLeftNode());
                // Replacing current node with minimum node from rightChild subtree
                root.data = temp;
                // Deleting maximum node from left now
                root.leftNode = deleteElementFromBST(root.getLeftNode(), root.getData());
            }
            // node to be delleted have one child
            else if (root.getLeftNode() == null) {
                // if nodeToBeDeleted has only left child
                root = root.getRightNode();
            } else if (root.getRightNode() == null) {
                // if nodeToBeDeleted has only rightChild child
                root = root.getLeftNode();
            }
            // if nodeToBeDeleted do not have child (Leaf node)
            else
                root = null;
        }
        return root;
    }



    }


