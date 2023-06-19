import java.util.*;
public class Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 0 || x == 1)
        {
            System.out.println(x);
        }
        else
        {
            int i = 1, result = 1;

            while (result <= x)
            {
                i++;
                result = i * i;
            }

            System.out.println(i - 1);
        }

    }
}
