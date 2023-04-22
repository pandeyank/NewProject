package org.example;

public class Sortmain {
    public static void main(String[] args) {
        int arr[]={10,3,8,15,6,12,2,18,7,15,14};
        int n=arr.length;
        int s=0;
        int e=n-1;
        quickSort(arr,0,n-1);
    }

    private static void quickSort(int[] arr, int s, int e) {
        int q=rearrange(arr,s,e);
        quickSort(arr,s,q-1);
        quickSort(arr,q+1,e);
        System.out.println(q);
    }

    private static int rearrange(int[] arr, int s, int e) {
        int p1=s+1;
        int p2=e;
        while(p1<=p2)
        {
            if(arr[s]>=arr[p1])
            {
                p1++;
            }
            else if(arr[p2]>arr[s])
            {
                p2--;
            }
            else {
                swap(arr,p1,p2);
                p1++;
                p2--;

            }
        }
        arr=swap(arr,p2,s);
        return p2;

    }

    private static int[] swap(int[] arr, int p1, int p2) {
        int temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
        return arr;


    }
}
