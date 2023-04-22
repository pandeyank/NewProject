package DPExercise;

public class countPathsImproove {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[][]dp=new int[m][n];

       printPath(n,m,dp);


    }

    private static void printPath(int n, int m, int[][] dp) {
       for(int i=0;i<n;i++)
       {
           dp[0][i]=1;
       }
       for(int j=0;j<m;j++)
       {
           dp[j][0]=1;
       }
       for(int i=0;i<m;i++)
       {
           for (int j=0;j<n;j++)
           {
               System.out.print(dp[i][j] +" ");
           }
           System.out.println();
       }
       for(int i=1;i<m;i++)
       {
           for(int j=1;j<n;j++)
           {
               dp[i][j]=dp[i-1][j]+dp[i][j-1];
           }
       }
        System.out.println();
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        int x=dp[m-1][n-1];
        System.out.println(x);



    }
}
