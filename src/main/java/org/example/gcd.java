package org.example;

import java.util.Arrays;

public class gcd {
    public static void main(String[] args) {
        int num1=3;
        int num2=8;
        findGcd(num1,num2);
        int []nums = {7,5,6,8,3};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] +" ");
        }
    }

    private static void findGcd(int num1, int num2) {
        while(num2!=0)
        {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println(num1);
    }
}
