package DataStructureAndAlgo.problems.linkListProblems;

import DataStructureAndAlgo.linkList.SingleLinkList;

public class MergeTwoSortedLinkListInOneLinkList {

    public SingleLinkList mergeTwoSortedLinkListInOneLinkList(SingleLinkList a, SingleLinkList b){

        SingleLinkList result=null;

        if(a==null) return a;
        if(b==null) return b;

        if(a.getData()<b.getData()){

            result=a;
            result.setNext(mergeTwoSortedLinkListInOneLinkList(a.getNext(),b));
        } else{

            result=b;
            result.setNext(mergeTwoSortedLinkListInOneLinkList(b.getNext(),a));
        }

        return result;
    }
}
