package DPExercise;

public class longestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr={14, 24, 18, 46, 55, 53, 82, 18, 101, 20, 78, 35, 68, 9, 16, 93, 101, 85, 81, 28, 78};
        int n=arr.length;
        int []dp=new int[n];
        dp[0]=1;
        int ans=0;
        for(int i=1;i<n;i++)
        {
            int c=0;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]<arr[i])
                {
                    c=Math.max(c,dp[j]);
                }
            }
            dp[i]=c+1;

        }
        for(int i=0;i<dp.length;i++)
        {
            ans=Math.max(dp[i],ans);

        }
        System.out.println(ans);

    }
}
