package DPExercise;

public class Waystosendthesignal {
    public static void main(String[] args) {
        int A=3;
        int [][]dp=new int[A+1][2];
        int ans=0;
        System.out.println(dp.length);
        for(int j=0;j<2;j++)
        {
            dp[0][j]=0;
        }
        for(int i=0;i<2;i++)
        {
            dp[1][i]=1;
        }
        for(int i=2;i<dp.length;i++) {
            for (int j = 0; j <2; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][1] + dp[i - 1][0];
                } else {
                    dp[i][j] = dp[i - 1][0];
                }
            }
        }
       for(int i=0;i<dp.length;i++)
       {
           for(int j=0;j<2;j++)
           {
               System.out.print(dp[i][j] +" ");
           }
           System.out.println();
       }
       ans=(dp[A][0]+dp[A][1]);
        System.out.println(ans);
    }
}
