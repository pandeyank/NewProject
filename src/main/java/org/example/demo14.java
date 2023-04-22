package org.example;

import java.util.Arrays;

public class demo14 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i< nums.length;i++)
        {
            System.out.print(nums[i] +" ");
        }
        int val1=nums[n-1];
        int val2=nums[n-2];
        System.out.println((val1-1)*(val2-1));
    }
}
