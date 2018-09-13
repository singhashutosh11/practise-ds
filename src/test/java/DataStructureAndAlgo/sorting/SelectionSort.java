package DataStructureAndAlgo.sorting;

public class SelectionSort {


    public static void main (String[] args){

        int list  []={3,5,4,6,2,1};
        for(int val: list)
            System.out.print(val);
        new SelectionSort().selectionSort(list);
        System.out.println();
        for(int val1: list)
            System.out.print(val1);
    }

    private int[] selectionSort(int[] list) {

        int i,j,minVal,temp;

        for(i=0;i<list.length; i++){

            minVal=list[i];
            j=i+1;
            for(j=i+1;j<list.length;j++)
              if( minVal>list[j]){
                temp=minVal;
                list[i]=list[j];
                minVal=list[j];
                list[j]=temp;

            }
        }

        return list;
    }
}
