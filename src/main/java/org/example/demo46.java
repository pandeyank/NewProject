package org.example;

public class demo46 {
    public static void main(String[] args) {
        int [] arr={-3,0,1,3,6,8,11,14,18,25};
        int k=5;
        System.out.println(pairdiff(arr,k));


    }

    private static boolean pairdiff(int[] arr, int k) {
        int p1=0;
        int p2=1;
        int n=arr.length;
        while(p2<n)
        {
            int diff=arr[p2]-arr[p1];
            if(diff==k)
            {
                return true;
            }
            else if(diff>k)
            {
                p1++;
                if(p1==p2)
                {
                    p2++;
                }
            }
            else
            {
                p2++;
            }

        }
        return false;
    }
}
