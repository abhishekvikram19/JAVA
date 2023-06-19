import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int q = n;
        while (i <= n) {

            int j = 1;
            int Start = 'A' + q - 1;
            while (j <= i) {
                System.out.print((char) (Start));
                j++;
                Start++;
            }
            System.out.println();
            q--;
            i++;
        }
    }
}
