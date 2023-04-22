package org.example;

import java.util.HashMap;
import java.util.Map;

public class demo31 {
    public static void main(String[] args) {
        int []nums={1,2,2,3,3};
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        System.out.println(hm);
        for (int k:hm.keySet())
        {
            //System.out.println(k);
            System.out.println(hm.get(k));
            if(hm.get(k)>1)
            {
                System.out.println(k);
            }
        }



    }
}
