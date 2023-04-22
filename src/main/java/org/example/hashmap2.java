package org.example;

import java.util.HashMap;
import java.util.Map;

public class hashmap2 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2};
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
                hm.put(nums[i],1 );

            }
        }
        System.out.println(hm);
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()==1)
            {
                ans+= entry.getKey();

            }


        }
        System.out.println(ans);
    }
}
