import java.util.*;
public class table {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter a number");
        int i = 1;
        while(i <= 10){
            System.out.println(i*n);
            i++;
        }
    }
}
