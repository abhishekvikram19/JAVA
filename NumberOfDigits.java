import java.util.Scanner;

public class NumberOfDigits {
    public static int count(int n){
        if(n==0){
            return 0;
        }
        int num = count(n / 10);
        return num + 1;

    }

    public static void main(String[] args) {
        System.out.println(count(156));
    }
}
