package org.example;

public class shaggyDistance {
    public static void main(String[] args) {
        int[] A={7, 1, 3, 4, 1, 7};
        int n=A.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<n;j++)
            {

                if(A[i]==A[j])
                {
                    min=Math.abs(j-i);
                }
            }
            ans=Math.min(ans,min);
        }
        System.out.println(ans);
    }
}
