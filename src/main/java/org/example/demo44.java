package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class demo44 {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"} ;
        int k = 2;
        ArrayList<String > al=new ArrayList<>();
        int n=arr.length;
        boolean [] visited=new boolean[n];
        Arrays.fill(visited,false);

        for(int i=0;i<n;i++)
        {
            if(visited[i]==true)
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                }


            }
            if(count==1)
            {
                al.add(arr[i]);
            }
        }

        System.out.println(al.get(k-1));
    }
}
