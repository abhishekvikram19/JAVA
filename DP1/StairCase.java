package DP1;

/*A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time.
        Implement a method to count and return all possible ways in which the child can run-up to the stairs.*/
public class StairCase {
    public static long staircase(int n){
        long storage[]=new long[n+1];
        storage[0]=1;
        storage[1]=1;
        for(int i=2;i<storage.length;i++) {
            long op2=0,op3=0;
            long op1=storage[i-1];
            if(i-2>=0)
                op2=storage[i-2];
            if(i-3>=0)
                op3=storage[i-3];
            storage[i]=op1+op2+op3;
        }
        return storage[n];

    }
}
