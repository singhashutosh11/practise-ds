package DataStructureAndAlgo.linkList;

public class DoubleLinkList {

    private int data;
    private DoubleLinkList next;
    private DoubleLinkList previous;

    private void setData(int data){
        this.data=data;
    }
    private void setNext(DoubleLinkList next){

        this.next=next;
    }

    private void setPrevious(DoubleLinkList previous){
        this.previous=previous;
    }

    public int getData(){
        return data;
    }

    public DoubleLinkList getNext() {
        return this.next;
    }

    public DoubleLinkList getPrevious() {
        return this.previous;
    }

    public static void main(String[] args){

    }

    public int getDoubleLinkListLength(DoubleLinkList headNode){

        int lenght=0;
        DoubleLinkList currentNode=headNode;
        while(headNode!=null){
            headNode.getNext();
            lenght++;

        }
        return lenght;
    }

    public DoubleLinkList insetNodetoDLLatAnyPosition(DoubleLinkList headnode, DoubleLinkList newNode, int position){

        if(headnode==null){
            System.out.println("not valid DLL");
        }

        int size=getDoubleLinkListLength(headnode);

        if (position>size+1 || position<1){

            System.out.println("position is not valid");
        }

        if(position==1){

            newNode.setNext(headnode);
            headnode.setPrevious(newNode);
            return newNode;
        } else{

            DoubleLinkList previouNode=headnode;
            int count=1;

            while(count<position-1){

                previouNode=previouNode.getNext();
                count++;
            }
            DoubleLinkList currentNode=previouNode.getNext();
            newNode.setNext(currentNode);
            if(currentNode!=null){
                currentNode.setPrevious(newNode);
            }
            previouNode.setNext(newNode);
            newNode.setPrevious(previouNode);


        }
        return headnode;
    }

    public DoubleLinkList deleteFromDLLatAnyPosition(DoubleLinkList headNode, int position){

        if(headNode==null){
            System.out.println("Link List not present");
        }

        int size=getDoubleLinkListLength(headNode);
        if(position>size || position <1){

            System.out.println("Invalid postion, size of the Single link list is" +size);

        }

        if(position==1){

            DoubleLinkList currenNode=headNode.getNext();
            headNode=null;
            currenNode.setPrevious(null);
            return currenNode;
        }else {

            int count=1;
            DoubleLinkList previousNode=headNode.getNext();
            while(count<position-1){

                previousNode=previous.getNext();
                count++ ;
            }
            DoubleLinkList currentNode=previousNode.getNext();
            DoubleLinkList laterNode=currentNode.getNext();

            previousNode.setNext(laterNode);
            if(laterNode!=null){

                previousNode.setPrevious(laterNode);
                currentNode=null;
            }

        }

        return headNode;
    }
}
