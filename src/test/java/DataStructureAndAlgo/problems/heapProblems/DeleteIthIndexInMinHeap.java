package DataStructureAndAlgo.problems.heapProblems;

import DataStructureAndAlgo.priorityQueueAndHeaps.Heap;

public class DeleteIthIndexInMinHeap {

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

        System.out.println(di);
        for(int j=0; j<hp.count; j++)
            System.out.print(hp.array[j]+" ");
        System.out.println();
        di.deleteIthIndexInMinHeap(hp,4);

    }

    public void insertDatainMinHeap(Heap h, int data){

        h.count++;
        int i=h.count-1;

        while(i>0 && data<h.array[(i-1)/2]){

            h.array[i]=h.array[(i-1)/2];
            i=(i-1)/2;
        }
        h.array[i]=data;
    }

    protected void deleteIthIndexInMinHeap(Heap hp,int i){

        int temp=hp.array[i];
        hp.array[i]=hp.array[hp.count-1];
        hp.array[hp.count-1]=temp;
        hp.count--;
        percolateUp(hp,0);
        for(int j=0; j<hp.count; j++)
            System.out.print(hp.array[j]+" ");


    }


    private void percolateUp(Heap hp, int i){

        int l,r,min;
        l=2*i+1;
        r=2*i+2;

        if(l<hp.count && hp.array[l]<hp.array[i]){
            min=l;
        }else{
            min=i;
        }
        if(r<hp.count && hp.array[r]<hp.array[min]){
            min=l;
        }

        if(min!=i){

            int temp=hp.array[i];
            hp.array[i]=hp.array[min];
            hp.array[min]=temp;
            percolateUp(hp,min);

        }
    }
}
