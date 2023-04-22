package DPExercise;

public class minCostPath {
    public static void main(String[] args) {
        int [][] mat={{1,3,2},{4,3,1},{5,6,1}};
        int m=mat.length;
        int n=mat[0].length;
        int [][]dp=new int[m][n];
        System.out.println(minCost(m,n,mat,dp));
    }

    private static int minCost(int m, int n, int[][] mat, int[][] dp) {
        int p=m;
        int q=n;
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
        dp[m-1][n-1]=mat[m-1][n-1];
        System.out.println();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        for(int j=n-2;j>=0;j--)
        {
            dp[m-1][j]=mat[m-1][j]+dp[m-1][j+1];
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
        for(int i=m-2;i>=0;i--)
        {
            dp[i][n-1]=mat[i][n-1]+dp[i+1][n-1];
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
        for(int i=m-2;i>=0;i--)
        {
            for(int j=n-2;j>=0;j--)
            {
                dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+mat[i][j];
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
        return(dp[0][0]);

    }
}
