package DataStructureAndAlgo.problems.ProblemsOnSearching;

import java.util.HashMap;

public class FindPairOfSumToKnumber {

    // find the pairs number upto 7

    public static void main(String[] args) {

     //   int list[] = {4, 8, 3, 1, 6, 5, 7, 2};
        int list[] = {1, 2, 3, 4, 5, 6, 7, 8};
        FindPairOfSumToKnumber f=new FindPairOfSumToKnumber();

        f.findPairofSumToKnumber(list);
        f.findPairofSumWithHashTable(list);
        f.checkSum(list);
           }
    public void findPairofSumToKnumber(int [] list) {

        int first = 0;
        int last = list.length - 1;

        while (first < last) {

            if(list[first]+list[last]==7){
                System.out.println("numbers are: "+ list[first]+ "and "+list[last]);
                first++;
                last=list.length-1;
                continue;
            }else {
                last--;
            }


        }


    }

    public void findPairofSumWithHashTable(int[] A){

        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();

        for(int i=0; i<A.length;i++){

            map.put(i,A[i]);
        }

        for(int i=0; i<A.length; i++){

            int value=7-map.get(i);
            if((map.containsValue(value))){

                System.out.println("Number pairs are:" +map.get(i)+" and "+value);
            }
        }


    }
    //nGiven a array A, find three elements i,j,k where A [i2]+A[j2]=A[k2]

    public void checkSum(int[] A) {

        for (int i = 0; i < A.length; i++) {

            A[i] = A[i] * A[i];
            System.out.print(A[i]+" ");
        }
        int first = 0;
        int last = A.length - 1;

        for (int i = 0; i <= last - 1; i++) {
            for(int j=i+2; j<last;j++)
            if (A[i] + A[i + 1] == A[j]) {
                System.out.println("numbers are: " + A[i] + "+" + A[i+1]+ "="+A[i+2]);

            }
        }
    }
}