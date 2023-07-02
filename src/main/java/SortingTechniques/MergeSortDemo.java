package SortingTechniques;

import LLD.PolymorphismExample.A;

import java.util.ArrayList;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] arr={5,7,2,3,6,4,9,8,10};
        ArrayList<Integer> res=new ArrayList<>();
        int s=0;
        int e=arr.length-1;
        res=mergeSort(arr,s,e);
        for(int i=0;i<res.size();i++)
        {
            System.out.print(res.get(i) +" ");
        }
    }

    private static ArrayList<Integer> mergeSort(int[] arr, int s, int e) {
        ArrayList<Integer> sortedList=new ArrayList<>();
        ArrayList<Integer> leftSide=new ArrayList<>();
        ArrayList<Integer> rightSide=new ArrayList<>();
        if(s==e)
        {
            sortedList.add(arr[s]);
            return sortedList;
        }
        int mid=(s+e)/2;
        leftSide=mergeSort(arr,s,mid);
        rightSide=mergeSort(arr,mid+1,e);
        sortedList=mergeAlgo(leftSide,rightSide);
        return sortedList;

    }

    private static ArrayList<Integer> mergeAlgo(ArrayList<Integer> leftSide, ArrayList<Integer> rightSide) {
        ArrayList<Integer> mergeSort=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<leftSide.size() && j<rightSide.size()) {
            if (leftSide.get(i) < rightSide.get(j)) {
                mergeSort.add(leftSide.get(i));
                i++;
            } else {
                mergeSort.add(rightSide.get(j));
                j++;
            }


        }
        while(i<leftSide.size())
        {
            mergeSort.add(leftSide.get(i));
            i++;
        }
        while (j<rightSide.size())
        {
            mergeSort.add(rightSide.get(j));
            j++;
        }
        return mergeSort;

    /*private static void mergeAlgo(int[] arr, int s, int mid, int e) {
        System.out.println(s);
        int n=mid-s+1;
        int m=e-mid;
        int[] res=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m)
        {
            if(arr[i]<arr[j])
            {
                res[k++]=arr[i++];
            }
            else {
                res[k++]=arr[j++];
            }
        }
        while(i<n)
        {
            res[k++]=arr[i++];
        }
        while(j<m)
        {
            res[k++]=arr[j++];
        }
        for(int p=0;p< res.length;p++)
        {
            System.out.print(res[p] + " ");
        }*/
    }

}
