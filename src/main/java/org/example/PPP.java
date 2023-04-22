package org.example;

public class PPP {
    public static void main(String[] args) {
        int[] arr={3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int n=arr.length;
        int l=0;
        for(int i=0;i<n;i++)
        {
            int c=arr[i];
            l=Math.max(l,c);

        }
        System.out.println(l);
        int r=0;
        for(int i=0;i<n;i++)
        {
            r+=arr[i];
        }
        System.out.println(r);
        int k=4;
        int ans=Integer.MAX_VALUE;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(check(mid,arr,n,k))
            {
                ans=mid;
                r=mid-1;

            }
            else
            {
                l=mid+1;
            }
        }
        System.out.println(ans);
    }

    private static boolean check(int mid, int[] arr, int n, int k) {
        int s=0;
        int count=1;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            if(s>mid)
            {
                s=arr[i];
                count++;
            }
            if(count>k)
            {
                return false;
            }
        }
        return true;
    }
}
