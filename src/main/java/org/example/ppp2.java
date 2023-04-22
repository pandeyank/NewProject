package org.example;

public class ppp2 {
    public static void main(String[] args) {
        int[]A ={12, 34, 67, 90};
        int B=2;
        int l=0;
        int n=A.length;
        for(int i=0;i<n;i++)
        {
            int c=A[i];
            l=Math.max(l,c);
        }
        System.out.println(l);
        int r=A[0];
        int ans=0;
        for(int i=1;i<n;i++)
        {
            int c=A[i];
            r=r+c;
        }
        System.out.println(r);
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(check(mid,A,B,n))
            {
                r=mid-1;
                ans=mid;

            }
            else
            {
                l=mid+1;
            }
        }
        System.out.println(ans);
    }

    private static boolean check(int mid, int[] a, int b, int n) {
        int s=0;
        int count=1;
        for(int i=0;i<n;i++)
        {
            s+=a[i];
            if(s>mid)
            {
                s=a[i];
                count++;
            }
            if(count>b)
            {
                return false;
            }
        }
        return true;
    }
}
