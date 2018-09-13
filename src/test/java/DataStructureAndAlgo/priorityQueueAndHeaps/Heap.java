package DataStructureAndAlgo.priorityQueueAndHeaps;

public class Heap {

    public int[] array;
    public  int count;
    public int capacity;
    public int heap_type;


    public Heap(int capacity,int heap_type){

        this.heap_type=heap_type;
        this.count=0;
        this.capacity=capacity;
        this.array=new int[capacity];
    }
    public int Parent(int i){

        if(i<=0 || i>=this.count){
            return -1;
        }else{
            return (i-1)/2;
        }
    }

    public int leftChild(int i){

        int left=2*i+1;
        if(left>=this.count)
            return -1;
        return left;
    }

    public int rightChild(int i){

        int right=2*i+2;

        if(right>=this.count)
            return -1;
        return right;
    }

    public int getMaximun(){
        if(this.count==0)
            return -1;
        return this.array[0];
    }

    public static void main(String[] args) {

        int [] x={31,1,21,5,10,12,18,3,2,8,7};
        int [] y={1,4,3,7,2,5,8,9,6,10,12,11};
        //int [] y={1,4,3,5,2};
        Heap hp=new Heap(12,0);
        hp.insertDataInHeap(31);
        hp.insertDataInHeap(1);
        hp.insertDataInHeap(21);
        hp.insertDataInHeap(5);
        hp.insertDataInHeap(10);
        hp.insertDataInHeap(12);
        hp.insertDataInHeap(18);
        hp.insertDataInHeap(3);
        hp.insertDataInHeap(2);
        hp.insertDataInHeap(8);
        hp.insertDataInHeap(7);
//        System.out.println(hp.getMaximun());
//        System.out.println(hp.count);
//        System.out.println(hp.leftChild(3));
//        System.out.println(hp.rightChild(3));
//        System.out.println(hp.Parent(4));
//        hp.deleteMax();
//        System.out.println(hp.getMaximun());
//        hp.destroyHeap();
//        System.out.println(hp.getMaximun());
        Heap heap=new Heap(12,0);
//        heap.hepifyingBuildHeap(heap,y,x.length-1);
//        System.out.println(heap.getMaximun());
        Heap hep1=new Heap(12,0);
        hep1.heapSort(y,y.length);
 //       hp.percolateDown(0);
    }

    public void percolateDown(int i){

        int l,r,max,temp;

        l=leftChild(i);
        r= rightChild(i);
       if(l==-1&& r==-1) return;

        if(l!=-1&& this.array[l]>this.array[i]){
            max=l;
        }else{
            max=i;
        }
        if(r!=-1 && this.array[r]>this.array[max]){
            max=r;
        }
        if(max!=i){

            temp=this.array[i];
            this.array[i]=this.array[max];
            this.array[max]=temp;
            percolateDown(max);

        }
    }

    public int deleteMax(){

        if(this.count==0)
            return -1;
        int data=this.array[0];
        this.array[0]=this.array[count-1];
        this.count--;
        percolateDown(0);
        return data;
    }

    public void insertDataInHeap(int data){

        int i;
        if(this.count==this.capacity)
            resizeHeap();
        this.count++;
        i=this.count-1;
        while(i>0 && data>this.array[(i-1)/2]){
            this.array[i]=this.array[(i-1)/2];
            i=(i-1)/2;
        }
        this.array[i]=data;
    }

    private void resizeHeap(){

        int []old_array=new int[this.capacity];
        System.arraycopy(this.array,0,old_array,this.count-1,capacity);
        array= new int[capacity*2];
        for(int i=0; i<old_array.length; i++){
            this.array[i]=old_array[i];
        }
        this.capacity*=2;
        old_array=null;
    }

    public void destroyHeap(){

        this.count=0;
        this.array=null;
    }

    public void hepifyingBuildHeap(Heap h, int [] x,int n){

        if(h==null) return;
        while(n>this.capacity)
            h.resizeHeap();
        for(int i=0; i<n; i++){
            h.array[i]=x[i];
        }
        h.count=n;
        for(int i=(n/2)-1; i>=0; i--){
            h.percolateDown(i);
        }
    }

    public void heapSort(int [] x, int n){

        Heap hep=new Heap(n,0);
        int old_size,i,temp;
        hepifyingBuildHeap(hep,x,n);
        old_size= hep.count;   //12 10 11 9 4 5 8 7 6 1 2 3
        for(i=n-1;i>=0;i--){
            temp= hep.array[0];
            hep.array[0]=hep.array[hep.count-1];
            hep.array[hep.count-1]=temp;
            hep.count--;
           // hepifyingBuildHeap(hep,x,n);
            hep.percolateDown(0);
        }
        hep.count=old_size;
        for(int z=0; z<(hep.array.length);z++) {


            System.out.println(hep.array[z]);
        }
    }
}

