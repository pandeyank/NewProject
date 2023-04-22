package DPExercise;

public class UniquePathsinaGrid {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        int n = mat.length;
        int m = mat[0].length;
        System.out.println(n + " " + m);
        System.out.println();
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println(uniquePath(mat, n, m, dp));
    }

    private static int uniquePath(int[][] mat, int n, int m, int[][] dp) {
        if (mat[0][0]==1) {
            return 0;
        }
        else if(mat[0][0]==0)
        {
            return 1;
        }
        else {


            for (int i = 1; i < n; i++) {
                if (mat[i][0] == 1) {
                    continue;
                } else {
                    dp[i][0] = 1;
                }
            }
            for (int j = 1; j < m; j++) {
                if (mat[0][j] == 1) {
                    continue;
                } else {
                    dp[0][j] = dp[0][j-1];
                }
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (mat[i][j] == 1) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }

                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(dp[i][j] +" ");
                }
                System.out.println();
            }
        }


        return 1;

    }
}
