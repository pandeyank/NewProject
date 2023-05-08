package DPExercise;

import java.util.ArrayList;

public class PossibiltyOfFinishing {
    public static void main(String[] args) {
        int A = 3;
        int[]B = {1, 2};
        int []C = {2, 3};
        int[][] arr=new int[B.length][2];
        for(int i=0;i<B.length;i++)
        {
            arr[i][0]=B[i];
            arr[i][1]=C[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }





    }
}
