package DataStructureAndAlgo.linkList;

public class CicularLinkList {

    private int data;
    private CicularLinkList next;
    private void setData(int data){
        this.data=data;
    }

    private void setNext(CicularLinkList next){

        this.next=next;
    }

    public int getData(){
        return this.data=data;
    }

    public CicularLinkList getNext() {
        return this.next;
    }

    public static void main(String[] args){

    }

    public int getLenghthOfCircularList(CicularLinkList headNode){

        int lenght=0;

        CicularLinkList currentNode=headNode;

        while(currentNode!=null) {

            currentNode = currentNode.next;
            lenght++;

            if (currentNode == headNode)
                break;
        }
        return lenght;
    }

    public void printDataOfCircularList(CicularLinkList headNode){

        CicularLinkList currentNode=headNode;

        while(currentNode!=null){

            System.out.println(currentNode.getData());
            currentNode=currentNode.getNext();
            if(currentNode==headNode){
                break;
            }
        }
    }

    public CicularLinkList insertNodeatEndofCLL(CicularLinkList headNode, CicularLinkList newNode){

        CicularLinkList currentNode=headNode;
        while (currentNode.next!=headNode){

            currentNode.setNext(currentNode.getNext());
        }
        newNode.setNext(newNode);
        if(headNode==null){
            headNode=newNode;
        }else {

            newNode.setNext(headNode);
            currentNode.setNext(newNode);
        }
        return headNode;
    }

    public CicularLinkList insertNodeatFronOfCLL(CicularLinkList headnode, CicularLinkList newNode){

        CicularLinkList currentNode=headnode;
        while(currentNode.next!=headnode){
            currentNode.setNext(currentNode.getNext());
        }
        newNode.setNext(newNode);
        if(headnode==null){
            headnode=newNode;
        }else {

            newNode.setNext(headnode);
            currentNode.setNext(newNode);
            headnode=newNode;
        }

        return headnode;
    }
}
