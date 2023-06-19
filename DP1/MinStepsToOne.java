package DP1;

/*Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1.
        You can perform any one of the following 3 steps:
        1.) Subtract 1 from it. (n = n - ­1) ,
        2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
        3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).
        Write brute-force recursive solution for this.*/

public class MinStepsToOne {
    public static int countMinStepsToOne(int n) {
        int storage[]=new int[n+1];
        storage[1]=0;

        for(int i=2;i<storage.length;i++)
        {
            int op1=Integer.MAX_VALUE;
            int op2=Integer.MAX_VALUE;
            int op3=Integer.MAX_VALUE;
            op1=storage[i-1];
            if(i%2==0)
                op2=storage[i/2];
            if(i%3==0)
                op3=storage[i/3];
            storage[i]=1+Math.min(Math.min(op1,op2),op3);
        }
        return storage[n];
    }
}
