package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class demo25 {
    public static void main(String[] args) {
        int arr[]={1,2};
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
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
        Set<Integer> s=new HashSet<>();
        for(Integer set:hm.values())
        {
            s.addAll(Collections.singleton(set));
        }
       for(int i:s)
       {
           System.out.print(i +" ");
       }
        System.out.println();
       if(hm.size()==s.size())
       {
           System.out.println(true);
       }
       else
       {
           System.out.println(false);
       }

    }
}
