package DataStructureAndAlgo.queue;

public class ArrayQueue {

    public int capacity;
    public int front;
    public int rear;
    public int [] array;

    public static void main(String[] args){

        ArrayQueue queue=new ArrayQueue();
        System.out.println(queue.isQueueEmpty());
        System.out.println(queue.isQueueFull());
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println(queue.isQueueEmpty());
        System.out.println(queue.isQueueFull());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.enQueue(7);
        queue.enQueue(8);
        System.out.println(queue.isQueueFull());
        System.out.println(queue.getLength());

        queue.enQueue(2);


    }

    public ArrayQueue(){

        front=-1;
        rear=-1;
        capacity=5;
        array= new int[capacity];
    }

    public boolean isQueueEmpty(){

        if(front==-1){
            return true;
        }else return false;
    }

    public boolean isQueueFull(){

        if((rear+1)%capacity==front){
            return true;
        }else return false;
    }

    public int getLength(){

         int len=(capacity-front+rear+1)%capacity;
        return len;
    }

    public void enQueue(int data){

        if(isQueueFull()){
            System.out.println("DataStructureAndAlgo.queue is full");
        }else {

            rear=(rear+1)%capacity;
            array[rear]=data;
        }
        if(front==-1){

            front=rear;
        }
    }

    public int deQueue(){

        int data=0;

        if(isQueueEmpty()){
            System.out.println("DataStructureAndAlgo.queue is empty");
        }else {
            data=array[front];
        }

        if(front==rear){
            front=rear-1;
        }else{

            front=(front+1)%capacity;
        }

        return data;
    }
}
