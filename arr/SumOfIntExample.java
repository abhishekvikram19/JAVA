package arr;

public class SumOfIntExample
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4};
        int s = sumOfEle(arr, 4);
        System.out.println(s);
    }
    static int sumOfEle(int[] abc, int j)
    {
        int sum = 0;
        for (int i = 0; i < abc.length; i++)
        {
            sum = sum + abc[i];
            break;
        }
        return sum;
    }

    static void sumOfEle(String[] abc)
    {

    }
}
