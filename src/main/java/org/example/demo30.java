package org.example;

public class demo30 {
    public static void main(String[] args) {
        int [] arr={-5,-5,-3,0,1,1,1,5,5,5,5,5,5,5,8,10,10,15,15};
        int k=5;
        System.out.println(firstOccurence(arr,k));
    }

    private static int firstOccurence(int[] arr,int k) {
        int n=arr.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(arr[m]==k)
            {
                ans=m;
                r=m-1;
            }
            if(arr[m]<k)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        return ans;

    }
}
