package org.example;

public class demo20 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int n=nums.length;
        nums=swap(nums,0,1);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] +" ");
        }


    }

    private static int[] swap(int[] nums, int num, int num1) {
        int temp=nums[num];
        nums[num]=nums[num1];
        nums[num1]=temp;
        return nums;

    }
}
