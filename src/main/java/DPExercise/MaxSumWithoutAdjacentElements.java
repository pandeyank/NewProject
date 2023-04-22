package DPExercise;

public class MaxSumWithoutAdjacentElements {
    public static void main(String[] args) {
        int[][]mat={{2,68},{13,4}};
        int n=mat.length;
        int m=mat[0].length;
        System.out.println(n +" "+m);
        int dp[]=new int[m];
        for(int j=0;j<m;j++)
        {
            dp[j]=Math.max(mat[0][j],mat[1][j]);
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(dp[i] +" ");
        }
        System.out.println();
        int dp1[]=new int [m];
        dp1[0]=dp[0];
        dp1[1]=Math.max(dp[0],dp[1]);
        for(int i=2;i<m;i++)
        {
            dp1[i]=Math.max(dp1[i-1],dp[i]+Math.max(0,dp1[i-2]));

        }
        System.out.println(dp1[m-1]);
    }
}
