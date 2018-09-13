package DataStructureAndAlgo.problems.ProblemsOnSearching;

public class FindTheIndexOfFirstOccurenceInSortedArray {

    // logic is (mid==low && x[mid]==data )|| (x[mid]==data && x[mid-1]<data)
    public static void main(String[] args) {

        int[] x={3,4,4,6,7,7,8,9};
        FindTheIndexOfFirstOccurenceInSortedArray fi= new FindTheIndexOfFirstOccurenceInSortedArray();
        int y=fi.BinarySearchFirstOccurence(x,0,x.length-1,7);
        System.out.println(y);
        int z=fi.BinarySearchLastOccurence(x,0,x.length-1,7);
        System.out.println(z);
    }

    private int BinarySearchFirstOccurence(int [] x, int low, int high, int data){

        if(high>=low){

            int mid=low+(high-low)/2;
            if((mid==low && x[mid]==data )|| (x[mid]==data && x[mid-1]<data)){
                return mid;
            }else if(x[mid]>=data){
                return BinarySearchFirstOccurence(x,low,mid-1,data);
            }else {
                return BinarySearchFirstOccurence(x,mid+1,high,data);
            }
        }
        return -1;
    }

    private int BinarySearchLastOccurence(int [] x, int low, int high, int data){

        if(high>=low){

            int mid=low+(high-low)/2;
            if((mid==high && x[mid]==data )|| (x[mid]==data && x[mid+1]>data)){
                return mid;
            }else if(x[mid]<=data){
                return BinarySearchLastOccurence(x,mid+1,high,data);
            }else {
                return BinarySearchLastOccurence(x,low,mid-1,data);
            }
        }
        return -1;
    }

    //Find the number of Occurence of a number

    private int BinarySearchNumberOfOccurenceOfNumbers(int [] x, int low, int high, int data){

        if(high>=low){
            int mid=low+(high-low)/2;
            if(x[mid]>data){

            }
        }
        return 0;
    }

}
