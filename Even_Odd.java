import java.util.*;
public class Even_Odd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        if ( n % 2 == 0 ){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}
