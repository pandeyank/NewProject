package org.example;

public class demo29 {
    public static void main(String[] args) {
        int [] arr={3,6,9,12,14,19,20,23,25,27};
        int k=14;
        int p=positionKth(arr,k);
        System.out.println(p);
    }

    private static int positionKth(int[] arr, int k) {
        int l=0;
        int n=arr.length;
        int r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return -1;
    }
}
