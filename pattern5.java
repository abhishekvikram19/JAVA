import java.util.*;
public class pattern5 {


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int j=1;
            while (j<=n){
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
