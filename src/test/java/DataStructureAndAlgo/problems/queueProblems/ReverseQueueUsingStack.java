package DataStructureAndAlgo.problems.queueProblems;

import DataStructureAndAlgo.queue.DynamicQueue;
import DataStructureAndAlgo.stack.LinkListStack;

public class ReverseQueueUsingStack {

    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue(1);
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(5);
        queue.enQueue(7);
        queue.enQueue(6);
        LinkListStack stack=new LinkListStack();

        while(!queue.isQueueEmpty()){

            stack.pushData(queue.deQueue());
        }
        while(!stack.isStackEmpty()){

            queue.enQueue(stack.pop());
        }
        System.out.println(queue.getSize());

    }

}
