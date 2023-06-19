import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            int space =i;

            while(j<=n-i)
            {
                System.out.print(" ");
                space++;
                j++;
            }


            j=1;
            int  temp=i;
            while(j<=i)
            {
                System.out.print(temp);
                temp++;
                j++;

            }

            j=1;
            int decre=2*i-2;
            while(j<=i-1)
            {

                System.out.print(decre);
                decre--;
                j++;

            }

            System.out.println();
            i++;

        }
    }
}
