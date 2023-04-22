package DPExercise;

public class MinimumNumberofSquares {
    public static void main(String[] args) {
        int A=6;
        int []dp=new int[A+1];
        dp[0]=0;
        int n=dp.length;
        for(int i=1;i<n;i++)
        {
            dp[i]=Integer.MAX_VALUE;
            for(int j=1;j<=(int)Math.sqrt(i);j++)
            {
                int x=dp[i-j*j];
                int p=x+1;
                dp[i]=Math.min(dp[i],p);
            }
        }
        System.out.println(dp[n-1]);
    }
}
