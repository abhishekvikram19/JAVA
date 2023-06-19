package DP2;

/*For the given infinite supply of coins of each of denominations, D = {D0, D1, D2, D3, ...... Dn-1}.
        You need to figure out the total number of ways W, in which you can make the change for Value V using coins of denominations D.
        Return 0 if the change isn't possible.*/

public class WaysToMakeCoinChange {
    public static int countWaysToMakeChange(int denominations[], int value){
        // Write your code here
        /*
        if (value==0)
            return 1;

        if (value<0)
            return 0;

        int finalAns=0;
        for (int i=0;i<denominations.length;i++)
        {
            finalAns=finalAns+countWaysToMakeChange(denominations,value-denominations[i]);
        }
        return finalAns;
        */
        int[] dp = new int[value+1];
        dp[0]=1;
        for (int i=0;i<denominations.length;i++)
        {
            for (int j=0;j<=value;j++)
            {
                if (j>=denominations[i])
                {
                    dp[j]=dp[j]+dp[j-denominations[i]];
                }
            }
        }
        return dp[value];
    }
}
