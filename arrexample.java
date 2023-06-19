public class arrexample
{
    public static void main(String[] args) {
        int arr[] = new int[] {6,2,8,5,3,1};
           // arrexam(arr);
           // revprint(arr);
        //evenprint(arr);
        //printeven(arr);
        //Linearsearch(arr);
        larsma(arr);
    }
   /* static void arrexam(int[] arr){
        for (int i=0; i<=4; i++) {
            System.out.println(arr[i]);
        }
    }*/
    /*static void revprint(int[] arr){
        for (int i=arr.length-1; i>=0; i--) {

            System.out.println(arr[i]);
        }

    }*/
   /* static void evenprint(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (i%2==0){
                System.out.println("even" +arr[i]);
            }
            else {
                System.out.println("odd" + arr[i]);

            }
        }
    }*/
   /* static void printeven(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                System.out.println("Even "+arr[i]);
            }
            else {
                System.out.println("Odd "+ arr[i]);
            }
        }
    }*/
  /*  static void Linearsearch(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (3==arr[i]){
                System.out.println(i);
            }
        }
    }*/
    static void larsma(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];
        for (int i=0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max =arr[i];
            }

            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("min "+min);
        System.out.println("max "+max);
    }
}
