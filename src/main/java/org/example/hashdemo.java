package org.example;

import java.util.HashSet;

public class hashdemo {
    public static void main(String[] args) {
        int[] arr={6,6,6,6,8,9,7,10};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(arr[i]);
        }
        for(int i=0;i< hs.size();i++)
        {
            int x=arr[i];
            if(hs.contains(x-1)==false)
            {
                int len=0;
                int y=x;
                while(hs.contains(y))
                {
                    len++;
                    y++;
                }
                max=Math.max(len,max);
            }

        }
        System.out.println(max);
    }

}
