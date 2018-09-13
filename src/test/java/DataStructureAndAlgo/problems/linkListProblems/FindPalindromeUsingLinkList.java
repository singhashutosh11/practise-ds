package DataStructureAndAlgo.problems.linkListProblems;

import DataStructureAndAlgo.linkList.SingleLinkList;
// not implemented
public class FindPalindromeUsingLinkList {

    SingleLinkList sll;

    public FindPalindromeUsingLinkList(){
        sll= new SingleLinkList();
    }

    public SingleLinkList node(){
        int data=1;
        SingleLinkList next;
        return node();
    }

    public void polindrome(){
        SingleLinkList headNode=null;
        sll.setNext(node());
        for(int i=0; i<6; i++){

         sll.getNext();
         sll.setData(i);

        }
        System.out.println(sll.getNext());




    }

    public static void main(String[] args) {

        FindPalindromeUsingLinkList p= new FindPalindromeUsingLinkList();
        p.polindrome();
    }
}
