package DataStructureAndAlgo.queue;

import DataStructureAndAlgo.linkList.SingleLinkList;

public class LinkListQueue {

    public SingleLinkList fronNode;
    public SingleLinkList rearNode;
    public int size;


    public  static void main(String[] args){
        LinkListQueue queue=new LinkListQueue();
        System.out.println(queue.isQueueEmpty());
        queue.enQueue(5);
        System.out.println(queue.isQueueEmpty());
        queue.deQueue();
        System.out.println(queue.isQueueEmpty());
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        System.out.println(queue.getSize());
    }

    public boolean isQueueEmpty(){
        if(fronNode==null){
            return true;
        }else return false;
    }

    public void enQueue(int data){
        SingleLinkList newNode=new SingleLinkList();
        newNode.setData(data);
        if(rearNode!=null){
            newNode.setNext(newNode);

        }
        rearNode=newNode;
        if(fronNode==null){
            fronNode=rearNode;
        }
        size++;

    }
    public int deQueue(){

        int data=0;
        if(isQueueEmpty()) System.out.println("DataStructureAndAlgo.stack is empty");
        else {
            data=fronNode.getData();
        }
        fronNode=fronNode.getNext();
        size--;
        return data;
    }

    public int getSize() {
        return size;
    }
}
