package DataStructureAndAlgo.stack;

import DataStructureAndAlgo.linkList.SingleLinkList;

public class LinkListStack {

    private SingleLinkList headNode;
//
//    public LinkListStack(SingleLinkList headNode) {
//
//        this.headNode=headNode;
//
//    }

    public boolean isStackEmpty() {

        if (headNode == null) {
            return true;
        } else return false;
    }

    public void pushData(int data){

        if(headNode==null){

             headNode= new SingleLinkList();
             headNode.setData(data);
        } else if(headNode.getData()==0){
            headNode.setData(data);
        } else {

            SingleLinkList newNode= new SingleLinkList();
            newNode.setNext(headNode);
            newNode.setData(data);
            headNode=newNode;

        }

    }

    public void deleteStack() {

        headNode = null;
    }

    public int top() {

        if (isStackEmpty()) {
            System.out.println("DataStructureAndAlgo.stack is empty");
            return 0;
        } else {
            return headNode.getData();
        }
    }

    public int pop() {


        if (isStackEmpty()) {
            System.out.println("DataStructureAndAlgo.stack is empty");
            return 0;
        } else {
            int data = headNode.getData();
            headNode = headNode.getNext();
            return data;
        }

    }

    public static void main(String[] args){


        LinkListStack stack=new LinkListStack();
        System.out.println(stack.isStackEmpty());
       // System.out.println(DataStructureAndAlgo.stack.isStackFull());
        stack.pop();
        System.out.println(stack.top());
        stack.pushData(3);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        stack.pushData(4);
        stack.pushData(5);
        stack.pushData(6);
        stack.pushData(7);
        stack.pushData(8);
        System.out.println(stack.isStackEmpty());
       // System.out.println(DataStructureAndAlgo.stack.isStackFull());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.deleteStack();
        stack.pop();
        System.out.println(stack.isStackEmpty());
      //  System.out.println(DataStructureAndAlgo.stack.isStackFull());


    }

}
