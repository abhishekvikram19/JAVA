import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int j=1;
            while (j<=i){
                char jthchar =(char)('A' +i -1);
                System.out.print(jthchar);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
