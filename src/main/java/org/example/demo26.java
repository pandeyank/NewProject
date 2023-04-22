package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class demo26 {
    public static void main(String[] args) {
        //nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
        int[] nums1={1,1,3,2};
        int[] nums2={2,3};
        int nums3[]={3};
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums3.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums3[i]==nums2[j])
                {
                    set.add(nums3[i]);
                }
            }
        }
        for(int i=0;i<nums3.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums3[i]==nums1[j])
                {
                    set.add(nums3[i]);
                }
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j< nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    set.add(nums2[i]);
                }
            }
        }
        for(int i:set)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        ArrayList<Integer> al=new ArrayList<>(set);
        System.out.println(al.size());
        for(int i:set)
        {
            al.add(i);

        }
        System.out.println();
        for(int i=0;i<set.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
    }
}
