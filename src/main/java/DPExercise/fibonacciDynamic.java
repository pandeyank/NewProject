package DPExercise;

public class fibonacciDynamic {
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=-1;
        }
        for(int i=0;i<dp.length;i++)
        {
            System.out.print(dp[i] +" ");
        }
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println();
        for(int i=0;i<dp.length;i++)
        {
            System.out.print(dp[i] +" ");
        }

    }
}
