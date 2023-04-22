package DPExercise;

public class unBoundedKnapsack {
    public static void main(String[] args) {
        int A = 10;
        int[] B = {5};
        int []C = {10};
        int n=B.length;
        int [][] dp=new int[n+1][A+1];
        for(int j=0;j<=A;j++)
        {
            dp[0][j]=0;
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=A;j++)
            {
                if(C[i-1]<=A)
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-C[i-1]]+B[i-1]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }

        }
        System.out.println(dp[n][A]);
    }

}
