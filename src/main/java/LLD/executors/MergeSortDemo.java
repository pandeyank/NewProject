package LLD.executors;

import java.util.ArrayList;

public class MergeSortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> res=new ArrayList<>();
        int[] arr={5,7,2,3,6,4,9,8,10};
        int s=0;
        int e=arr.length;
        MergeSort(arr,s,e);
    }

    private static int[] MergeSort(int[] arr, int s, int e) {
        if(arr.length==1)
        {
            return new int[]{arr[1]};
        }
        int mid=(s+e)/2;
        MergeSort(arr,s,mid);
        MergeSort(arr,mid+1,e);
       Merge(arr,s,mid,e);


        return arr;
    }

    private static void Merge(int[] arr, int s, int mid, int e) {
        ArrayList<Integer> al=new ArrayList<>();
        int n1=mid-s+1;
        int n2=e-mid;
        int i=0;
        int j=0;
        int k=0;
        while (i<n1 && j<n2)
        {
            if(arr[i]<arr[j])
            {
                al.add(arr[i]);
                i++;
            }
            else {
                al.add(arr[j]);
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            al.add(arr[i]);
            i++;
            k++;
        }
        while(j<n2)
        {
            al.add(arr[j]);
            j++;
            k++;
        }

        for(int p=0;p<al.size();p++)
        {
            System.out.print(al.get(p) +" ");
        }
    }
}
