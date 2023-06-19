
    /*
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order,
i.e, print the first column top to bottom, next column bottom to top and so on.
*/


    public class Print_Like_a_Wave {

            public static void wavePrint(int mat[][]){
                //Your code goes here
                boolean UpToDown = true;
                int rows = mat.length;
                if(rows == 0){
                    return;
                }
                int cols = mat[0].length;
                for(int j=0;j<cols;j++){
                    if(UpToDown){
                        for(int i=0;i<rows;i++){
                            System.out.print(mat[i][j]+ " ");
                        }
                        UpToDown = false;
                    }else{
                        for(int i=rows-1;i>=0;i--){
                            System.out.print(mat[i][j]+ " ");
                        }
                        UpToDown = true;
                    }
                }
            }
            public static void wavePrint1(int arr[][]){
                int rows = arr.length;
                if(rows == 0){
                    return;
                }
                int cols = arr[0].length;
                for(int j=0;j<cols;j++){
                    if(j%2==0){
                        for(int i=0;i<rows;i++){
                            System.out.print(arr[i][j]+ " ");
                        }
                    }else{
                        for(int i=rows-1;i>=0;i--){
                            System.out.print(arr[i][j]+ " ");
                        }
                    }
                }

            }

            //main driver code to check solution
            public static void main(String[] args) {
                int arr[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
                wavePrint(arr);
                System.out.println();
                wavePrint1(arr);
            }

        }
