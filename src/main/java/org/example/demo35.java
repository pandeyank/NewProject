package org.example;

import java.util.Arrays;

public class demo35 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int[] result=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            result[i]=heights[i];
        }
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] +" ");
        }
        Arrays.sort(result);
        System.out.println();
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] +" ");
        }
    }
}
