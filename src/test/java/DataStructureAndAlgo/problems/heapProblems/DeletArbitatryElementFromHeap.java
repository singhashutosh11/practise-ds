package DataStructureAndAlgo.problems.heapProblems;

import DataStructureAndAlgo.priorityQueueAndHeaps.Heap;
import DataStructureAndAlgo.queue.ObjectArrayQueue;

public class DeletArbitatryElementFromHeap extends DeleteIthIndexInMinHeap {


    public static void main(String[] args) {
        DeleteIthIndexInMinHeap di=new DeleteIthIndexInMinHeap();
        Heap hp=new Heap(12,0);
        di.insertDatainMinHeap(hp,31);
        di.insertDatainMinHeap(hp,1);
        di.insertDatainMinHeap(hp,21);
        di.insertDatainMinHeap(hp,5);
        di.insertDatainMinHeap(hp,10);
        di.insertDatainMinHeap(hp,12);
        di.insertDatainMinHeap(hp,18);
        di.insertDatainMinHeap(hp,3);
        di.insertDatainMinHeap(hp,2);
        di.insertDatainMinHeap(hp,8);
        di.insertDatainMinHeap(hp,7);

        int x=new DeletArbitatryElementFromHeap().findDataInHeap(hp,10);
        System.out.println(x);
        for(int j=0; j<hp.count; j++)
            System.out.print(hp.array[j]+" ");
        di.deleteIthIndexInMinHeap(hp,x);
        System.out.println();
        for(int j=0; j<hp.count; j++)
            System.out.print(hp.array[j]+" ");


    }

    public int findDataInHeap(Heap hp, int data){
         int i=0;
        ObjectArrayQueue qu=new ObjectArrayQueue(1);
        while(i<hp.count){


            if(hp.array[i]==data){
                return i;
            }
            i++;
        }
        return -1;

    }
}
