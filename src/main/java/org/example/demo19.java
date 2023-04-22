package org.example;

import java.util.Arrays;

public class demo19 {
    public static void main(String[] args) {
        int nums[]= {1,5,2,4,1};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] +" ");
        }
        System.out.println();
        int j=nums.length-1;
        System.out.println(nums[j]);
        while((j>0))
        {
            if(nums[j]>nums[j-1])
            {
                continue;
            }
            int temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;

        }
        System.out.println();
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] +" ");
        }
    }
}
