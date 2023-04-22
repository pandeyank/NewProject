package org.example;

import java.util.Arrays;

public class hashingdemo {
    public static void main(String[] args) {
        int[] arr={3,8,2,1,9,6,5,6,7,2};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        int max=Integer.MIN_VALUE;
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]+1==arr[i+1])
            {
                count++;
            }
            if(arr[i]==arr[i+1])
            {
                continue;
            }
            if(arr[i]+1!=arr[i+1])
            {
                max=count;
                count=1;
            }

            max=Math.max(max,count);



        }
        System.out.println(max);
    }
}
