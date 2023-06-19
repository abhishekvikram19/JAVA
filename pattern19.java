import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int i = 1;
        while( i<=n ){
            int j =1;
            while( j <= n - i ){
                System.out.print(" ");
                j++;
            }
            int Star = 1;
            while(Star<=i){
                System.out.print(Star);
                Star++;
            }
            int dec = i -1;
            while (dec >= 1){
                System.out.print(dec);
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
