package DataStructureAndAlgo.stack;

public class DynamicArrayStack {

    public int capacity;
    public int top;
    public int[] array;

    public DynamicArrayStack(){

        capacity=1;
        array=new int[capacity];
        top=-1;
    }

    public boolean isStackEmpty(){

        if(top==-1){
            return true;
        }else return false;
    }

    public boolean isStackFull(){

        if(top==capacity-1){
            return true;
        }else return false;
    }

    public void pushData(int data){

        if(isStackFull()){
            doubleStack();
            array[++top]=data;
        }else {
            array[++top] = data;
        }
    }

    public void doubleStack(){

        int[] newArray= new int[capacity*2];
        System.arraycopy(array,0,newArray,0,capacity);
        capacity=capacity*2;
        array=newArray;
    }

    public int pop(){

        if(isStackEmpty()){
            System.out.println("Stack is empty");
            return 1;

        }else{
            return array[top--];
        }
    }

    public void deleteStack(){
        top=-1;
    }

    public static void main(String[] args){

        DynamicArrayStack stack=new DynamicArrayStack();
        System.out.println(stack.isStackEmpty());
        System.out.println(stack.isStackFull());
        stack.pop();
        stack.pushData(3);
        stack.pushData(4);
        stack.pushData(5);
        stack.pushData(6);
        stack.pushData(7);
        stack.pushData(8);
        System.out.println(stack.isStackEmpty());
        System.out.println(stack.isStackFull());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.deleteStack();
        stack.pop();
        System.out.println(stack.isStackEmpty());
        System.out.println(stack.isStackFull());


    }

}
