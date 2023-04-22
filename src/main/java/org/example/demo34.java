package org.example;

public class demo34 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int n=nums.length;
        int [] res=new int[n];
        int q=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                res[q++]=nums[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==1)
            {
                res[q++]=nums[i];
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i] +" ");
        }
    }
}
