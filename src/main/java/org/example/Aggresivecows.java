package org.example;

public class Aggresivecows {
    public static void main(String[] args) {
        int[] stalls={2,6,11,14,19,25,30,39,43};
        int n=stalls.length;
        int l=Integer.MAX_VALUE;



        System.out.println(l);
        int r=stalls[n-1]-stalls[0];
        int c=4;
        System.out.println(r);
        int ans=Integer.MAX_VALUE;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(check(mid,stalls,n,c))
            {
                l=mid+1;
                ans=mid;
            }
            else
            {
                r=mid-1;
            }
        }
        System.out.println(ans);
        System.out.println("The result are:");


    }

    private static boolean check(int mid, int[] stalls, int n, int c) {
        int s=stalls[0];
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(stalls[i]-s>=mid)
            {
                count++;
                s=stalls[i];
            }
            if(count==c)
            {
                return true;
            }
        }
        return false;
    }
}
