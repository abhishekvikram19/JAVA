public class Multiplication_Recursive {
    public static int multiplyTwoIntegers(int m, int n){
        if(m==0||n==0){
            return 0;
        }
        return m + multiplyTwoIntegers(m, n-1);

    }
}
