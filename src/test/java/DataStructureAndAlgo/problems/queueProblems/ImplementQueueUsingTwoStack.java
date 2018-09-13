package DataStructureAndAlgo.problems.queueProblems;

import DataStructureAndAlgo.stack.DynamicArrayStack;

public class ImplementQueueUsingTwoStack {

    DynamicArrayStack stack1;
    DynamicArrayStack stack2;

    public ImplementQueueUsingTwoStack(){

        stack1=new DynamicArrayStack();
        stack2=new DynamicArrayStack();

    }
    public static void main(String[] args){




    }
    // DataStructureAndAlgo.queue 1,2,3,4,5  rear=1, front=5
    public void enQueue(int data){
        stack1.pushData(data);
    }

    public int deQueue(){
        if(!stack2.isStackEmpty()){
            stack2.pop();
        }else {
            while (!stack1.isStackEmpty()) {

                stack2.pushData(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public boolean isQueueEmpty(){

        if(stack2.isStackEmpty()){

            while(!stack1.isStackEmpty()){

                stack2.pushData(stack1.pop());
            }
        }
        return stack2.isStackEmpty();
    }


}
