package DataStructureAndAlgo.problems.problemsOnString;

public class PermutationOfStrings {

    public static void main(String[] args) {


        String str = "Ash";
        String prefix = "";
        PermutationOfStrings ps= new PermutationOfStrings();
       ps.permutationOfStringInOrder(prefix,str);
//        ps.permutationOfStringWithoutRecursionInOrder(prefix,str);
        char[] ch=str.toCharArray();
        int len=ch.length;
 //       ps.permutationNotInOrder(ch,len);

    }

    public void permutationOfStringInOrder(String prefix, String str) {

        int len = str.length();

        if (len == 0) {
            System.out.println(prefix);

        }else {

            for (int i = 0; i < len; i++) {

                permutationOfStringInOrder(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, len));
            }
        }

    }
// correct it
    public void permutationOfStringWithoutRecursionInOrder(String prefix, String str) {

        int len = str.length();
        int fact=len-1;
        int j=0;
        while (fact != 0) {

            for (int i = 0; i < len; i++) {

                prefix = "";

                prefix += str.charAt(j) + str.substring(0, i) + str.substring(i + 1, len);
                System.out.println(prefix);
            }
            j++;

            fact--;
        }
    }

    public void permutationNotInOrder(char[] ch, int len){

        if(len==1){
            System.out.println(ch);
        }else{

            for(int i=0; i<len; i++){
                swapChar(ch,i,len-1);
                permutationNotInOrder(ch,len-1);
                swapChar(ch,i,len-1);
            }
        }



}
    public void swapChar(char[] ch, int i, int j){

        char c;
        c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
    }

}
