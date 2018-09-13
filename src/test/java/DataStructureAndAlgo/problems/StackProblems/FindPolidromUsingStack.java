package DataStructureAndAlgo.problems.StackProblems;

import DataStructureAndAlgo.stack.LinkListStack;


// Find polindrone where 0 is mid


public class FindPolidromUsingStack {

    public  static void main(String[] args) {

        LinkListStack stack = new LinkListStack();

        int polidrome[]={3,5,7,1,0,1,7,5,3};
        int length=polidrome.length;

        if(length==1 || length==2){
            return;
        }
        int i=0;
        while(i<length){

            if(polidrome[i]==0){
                break;
            }
            stack.pushData(polidrome[i]);
            i++;
        }
        while(i+1<length){

           if(stack.pop()==polidrome[i+1]){
               i++;
           }else{
               break;
           }


        }
        if(i==length-1){
        System.out.println("String is polindrome");}
                else{

                System.out.println("String is not polindrome");

            }
    }
}
