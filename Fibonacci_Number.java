public class Fibonacci_Number {

    public static boolean checkMember(int n){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }
    static boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

}
