package DataStructureAndAlgo.problems.linkListProblems;

import DataStructureAndAlgo.linkList.SingleLinkList;

public class FindMiddleOfLinkList {

    public static void main(String[] args){

        SingleLinkList sll=new SingleLinkList();
        sll.addDataToSLL(sll,1);
        sll.addDataToSLL(sll,2);
        sll.addDataToSLL(sll,4);
        sll.addDataToSLL(sll,5);
        sll.addDataToSLL(sll,7);

        FindMiddleOfLinkList fm=new FindMiddleOfLinkList();
        SingleLinkList ptr2= fm.findMiddlefLinkList(sll.getNext());
        System.out.println(ptr2.getData());
    }

    public SingleLinkList findMiddlefLinkList(SingleLinkList headNode){

        SingleLinkList ptr1=headNode;
        SingleLinkList ptr2=headNode;
        int i=0;

        while(ptr1.getNext()!=null)

            if(i==0){

            ptr1=ptr1.getNext();
            i=1;

            }else if(i==1){

                ptr1=ptr1.getNext();
                ptr2=ptr2.getNext();
            }

        return ptr2;
    }
}
