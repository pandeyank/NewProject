package org.example;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i+=2)
        {
            int freq=nums[i];
            int val=nums[i+1];
            while (freq>0)
            {
                al.add(val);
                freq--;
            }
        }
        for (int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
    }
}
