package DataStructureAndAlgo.problems.linkListProblems;

import DataStructureAndAlgo.linkList.SingleLinkList;

public class InsertNodeInSortedList {


    public SingleLinkList insertNodeinSortedLinkList(SingleLinkList headnode, SingleLinkList newNode){

        SingleLinkList currentNode=headnode;
        SingleLinkList temp=null;
        if(headnode==null){
            return newNode;
        }
        while(currentNode!=null && currentNode.getData()<newNode.getData()){

            temp=currentNode;
            currentNode=currentNode.getNext();
        }
        newNode.setNext(currentNode);
        temp.setNext(newNode);

        return headnode;
    }


}
