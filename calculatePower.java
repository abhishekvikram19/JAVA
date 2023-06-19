import java.util.Scanner;

public class calculatePower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
    }
    public static int power(int x, int n) {
        if (x==0 && n==0){
            return 0;
        }
        if (x==0)
            return 0;
        if (n==0)
            return 1;
        int number = power(x, n/2);
        if (n%2==0)
            return number * number;
        else
            return x * number* number;

    }
}
