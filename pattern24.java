import java.util.*;
public class pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int i, j, space, decider;
        decider = row / 2;
        for (i = 0; i < row; i++) {
            if (i <= decider) {
                for (space = i; space < decider; space++)
                    System.out.print(" ");
                for (j = 0; j < (i * 2) + 1; j++)
                    System.out.print("*");
                System.out.print("\n");
            } else {
                for (space = i; space > decider; space--)
                    System.out.print(" ");
                for (j = (row * 2) - 1; j > (i * 2); j--)
                    System.out.print("*");
                System.out.print("\n");
            }
        }
    }
}