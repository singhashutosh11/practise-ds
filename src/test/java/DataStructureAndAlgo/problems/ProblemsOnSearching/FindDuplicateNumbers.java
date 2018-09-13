package DataStructureAndAlgo.problems.ProblemsOnSearching;

import java.util.HashMap;

public class FindDuplicateNumbers {

    public static void main(String[] args) {

        int[] duplicate = {2, 5, 2, 2, 3, 7, 3};

        FindDuplicateNumbers f=new FindDuplicateNumbers();
        f.findDuplicate(duplicate);
      //  f.findDuplicateUsingNegate(duplicate);
    }

    public void findDuplicate(int [] duplicate){

        int count=0;
        int countA[]= new int[duplicate.length];

        HashMap find= new HashMap();

        for(int i=0; i<duplicate.length; i++){
            if(find.containsKey(duplicate[i])){
                int value=(int)((Integer)find.get(duplicate[i]));
                value+=1;
                find.put(duplicate[i],value);
            }else {
                find.put(duplicate[i], 0);
            }
        }

        System.out.println(find);
    }

    public void findDuplicateUsingNegate(int [] A){


        for(int i=0; i<A.length;i++){

            if(A[Math.abs(A[i])]<0){

                System.out.println("Duplicate found :"+ Math.abs(A[i]));
            }else{

                A[A[i]]=-A[A[i]];
            }
        }


    }
}
