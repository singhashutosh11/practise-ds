package DataStructureAndAlgo.stack;

public class ArrayStack {

    public int capacity;
    public int top;
    public int[] array;

    public ArrayStack(){

        capacity=5;
        array=new int[capacity];
        top=-1;
    }

    public boolean isStackEmpty(){

        if (top==-1) return true;
        else return false;
    }

    public  boolean isStackFull(){

        if(top==capacity-1){

            return true;
        }else{
            return false;
        }
    }

    public void pushData(int data){

        if(isStackFull())
        {
            System.out.println("Throw Exception that DataStructureAndAlgo.stack is full");
        }else{
            array[++top]=data;
        }
    }

    public int pop(){

        if(isStackEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{

            return array[top--];
        }
    }

    public void deleteStack(){

        top=-1;
    }

    public static void main(String[] args){

        ArrayStack stack=new ArrayStack();
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
        stack.deleteStack();
        stack.pop();
        System.out.println(stack.isStackEmpty());
        System.out.println(stack.isStackFull());

    }

}

