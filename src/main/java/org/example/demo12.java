package org.example;

public class demo12 {
    public static void main(String[] args) {
        int nums[] = {5,6,2,7,4};
        int n=nums.length;
        int k=2;
        for(int i=0;i<k;i++) {
            for (int j = i; j < n-1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i] +" ");
        }

    }
}
