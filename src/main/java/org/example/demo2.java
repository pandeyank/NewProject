package org.example;

import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,0};
        int index[]={0,1,2,3,0};
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(index[i],nums[i]);

        }
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=al.get(i);
        }
        System.out.println();
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] +" ");
        }


    }
}
