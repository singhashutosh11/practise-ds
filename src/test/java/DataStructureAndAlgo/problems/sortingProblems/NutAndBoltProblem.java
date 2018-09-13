package DataStructureAndAlgo.problems.sortingProblems;


// can compare with nut & bolt only
// can not compare nut to nut and bolt to bolt
//find matching nut & bolt
public class NutAndBoltProblem {

    public static void main(String[] args) {

        int nut[]={1,2,5,6,4,3};
        int bolt[]={1,3,4,5,6,2};
        int nutLength=nut.length;
        int boltLength=bolt.length;
        new NutAndBoltProblem().findMatchO(nut, 0, bolt,boltLength-1);
        System.out.println("After sorting");
        for (int val1 : nut)
            System.out.print(val1);
        System.out.println();
        for (int val1 : bolt)
            System.out.print(val1);

    }

    public void findMatch(int[] N, int low, int[] B, int high){

        int pivot_index;

        if(low<high) {

            pivot_index = partition(N, 0, high,B[high]);
            partition(B,0,high,N[pivot_index]);
            findMatch(N, low, B, pivot_index - 1);
            findMatch(N, pivot_index + 1, B, high);
        }

    }

    public int partition(int[] array, int low, int high, int pivot_item){

        int i=low;
        int temp1,temp2;
        for(int j=0; j<high; j++){
            if(array[j]<pivot_item){
                temp1=array[i];
                array[i]=array[j];
                array[j]=temp1;
                i++;
            }else if(array[j]==pivot_item){
                temp1=array[j];
                array[j]=array[high];
                array[high]=temp1;
                j--;
            }

        }
//        temp2=array[i];
//        array[i]=array[high];
//        array[high]=temp2;
        return i;
    }

    public void findMatchO(int[] N, int low, int[] B, int high){

        int pivot_index;

        if(low<high) {

            pivot_index = partitionO(N, 0, high,B[high]);
            partitionO(B,0,high,N[pivot_index]);
            findMatchO(N, low, B, pivot_index - 1);
            findMatchO(N, pivot_index + 1, B, high);
        }

    }

    public int partitionO(int[] array, int low, int high, int pivot_item){
          int temp;
        while (low<high) {

            while (pivot_item > array[low]) {
                low++;
            }
            while (pivot_item < array[high]) {
                high--;
            }
            if (low < high) {

                temp = array[low];
                array[low] = array[high];
                array[high] = temp;


            }
        }
//            temp=array[low];
//            array[low]=pivot_item;
//            array[high]=temp;
           return low;

    }


}
