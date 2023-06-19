
    /*
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form.
That is, you need to print in the order followed for every iteration:
    a. First row(left to right)
    b. Last column(top to bottom)
    c. Last row(right to left)
    d. First column(bottom to top)
*/

    public class Print_Spiral {

        public static void spiralPrint(int mat[][]){
            int rows = mat.length;
            if(rows == 0){
                return;
            }
            int cols = mat[0].length;
            int i, rowStart=0, colStart=0;
            int numberOfElements = rows*cols, count = 0;
            while(count<numberOfElements){

                for(i=colStart;count<numberOfElements && i<cols;i++){
                    System.out.print(mat[rowStart][i]+ " ");
                    count++;
                }
                rowStart++;


                for(i=rowStart;count<numberOfElements && i<rows;i++){
                    System.out.print(mat[i][cols-1]+ " ");
                    count++;
                }
                cols--;


                for(i=cols-1;count<numberOfElements && i>=colStart;i--){
                    System.out.print(mat[rows-1][i]+ " ");
                    count++;
                }
                rows--;

                for(i=rows-1;count<numberOfElements && i>=rowStart;i--){
                    System.out.print(mat[i][colStart]+ " ");
                    count++;
                }
                colStart++;
            }
        }
        public static void main(String[] args) {
            int mat[][]={{1,2,3,4}, {5,6,7,8}, {9,10,11, 12},{13, 14, 15, 16}};
            spiralPrint(mat);
        }
    }
