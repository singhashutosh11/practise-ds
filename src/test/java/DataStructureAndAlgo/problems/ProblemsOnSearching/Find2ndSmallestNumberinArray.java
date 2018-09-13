package DataStructureAndAlgo.problems.ProblemsOnSearching;

public class Find2ndSmallestNumberinArray {

    public static void main(String[] args) {

        Integer[] x = {1,2,3,4,5,6,7,8,9};
        Find2ndSmallestNumberinArray fs=new Find2ndSmallestNumberinArray();
       // int y=fs.findMax(x);
       // System.out.println(y);
    }

//    public int findSmallestNumber(int[] list) {
//
//        int length = list.length;
//        int midpoint = length / 2;
//        Integer[] left, right, result;
//        if (length % 2 == 0) {
//            left = new Integer[midpoint];
//            right = new Integer[length - midpoint];
//
//        } else {
//
//            left = new Integer[midpoint];
//            right = new Integer[midpoint + 1];
//
//        }
//
//        for (int i = 0; i < midpoint; i++) {
//            left[i] = list[i];
//        }
//        System.out.println();
////        for (int val: left)
////        System.out.print(val);
//        int x = 0;
//        for (int j = midpoint; j < length; j++) {
//
//            if (x < length) {
//
//                right[x] = list[j];
//                x++;
//            }
//
//        }
//        int leftH=findMax(left);
//        int rightH=findMax(right);
//        if(leftH>rightH){
//            return rightH;
//        }else{
//            return leftH;
//        }
//    }


}
