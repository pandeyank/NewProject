package DPExercise;

public class countWays1 {
    public static void main(String[] args) {
        int[][] mat={{1,1,1,1},{1,0,1,0},{0,1,1,1},{1,1,1,1},{1,0,1,1}};
        int m=mat.length;
        int n=mat[0].length;
        int dp[][]=new int[m][n];
        System.out.println(m);
        System.out.println(n);
        System.out.println(countPaths1(mat,m,n,dp));
    }

    private static int countPaths1(int[][] mat, int m, int n, int[][] dp) {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=0;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        for(int i=0;i<m;i++)
        {
            if(mat[i][0]==0)
            {
                break;
            }
            else
            {
                dp[i][0]=1;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(mat[0][j]==0)
            {
                break;
            }
            else
            {
                dp[0][j]=1;
            }
        }
        System.out.println();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    dp[i][j]=0;
                }
                else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }

            }

        }
        System.out.println();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[m-1][n-1];

    }
}
