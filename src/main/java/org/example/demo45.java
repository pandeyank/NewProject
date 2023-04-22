package org.example;

import java.util.HashMap;

public class demo45 {
    public static void main(String[] args) {
        int arr[]={3,7,8,12,19};
        int k=15;
        int n=arr.length;
        /*for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    System.out.print(i +" "+ j);
                }
            }
            System.out.println();
        }*/
        /*HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }

        }
        System.out.println(hm);
        for(int i=0;i<n;i++)
        {
            int ans=k-arr[i];
            if(hm.containsKey(ans))
            {
                System.out.println(ans);
            }

        }*/

        //Using 2 pointers
        int p1=0;
        int p2=n-1;
        while(p1<p2)
        {
            if(arr[p1]+arr[p2]==k)
            {
                System.out.print(p1 +" "+ p2);
                p1++;
                p2--;
                System.out.println();

            }
            else if (arr[p1]+arr[p2]>k)
            {
                p2--;

            }
            else {
                p1++;
            }
        }

    }
}
