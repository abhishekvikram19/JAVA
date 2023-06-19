import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int num=(n/2)+1;
        int count = num - 1;
        int i = 1;
            while (i <= num ) {
                int j = 1;
                while ( j <= count) {
                    System.out.print(" ");
                    j++;
            }

            count--;
                int k = 1;
                while(k <= (2 * i) - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println("");
            i++;
        }
        count = 1;
        while ( i <= num - 1) {
            int j = 1;
            while ( j <= count) {
                System.out.print(" ");
                j++;
            }

            count++;
            int k = 1;
            while ( k <= (2 * (num - i)) - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println("");
            i++;
        }
    }
}
