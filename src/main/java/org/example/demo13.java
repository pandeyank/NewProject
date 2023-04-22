package org.example;

import java.util.Arrays;

public class demo13 {
    public static void main(String[] args) {
        int [][] grid = {{1,2,4},{3,3,1}};//------>{1,2,4}{1,3,3}
        System.out.println(grid.length);
        int res=0;
        for(int i=0;i<grid.length;i++)
        {
            Arrays.sort(grid[i]);
        }
        for(int i=0;i<grid[0].length;i++)
        {
            int max=0;
            for(int j=0;j<grid.length;j++)
            {
                max=Math.max(grid[j][i],max);
            }
            res+=max;
        }
        System.out.println(res +" ");


    }
}
