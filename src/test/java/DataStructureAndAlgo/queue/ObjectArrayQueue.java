package DataStructureAndAlgo.queue;

public class ObjectArrayQueue {

    public int front;
    public int rear;
    public int size;
    public Object[] array;


    public static void main(String[] args){

        DynamicQueue queue=new DynamicQueue(1);
        System.out.println(queue.isQueueEmpty());
        System.out.println(queue.isQueueFull());
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println(queue.isQueueEmpty());
        System.out.println(queue.isQueueFull());
        System.out.println(queue.deQueue());
        queue.enQueue(7);
        queue.enQueue(8);
        System.out.println(queue.isQueueFull());
        //  System.out.println(DataStructureAndAlgo.queue.getLength());

        queue.enQueue(2);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.enQueue(1);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);


    }
    public ObjectArrayQueue(int size){

        this.size=1;
        front=-1;
        rear=-1;

        array= new Object[size];

    }

    public boolean isQueueEmpty(){

        if (front==-1) return true;
        else return false;
    }

    public boolean isQueueFull(){

        if((rear+1)%size==front) return true;
        else return false;
    }

    public int getSize() {

        if (front == -1) return 0;
        int len = (size - front + rear + 1) % size;
        if(len==0){
            return size;
        }else {
            return len;
        }

    }

    public Object deQueue(){

        Object data=null;
        if(isQueueEmpty()) System.out.println("DataStructureAndAlgo.queue is empty");
        else{
            data=array[front];
        }
        if(front==rear){
            front=rear=-1;
        }else
        {
            front=(front+1)%size;
        }
        return data;
    }

    public void enQueue(Object data){

        if(isQueueFull()) {
            resize();
        }

        rear=(rear+1)%size;
        array[rear]=data;
        if(front==-1){
            front=rear;
        }
    }

    public void resize(){

        int initCapacity=size;
        size*=2;
        Object[] tempArray=array;
        array= new Object[size];
        for(int i=0; i<tempArray.length; i++){

            array[i]=tempArray[i];
        }

        if(rear<front){
            for(int i=0;i<front;i++){
                array[i+initCapacity]=this.array[i];
                array[i]=0;
            }
            rear=rear+initCapacity;
        }
    }}
