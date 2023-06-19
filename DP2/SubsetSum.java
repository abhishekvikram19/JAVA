package DP2;

//You are given a set of N integers. You have to return true if there exists a subset that sum up to K, otherwise return false.

public class SubsetSum {
    static boolean isSubsetPresent(int set[], int n, int sum) {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;

        // If last element is greater than
        // sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetPresent(set, n - 1, sum);

        /*
         * else, check if sum can be obtained
         * by any of the following
         * (a) including the last element isSubsetPresent
         * (b) excluding the last element
         */
        return isSubsetPresent(set, n - 1, sum)
                || isSubsetPresent(set, n - 1, sum - set[n - 1]);
    }

    /* Driver code */
    public static void main(String args[])
    {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        if (isSubsetPresent(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}
