package DataStructureAndAlgo.problems.ProblemsOnSearching;


import java.util.*;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] A={1,2,3,4,6,7,8};

        FindMissingNumber find=new FindMissingNumber();
    //    System.out.println(find.findMissingNumber(A));
        System.out.println(find.findMissingNumberUsingHashMap(A));
    //    find.missingUnmberUsingSum(A);

    }

    public int findMissingNumber(int [] A){
        int sum=0;
        int n=A.length+1;
        int actualSum=(n*(n+1))/2;
        for(int i=0;i<A.length; i++) {
            sum += A[i];
        }
        int missingNum=actualSum-sum;
        return missingNum;
    }

    public int findMissingNumberUsingHashMap(int[] A){
        int count=0;
        HashMap map= new HashMap();

        for(int i=1; i<8;i++) {
            map.put(i,count);
        }
        for(int x: A){
            count=0;
            if(map.containsKey(x)){
                count+=1;
                map.put(x,count);
            }

        }
        System.out.println(map);
        return 0;
     }
     // incomplete
     public void missingUnmberUsingSum(int[] A){
        int X=0,Y=0;
        for(int i=0;i<7; i++){
           X^=A[i];
        }
        for(int i=1; i<=A.length;i++){

            Y^=i;
        }
         System.out.println(X^Y);
     }

}
