package DataStructureAndAlgo.problems.sortingProblems;

// logic is to start filling from end
public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int A[]={1,2,3,4,5,6,7};
        int B[]={1,2,5,8,9};

        int count=A.length;
        int k=A.length-1;
        int j=count-1;
        int i=B.length-1;

        for(;k>=0;k--){

            if(A[j]>B[i]){
                A[k]=A[j];
                i--;
                j--;
            }else{

                A[k]=B[i];
                i--;
                j--;
            }
            if(i<0){
                break;
            }
        }
        System.out.println(A[0]);
        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[3]);
        System.out.println(A[4]);
        System.out.println(A[5]);
        System.out.println(A[6]);



    }
}
