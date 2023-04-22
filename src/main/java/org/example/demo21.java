package org.example;

public class demo21 {
    public static void main(String[] args) {
       int arr[]={10,3,8,15,6,12,2,18,7,15,14};
       int n=arr.length;
       rearrange(arr,n);
    }

    private static void rearrange(int[] arr, int n) {
        int p1=1;
        int p2=n-1;
        while(p1<=p2)
        {
            if(arr[p1]<=arr[0])
            {
                p1++;
            }
            else if(arr[p2]>arr[0])
            {
                p2--;
            }
            else {
                swap(arr,p1,p2);
                p1++;
                p2--;

            }
        }
        swap(arr,p2,0);
        System.out.println(p2);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }

    private static int[] swap(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
        return arr;



    }
}
