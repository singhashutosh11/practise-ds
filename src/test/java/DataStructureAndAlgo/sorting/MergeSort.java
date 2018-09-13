package DataStructureAndAlgo.sorting;

public class MergeSort {

    public static void main(String [] args){

        Integer list[]={4,2,6,7,3,9,1};
        for (int val: list)
            System.out.print(val);
       Integer[] list1=new MergeSort().mergeSort(list);
        System.out.println();
        for(int val1: list1){
            System.out.print(val1);
        }

    }

    public Integer[] mergeSort(Integer[] list){

        int length=list.length;
        if(length<=1){
            return list;
        }
        int midpoint=length/2;
        Integer [] left,right, result;
        if(length%2==0){
            left= new Integer[midpoint];
            right= new Integer[length-midpoint];

        }else {

             left= new Integer[midpoint];
             right= new Integer[midpoint+1];

        }

        for(int i=0; i<midpoint; i++){
            left[i]=list[i];
        }
        System.out.println();
//        for (int val: left)
//        System.out.print(val);
        int x=0;
        for(int j=midpoint; j<length; j++){

            if(x<length){

                right[x]=list[j];
                x++;
            }
        }
        System.out.println();
//        for(int val1:rightChild)
//        System.out.print(val1);
        left=mergeSort(left);
        right=mergeSort(right);

       result=merge(left,right);

        return result;

    }

    public Integer[] merge(Integer[] left, Integer[] right) {

        int resultLenght=left.length+right.length;
        Integer result []= new Integer[resultLenght];
        int indexL=0,indexR=0,indexRes=0;

        while(indexL<left.length || indexR< right.length) {

            if (indexL < left.length && indexR < right.length) {

                if (left[indexL] <= right[indexR]) {

                    result[indexRes]=left[indexL];
                    indexL++;
                    indexRes++;
                } else {

                    result[indexRes]=right[indexR];
                    indexR++;
                    indexRes++;
                }

            } else if(indexL < left.length){

                result[indexRes]=left[indexL];
                indexL++;
                indexRes++;

            }else if (indexR< right.length){

                result[indexRes]=right[indexR];
                indexR++;
                indexRes++;

            }

        }


        return result;
    }
}
