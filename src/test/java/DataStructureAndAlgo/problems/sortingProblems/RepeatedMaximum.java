package DataStructureAndAlgo.problems.sortingProblems;

import java.util.ArrayList;

public class RepeatedMaximum {

    public static void main(String[] args) {

        RepeatedMaximum rm=new RepeatedMaximum();
        rm.repeatedMaximum();
//        boolean b=rm.checkAplusBequalK();
//        System.out.println(b);
        int x=rm.fiboSeries(7);
        System.out.println(x);

    }
        public void repeatedMaximum () {

            int[] A = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 6, 6};

            int i, j, currentCounter = 1, maxCounter = 1;
            int currentCandidate, maxCandidate;
            currentCandidate = maxCandidate = A[0];

            for (i = 1; i < A.length; i++) {

                if (A[i] == currentCandidate) {
                    currentCounter += 1;

                } else {

                    currentCandidate = A[i];
                    currentCounter = 1;
                }

                if (currentCounter > maxCounter) {
                    maxCounter = currentCounter;
                    maxCandidate = currentCandidate;

                }

            }
            System.out.println(maxCounter);
            System.out.println(maxCandidate);
        }


    public boolean checkAplusBequalK(){
        int i,c,k=12;
        int[] A={1,2,3,5};
        int[] B={4,5,6,7};


        for(i=0;i<A.length;i++){
            c=k-B[i];
            if(c==A[i]){
                return true;
            }
        }
       return false;

    }

    public int fiboSeries( int n){

        int fibo1=1;
        int fibo2=1;

        int fibonaci=1;
        int [] ar= new int[6];

        for(int i = 1; i <= n; ++i) {
            if (i != 1 && i != 2) {
                fibonaci = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fibonaci;

            }
        }
        return fibonaci;
    }

}