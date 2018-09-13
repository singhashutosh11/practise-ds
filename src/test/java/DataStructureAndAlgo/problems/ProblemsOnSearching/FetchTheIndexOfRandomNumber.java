package DataStructureAndAlgo.problems.ProblemsOnSearching;

import DataStructureAndAlgo.tree.BinarySearchTree;

public class FetchTheIndexOfRandomNumber {

    public static void main(String[] args) {

        int [] x={10,12,3,6,5,11,9,8,1,4,2,7};
        int data=7;
        int length=x.length;
        FetchTheIndexOfRandomNumber ft=new FetchTheIndexOfRandomNumber();
        int y=ft.search(x,length-1,data);
        System.out.println(y);
        int z=ft.BinarySearchRoated(x,0,length-1,data);
        System.out.println(z);
    }

    private int findPivot(int [] x, int start, int end){

        if(start-end==0){
            return start;
        }if(start==end-1){
            if(x[start]>x[end]){
                return start;

            }else{
                return end;
            }
        }else{

           int mid=start+(end-start)/2;
           if(x[start]>=x[mid]){

               return findPivot(x,start,mid);
           }else{
               return findPivot(x,mid,end);
           }
        }

    }
// not working for first index
    private int search(int[] x,int length,int data){

        int pivot_index=findPivot(x,0,length);
        System.out.println("pivot:"+pivot_index);
        if(data==x[pivot_index]){
            System.out.println("data found  at index"+ pivot_index);
        }
        if(data>=x[pivot_index]){
            return BinarySearch(x,0,pivot_index-1,data);
        }else {
            return BinarySearch(x,pivot_index+1,length,data);
        }

    }

    private int BinarySearch(int []x,int start, int end, int data){
        if(start<end) {
            int mid = start + (end - start) / 2;
            if (x[mid] == data) {
                return mid;
            }

            if (x[mid] < data) {

                return BinarySearch(x, mid + 1, end, data);
            } else {

                return BinarySearch(x, start, mid - 1, data);
            }
        }
        return  -1;
    }

    private int BinarySearchRoated(int [] x, int start, int end, int data){
        // int [] x={10,7,3,6,5,11,9,8,1,4,2,7};
        int mid=start+(end-start)/2;
        if(start>end) return  -1;
        if(data==x[mid]) return mid;
        else if(x[start]<=x[mid]){

            if(data>=x[start]&& data<x[mid]) {

                return BinarySearchRoated(x, start, mid - 1, data);
            }
                else {

                return BinarySearchRoated(x, mid + 1, end, data);
            }

            }else if(x[end]>x[mid]) {

                if (data >= x[mid + 1] && data <= x[end]) {

                    return BinarySearchRoated(x, mid + 1, end, data);
                }else{

                    return BinarySearchRoated(x,start,mid-1,data);
            }


        }
        return mid;
    }
}
