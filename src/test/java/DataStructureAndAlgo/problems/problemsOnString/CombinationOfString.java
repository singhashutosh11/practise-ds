package DataStructureAndAlgo.problems.problemsOnString;

public class CombinationOfString {

    public static void main(String[] args) {

        String x="abc";
        String prefix="";
        CombinationOfString cb=new CombinationOfString();
        cb.combinationOfString(prefix,x);
        //cb.combinationOfStringOtherWay(prefix,x);
    }

    public void combinationOfString(String prefix, String str){
        if(str.length()==0)
        System.out.println(prefix);
        for(int i=0; i<str.length();i++){

            combinationOfString(prefix+str.charAt(i),str.substring(i+1));
        }
    }

    public void combinationOfStringOtherWay(String prefix, String str){

        if(str.length()>0){
            System.out.println(prefix+str.charAt(0));
            combinationOfStringOtherWay(prefix+str.charAt(0),str.substring(1));
            combinationOfStringOtherWay(prefix,str.substring(1));
        }
    }
}
