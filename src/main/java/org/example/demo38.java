package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class demo38 {
    public static void main(String[] args) {
        int []arr={2,4,3,2};
        int n=arr.length;
        int p=3;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int sum=arr[i]+arr[j];
                    int temp=sum+arr[k];
                    al.add(temp);
                }
            }
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(al.get(p-1));
    }
}
