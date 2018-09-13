package DataStructureAndAlgo.sorting;

public class QuickSort {

    public static void main(String[] args) {

        int list[] = {4, 7, 1, 6, 8, 2, 3, 5};
        System.out.println("Before sorting");
        System.out.println();
        for (int val : list)
            System.out.print(val);
        int[] list1= new QuickSort().quickSortPivotLeft(list,0,list.length-1);
        //int[] list1= new QuickSort().quickSortPivotRight(list,0,list.length-1);
        //int[] list1 = new QuickSort().quickSortAdjacentSwap(list, 0, list.length - 1);
        System.out.println("After sorting");
        for (int val1 : list1)
            System.out.print(val1);
    }


    public int partition(int[] list, int low, int high) {
        int temp = 0;
        int pivot = list[low];
        int left = low;
        int right = high;

        while (left < right) {

            while (list[left] <= pivot && left < right) {
                left++;
            }
            while (list[right] > pivot) {
                right--;
            }
            if (left < right) {
                temp = list[left];
                list[left] = list[right];
                list[right] = temp;
            }

        }

        list[low] = list[right];
        list[right] = pivot;

        return right;
    }

    public int[] quickSortPivotLeft(int[] list, int low, int high) {

        int pivot;

        if (high > low) {

            pivot = partition(list, low, high);
            quickSortPivotLeft(list, low, pivot - 1);
            quickSortPivotLeft(list, pivot + 1, high);

        }

        return list;
    }

    public int[] quickSortPivotRight(int[] list, int low, int high) {

        int pivot_index;
        if (low < high) {

            pivot_index = doPatition(list, low, high);
            quickSortPivotRight(list, low, pivot_index - 1);
            quickSortPivotRight(list, pivot_index + 1, high);

        }
        return list;
    }

    public int doPatition(int[] list, int low, int high) {

        int temp = 0;
        int pivot_item = list[high];
        int left = low;
        int right = high;

        while (left < right) {

            while (pivot_item > list[left]) {
                left++;
            }

            while (pivot_item <= list[right]) {
                right--;
            }

            if (left < right) {

                temp = list[left];
                list[left] = list[right];
                list[right] = temp;
            }
        }

        list[high] = list[left];
        list[left] = pivot_item;
        return left;
    }

    public int[] quickSortAdjacentSwap(int[] list, int p, int r) {

        int index = patitionByAdjacentSwap(list, 0, r);
//         quickSortAdjacentSwap(list,0,index);
//         quickSortAdjacentSwap(list,index+1,r);
        System.out.println();
        System.out.println(index);

        return list;
    }

    public int patitionByAdjacentSwap(int[] list, int p, int r) {

        int temp = 0;
        int j = r+1;
        int i = p-1;
        int pivot_item = list[r];
        if(r<=1){
            return r;
        }
        while (i < j) {


            if(i<j) {
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }

        }

        return j;
    }
}
