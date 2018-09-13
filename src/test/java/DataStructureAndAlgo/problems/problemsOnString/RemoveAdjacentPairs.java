package DataStructureAndAlgo.problems.problemsOnString;

public class RemoveAdjacentPairs {

    public static void main(String[] args) {

        String x="ABCCBCBA";
        char [] c=x.toCharArray();

        RemoveAdjacentPairs ra=new RemoveAdjacentPairs();
        ra.removeAdjacent(c);
      //  ra.removeDup(c,7);

    }

    public void removeAdjacent(char [] c){

        int j=0;

        for(int i=1; i<c.length; i++){

            while(c[i]==c[j]&& j>=0){

                c[i]='\0';
                c[j]='\0';
                i++;
                j--;

            }
            c[++j]=c[i];

        }
        System.out.println(c);
    }

    // This function recursively removes duplicates
// and returns modified string
    public void removeDup(char[] str, int n)
    {
        int len = str.length;
        int k = 0; // To store index of result
        int i=1;

        // Start from second character and add
        // unique ones
        for (i=1; i< len; i++)
        {
            // If different, increment k and add
            // previous character
            if (str[i-1] != str[i])
                str[k++] = str[i-1];

            else
                // Keep skipping (removing) characters
                // while they are same.
                while (str[i-1] == str[i])
                    i++;
        }

        // Add last character and terminator
        str[k++] = str[i-1];
        str[k] =  '\0';

        // Recur for string if there were some removed
        // character
        if (k != n)
            removeDup(str, k);// Shlemial Painter's Algorithm

            // If all characters were unique
        System.out.println(str);
    }
}
