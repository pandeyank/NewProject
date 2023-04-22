package org.example;

public class demo11 {
    public static void main(String[] args) {
        int nums[] = {4,2,5,9,7,4,8};
        int n=nums.length;
        int k=2;
        int max[]=new int[k];
        int min[]=new int[k];
        int s1=0;
        int p=0;
        int s=0;
        int p1=0;
        for(int i=0;i<k;i++)
        {

            int m=nums[i];
            int index=i;

            for(int j=i;j<n;j++)
            {
                if(nums[j]<m)
                {
                    m=nums[j];
                    index=j;

                }
            }
            swap(nums,i,index);
            min[s++]=nums[p1];
            p1++;
        }
        for(int i=0;i<min.length;i++)
        {
            System.out.print(min[i] +" ");
        }

        for(int i=0;i<k;i++)
        {


            for(int j=i;j<n-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }


            }



        }
        while(p<2)
        {
            max[s1++]=nums[n-p-1];
            p++;
        }


        System.out.println();
        for(int i=0;i<max.length;i++)
        {
            System.out.print(max[i] +" ");
        }

        int mul1=1;
        System.out.println();
        for(int i=0;i<max.length;i++)
        {
            mul1=mul1*max[i];
        }
        int mul2=1;
        for(int i=0;i<min.length;i++)
        {
            mul2=mul2*min[i];
        }

        int diff=mul1-mul2;
        System.out.println(diff);
    }

    private static void swap(int[] nums, int i, int index) {
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }

}
