package DataStructureAndAlgo.sorting;

public class InsertionSort {

    public int[] insertionSort(int[] list){
        int i,j,key,temp;
     for(i=1; i<list.length;i++){
         key=list[i];
         j=i-1;
         while(j>=0 && key<list[j]){
             temp=list[j];
             list[j]=list[j+1];
             list[j+1]=temp;
             j--;
         }
     }
        return list;
    }

    public  static void main(String[] args){


        int list []={3,5,7,1,4};
        for(int value: list){
            System.out.print(value);
        }
        new InsertionSort().insertionSort(list);
        System.out.println();
        for(int value1: list){
            System.out.print(value1);
        }
    }
}
