package DataStructureAndAlgo.problems.ProblemsOnSearching;

import java.util.HashMap;
//not complete
public class FindFirstRepeatedNumbers {

    public static void main(String[] args) {

        int [] A= {3,2,1,2,2,3};

        HashMap map= new HashMap();

        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])) {
                map.put(A[i], -A[i]);

            }else{
                    map.put(A[i],i);
                }
            }

        System.out.println(map.keySet());
    }
}
