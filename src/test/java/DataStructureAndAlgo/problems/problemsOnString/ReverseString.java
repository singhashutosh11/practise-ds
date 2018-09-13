package DataStructureAndAlgo.problems.problemsOnString;

public class ReverseString {

    public static void main(String[] args) {

        ReverseString rs=new ReverseString();
        rs.reverseEditableString();
        rs.reverseStringWithoutUsingVariable();

    }

    public void reverseEditableString(){

        StringBuilder myName = new StringBuilder("Ashutosh");
        int start=0;
        int end=myName.length()-1;
        char temp;

        for(start=0; start<end;start++, end--){

            temp=myName.charAt(start);
            myName.setCharAt(start, myName.charAt(end));
            myName.setCharAt(end,temp);

        }
        System.out.println(myName);

    }
// not complete
    public void reverseStringWithoutUsingVariable(){

        //StringBuilder str = new StringBuilder("Ashutosh");
        String str="Ashutosh";
        char[] chr=str.toCharArray();
        int start=0;
        int end=chr.length-1;

        while(start<end){

          chr[start]^=chr[end];
          chr[end]^=chr[start];
          chr[start]^=chr[end];

          ++start;
          --end;
        }
        System.out.println(chr);
    }
}
