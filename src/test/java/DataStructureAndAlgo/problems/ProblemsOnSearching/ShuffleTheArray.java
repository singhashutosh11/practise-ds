package DataStructureAndAlgo.problems.ProblemsOnSearching;

public class ShuffleTheArray {

    // suppose nuber are a1,a2,a3,....an, b1,b2,b3...bn shuffle such a1,b1,a2,b2,a3,b3
    public static void main(String[] args) {

        String [] ar={"a1","a2","a3","a4","b1","b2","b3","b4"};
        int len=ar.length;
        int y[]={1,2,3};

        ShuffleTheArray sf=new ShuffleTheArray();
        String [] result=sf.divideAndConquer(ar);
        for(String x: result){
            System.out.print(x);
        }
        String [] result1=sf.mergeLeftRight(ar);
        for(String x: result1){
            System.out.print(x);
        }
        //sf.permutationOfArray(y,3);
        sf.permutationOfArrayWithoutrecursion(y,3);

    }

    public String [] divideAndConquer(String[] ar){

        int mid;
        int length=ar.length;
        String[] left;
        String[] right;
        mid=length/2;
        if(mid==2){
            return ar;
        }

        if(ar.length%2==0){

            left= new String[mid];
            right=new String[length-mid];
        }else {
            left= new String[mid];
            right=new String[mid+1];

        }

        for(int i=0; i<mid; i++){
            left[i]=ar[i];
        }
        int k=0;

        for(int j=mid; j<length; j++){
            right[k]=ar[j];
            k++;
        }

        left=divideAndConquer(left);
        right=divideAndConquer(right);
        String[] result=mergeArrays(left,right);
//        System.out.println(left.length);
//        System.out.println(rightChild.length);
        return result;
    }

    public String[] mergeArrays(String[]left, String [] right){

        int lengthL=left.length;
        int lengthR=right.length;
        int indexL=0, indexR=0;
        int resultIndex=0;
        String[] result= new String[lengthL+lengthR];

        while(indexL<lengthL && indexR< lengthR){

                result[resultIndex]=left[indexL];
                indexL++;
                resultIndex++;
                result[resultIndex]=right[indexR];
                indexR++;
                resultIndex++;
            }




   return result;
    }
// not complete
    public String [] divideAndConquerA(String[] ar){

        int mid;
        int length=ar.length;
        String[] left;
        String[] right;
        mid=length/2;
        if(mid==2){
            return ar;
        }

        if(ar.length%2==0){

            left= new String[mid];
            right=new String[length-mid];
        }else {
            left= new String[mid];
            right=new String[mid+1];

        }

        for(int i=0; i<mid; i++){
            left[i]=ar[i];
        }
        int k=0;

        for(int j=mid; j<length; j++){
            right[k]=ar[j];
            k++;
        }

        left=divideAndConquer(left);
        String[] result=mergeArrays(left,right);
        right=divideAndConquer(right);
//        System.out.println(left.length);
//        System.out.println(rightChild.length);
        return result;
    }

    public String[] mergeArraysA(String[]left, String [] right){

        int lengthL=left.length;
        int lengthR=right.length;
        int indexL=0, indexR=0;
        int resultIndex=0;
        String[] result= new String[lengthL+lengthR];

        while(indexL<lengthL && indexR< lengthR){

            result[resultIndex]=left[indexL];
            indexL++;
            resultIndex++;
            result[resultIndex]=right[indexR];
            indexR++;
            resultIndex++;
        }




        return result;
    }

    public String[] mergeLeftRight(String[] ar){

        int lenght=ar.length;
        int mid=lenght/2;
        int j=0,k=0;
        String[] str=new String[lenght];
        for(int i=0; i<lenght; i++){
            if(i%2==0){
                str[i]=ar[k];
                k++;
            }else{

                str[i]=ar[mid+j];
                j++;
            }
        }
        System.out.println();
        return str;
    }

    public void permutationOfArray(int [] x , int size){

        if(size==0){
            for(int y: x) {
                System.out.print(y);
            }
            System.out.println();
        }else
        for(int i=0; i<size;i++){

            swap(x,i,size-1);
            permutationOfArray(x,size-1);
            swap(x,i,size-1);
        }


    }

    public void permutationOfArrayWithoutrecursion(int []x,int size){

        for (int i=0; i<size; i++){
             swap(x,i,size-1);
            for(int y: x) {
                System.out.print(y);
            }
            System.out.println();

        }
    }

    public void swap(int []x, int i, int j){

        int temp=x[i];
        x[i]=x[j];
        x[j]=temp;
    }
}
