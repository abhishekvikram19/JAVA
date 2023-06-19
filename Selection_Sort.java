/*
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
 Note:
    Change in the input array/list itself. You don't need to return or print the elements.
*/

public class Selection_Sort {

    public static void selectionSort(int[] arr) {
        //Your code goes here
        int index;
        for(int i=0;i<arr.length-1;i++)
        {
            index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index])
                {
                    index=j;
                }
            }

            int save=arr[i];
            arr[i]=arr[index];
            arr[index]=save;
        }
    }
}

/*
public class SelectionSort {
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            //Insert element at ith position
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=i;j<n;j++){
                //Finding the minimum element among j positions
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            //Swap element at minIndex with the ith element
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String args[]) {
        int[] arr={1,6,4,8,0,3};
        selectionSort(arr);
        printArray(arr);
    }
}*/
