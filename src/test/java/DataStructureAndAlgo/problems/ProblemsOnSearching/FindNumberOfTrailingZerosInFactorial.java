package DataStructureAndAlgo.problems.ProblemsOnSearching;

public class FindNumberOfTrailingZerosInFactorial {

    public static void main(String[] args) {

        int i, count=0;
        int n=20;

        if(n<0){
            System.out.println("count:="+count);
        }
        for(i=5; n/i>0; i*=5){
            count+=n/i;
        }
        System.out.println(count);
    }
}
