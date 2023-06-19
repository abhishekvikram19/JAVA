import java.util.*;
public class Reverse_of_a_number {
    public static void main(String[] args) {
        int d, number,temp, revnum = 0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        temp = number;

        while (temp >0)
        {
            d = temp %10;
            revnum = (revnum*10)+d;
            temp = temp/10;
        }

        System.out.println(revnum);
    }
}
