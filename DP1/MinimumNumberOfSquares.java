package DP1;

    /*Given an integer N, find and return the count of minimum numbers required to represent N as a sum of squares.
    That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}.
    The output will be 1, as 1 is the minimum count of numbers required to represent N as sum of squares.*/

public class MinimumNumberOfSquares {
    public static int minCount(int n) {

        int storage[] = new int[n + 1];
        if (n <= 3) {
            return n;
        }
        storage[0] = 0;
        storage[1] = 1;
        storage[2] = 2;
        storage[3] = 3;
        for (int i = 4; i <= n; i++) {
            int ans = i;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                ans = Math.min(ans, storage[i - j * j] + 1);
            }
            storage[i] = ans;
        }
        return storage[n];
    }
}
