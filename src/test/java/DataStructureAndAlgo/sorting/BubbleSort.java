package DataStructureAndAlgo.sorting;

public class BubbleSort {

    public int[] bubbleSort(int[] list){
       int i,j, temp=0;

       for(i=0;i<list.length-1;i++){

           for(j=0;j<(list.length-1)-i;j++){

               if(list[j]>list[j+1]){
                   temp=list[j];
                   list[j]=list[j+1];
                   list[j+1]=temp;
               }
           }
       }

        return  list;
    }

    public static void main(String[] args){

        int list []={3,6,7,1,4};
        for(int value: list){
            System.out.print(value);
        }
        new BubbleSort().bubbleSort(list);
        System.out.println();
        for(int value1: list){
            System.out.print(value1);
        }
    }
}
