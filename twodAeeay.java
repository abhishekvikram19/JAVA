public class twodAeeay {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        /*for(int i=0;i<5;i++)
        {
            arr[i][0]=2;
        }
        System.out.print(arr[3][0]);
    }*/
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++)
                arr[i][j] = i * j;
        }
        System.out.print(arr[3][4]);
    }
}
