package DataStructureAndAlgo.problems.problemsOnString;

import java.util.HashMap;

public class StringCompresion {

    public static void main(String[] args) {

        String x= "ABBBCCDEE";
        char[] c=x.toCharArray();
        StringCompresion sc=new StringCompresion();
        HashMap y=sc.stringCompression(c);
        System.out.println(y);
        String k=sc.cstr(x);
        String z=sc.stringCompress(x);
        System.out.println(k);
        System.out.println(z);
    }

    public HashMap stringCompression(char[] c) {
        int count = 0;
        HashMap map = new HashMap();
        for (int i = 0; i < c.length; i++) {

            if (map.containsValue(c[i])) {
                count += 1;
                map.put(c[i], c[i] + count);
            } else {
                map.put(c[i], c[i]);
        }
    }
        return map;
    }
//ABBBCCDEE
    public String cstr(String a){
        if(a.length()<2){return a;}
        if(a.length()==2){if(a.charAt(0)==a.charAt(1)){return a.charAt(0)+"2";}else{return a;}}
        for(int i=0;i<a.length();i++){
            int c=i+1;
            while(c<a.length()&&a.charAt(c)==a.charAt(i)){
                c++;
            }
            if(c-i!=1){
                a=a.substring(0,i+1)+(c-i)+a.substring(c);
                i++;
            }

        }
        return a;
    }

    private String stringCompress(String x) {

        if (x.length() == 1) {
            return x;
        }
        if (x.length() == 2)
            if((x.charAt(0) == x.charAt(1))) {
            return x.substring(1) + "2";
        }else{
            return x;
            }
        for(int i=0; i<x.length();i++){

            int c=i+1;

            while(c<x.length() && x.charAt(c)==x.charAt(i)){
                c++;
            }

            if(c-i!=1){

                x=x.substring(0,i+1)+(c-i)+x.substring(c);
                i++;

            }else if(c-i==1){

                x=x.substring(0,i+1)+(c-i)+x.substring(c);
                i++;
            }
        }
        return x;
    }
}
