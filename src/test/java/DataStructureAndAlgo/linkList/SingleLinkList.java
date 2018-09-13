package DataStructureAndAlgo.linkList;

public class SingleLinkList {

    protected int data;
    protected SingleLinkList next;


    public void setData(int data){
        this.data=data;
    }

    public int getData(){

        return  data;
    }

    public void setNext(SingleLinkList next){

        this.next=next;
    }

    public SingleLinkList getNext(){

        return this.next;
    }

    public static void main(String[] args){

            SingleLinkList sll=new SingleLinkList();
//            sll.addDataToSLL(sll,3);
//            sll.addDataToSLL(1);
//            sll.addDataToSLL(5);
//            sll.addDataToSLL(6);

 //             SingleLinkList head;
 //           SingleLinkList sll1=new SingleLinkList();
//            SingleLinkList sll2=new SingleLinkList();
//            SingleLinkList sll3=new SingleLinkList();
//            sll1.setData(1);
//            sll1.setNext(new SingleLinkList());
//            sll2=sll1.getNext();
//            sll2.setData(2);
//            sll2.setNext(new SingleLinkList());
//            sll3=sll2.getNext();
//            sll3.setData(3);
           // sll3.setNext(new SingleLinkList());

            SingleLinkList currentNode=sll;
            while(currentNode!=null){
                System.out.println(currentNode.getData());
                currentNode=currentNode.getNext();
            }
    }
//check this method
    public void addDataToSLL(SingleLinkList sll, int data){


        //sll.setData(data);

        while(true){

         if(sll.getNext()==null){
                sll.setNext(sll);
                break;
            }else {
                sll=sll.getNext();
            }
        }

    }

    public int linkListLenght(SingleLinkList headNode){

        int lenght=0;

        SingleLinkList currentNode=headNode;
        while(currentNode!=null){

            lenght++;
            currentNode=currentNode.getNext();
        }
        return lenght;
    }

    public SingleLinkList insterNodeToAnyPosition(SingleLinkList headNode, SingleLinkList newNode, int postion){

        if(headNode==null){
            return newNode;
        }
        int size=linkListLenght(headNode);

        if(postion>size+1 || postion <1){

            System.out.println("Invalid postion, size of the Single link list is" +size);

        }

        if(postion==1){

            newNode.setNext(headNode);
            return newNode;
        }else
        {
            SingleLinkList previousNode=headNode;
            int count=1;

            while(count<postion-1){

                count++;
                previousNode=previousNode.getNext();
            }
            SingleLinkList currentNode=previousNode.getNext();
            newNode.setNext(currentNode);
            previousNode.setNext(newNode);
        }

        return headNode;
    }

    public SingleLinkList deleteNodeFromAnyPosition(SingleLinkList headNode, int position){

        if(headNode==null){
            System.out.println("Link List not present");
        }

        int size=linkListLenght(headNode);
        if(position>size || position <1){

            System.out.println("Invalid postion, size of the Single link list is" +size);

        }

        if(position==1){

            SingleLinkList currenNode=headNode.getNext();
            headNode=null;
            return currenNode;
        }else {

            int count=1;
            SingleLinkList previousNode=headNode;
            while(count<position){

                previousNode=previousNode.getNext();
                count++;
            }

            SingleLinkList currentNode=previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode=null;
        }
        return headNode;
    }


}
