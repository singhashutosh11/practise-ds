package DataStructureAndAlgo.problems.heapProblems;

public class FindMaxInMinHeap {

    public int count;
    public int capacity;
    public int [] array;

    public FindMaxInMinHeap(int capacity){

        this.count=0;
        this.capacity=capacity;
        array =new int[capacity];
    }

    public static void main(String[] args) {

        FindMaxInMinHeap fh=new FindMaxInMinHeap(10);
        fh.insertInHeap(2);
        fh.insertInHeap(1);
        fh.insertInHeap(5);
        fh.insertInHeap(4);
        fh.insertInHeap(3);
        fh.insertInHeap(9);
        fh.insertInHeap(6);
        fh.insertInHeap(7);
   //     fh.findMaxInHeap(fh,8);
        fh.findMaxiInMinHeapefficiently(fh);
        System.out.println(fh.array[0]);


    }

    public void insertInHeap(int data){

        int i;
        if(this.count>capacity){
            //resizeHeap();
        }
        this.count++;
        i=this.count-1;

            while(i>0 && array[(this.count/2)-1]>data){
                array[i]=array[(this.count/2)-1];
                i=(i-1)/2;
            }
            this.array[i]=data;

        }

        public void findMaxInHeap(FindMaxInMinHeap h,int n){

        int i=n-1;

        while(i>0){

            int temp=h.array[0];
            h.array[0]=h.array[n-1];
            h.array[n-1]=temp;
            i--;

            percolateDown(n,0);
        }

        }

        public void percolateDown(int n,int i){

            int l,r,temp,max;
            l=2*i+1;
            r=2*i+2;

            if(l<n && array[l]>array[i]){
                max=l;
            }else max=i;

            if(r<n && array[r]>array[max]){
                max=r;
            }

            if(max!=i){

                temp=array[i];
                array[i]=array[max];
                array[max]=temp;
                percolateDown(n,max);
            }
        }

public void findMaxiInMinHeapefficiently(FindMaxInMinHeap h){
///n/2 time comp
            int max=-1;
            for(int i=(h.count+1)/2; i<h.count; i++){
                if(h.array[i]>max)
                    max=array[i];
            }
    System.out.println(max);
}
}
