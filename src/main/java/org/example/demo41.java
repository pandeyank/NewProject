package org.example;

public class demo41 {
    public static void main(String[] args) {
        int []arr = {17,18,5,4,6,1};
        int n=arr.length;
        int q=0;

        int s=1;
        while(s<n-1)
        {
            int max=0;
            max=Math.max(max,arr[s]);

            s++;

        }
        arr[n-1]=-1;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }




    }
}
