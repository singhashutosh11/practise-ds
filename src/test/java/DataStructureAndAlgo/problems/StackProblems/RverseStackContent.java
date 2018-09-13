package DataStructureAndAlgo.problems.StackProblems;

import DataStructureAndAlgo.stack.DynamicArrayStack;
import DataStructureAndAlgo.stack.LinkListStack;

public class RverseStackContent {

    public static void main(String[] args){

        DynamicArrayStack stack1=new DynamicArrayStack();
        LinkListStack stack2=new LinkListStack();
        stack1.pushData(1);
        stack1.pushData(3);
        stack1.pushData(5);
        stack1.pushData(8);
        stack1.pushData(6);

        stack2.pushData(1);
        stack2.pushData(3);
        stack2.pushData(5);
        stack2.pushData(8);
        stack2.pushData(6);

   //     DynamicArrayStack stack3=reverseUsingStack(stack1);
        LinkListStack stack4=reverseUsingStackLinkList(stack2);
        System.out.println(stack4);


    }

    public static DynamicArrayStack reverseUsingStack(DynamicArrayStack stack){

        if(stack.isStackEmpty()) return stack;
        int temp=stack.pop();
        reverseUsingStack(stack);
        insertBottem(stack,temp);
        return stack;
    }

    public static void insertBottem(DynamicArrayStack s,int data){

        if(s.isStackEmpty()) s.pushData(data);
        int temp=s.pop();
        insertBottem(s,data);
        s.pushData(temp);
    }

    public static LinkListStack reverseUsingStackLinkList(LinkListStack stackL){

        if(stackL.isStackEmpty()) return stackL;
        int temp=stackL.pop();
        reverseUsingStackLinkList(stackL);
        insertBottemL(stackL,temp);
        return stackL;
    }

    public static void insertBottemL(LinkListStack sL,int data){

        if(sL.isStackEmpty()) sL.pushData(data);
        int temp=sL.pop();
   //     insertBottemL(sL,data);
        sL.pushData(temp);
    }
}
