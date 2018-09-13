package DataStructureAndAlgo.problems;

import java.util.ArrayList;

public class PermutationOfArrayList {

    public static void main(String[] args) {

        ArrayList list= new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
       // list.add(4);
        int size=list.size();
        int [] a={1,2,3};
        int sequence=0;

        PermutationOfArrayList pm=new PermutationOfArrayList();
       // pm.findPermutationofNumbers(list,size);
       pm.combinationofArraylistElements(a,sequence);

    }

    public void findPermutationofNumbers(ArrayList list, int size){

        if(size==0){
            System.out.println(list);
        }else{
            for(int i=0; i<size;i++) {


                swapNumbers(list, i,size-1);
                findPermutationofNumbers(list,size-1);
                swapNumbers(list,i,size-1);
            }
        }
    }
    public void swapNumbers(ArrayList list, int i, int j){

        Object temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);

    }
//
    public void combinationofArraylistElements(int [] list, int k){

        if(list.length!=0){
            for(int i=0; i<k; i++) {


                System.out.print(list[i]);
            }
            System.out.println();


            for (int i = k; i <list.length; i++) {

                int temp=list[i];
                list[i]=list[k];
                list[k]=temp;
                combinationofArraylistElements(list,k+1);
//                 temp=list[i];
//                list[i]=list[k];
//                list[k]=temp;
            }
        }

    }
}
