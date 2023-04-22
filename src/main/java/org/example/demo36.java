package org.example;

public class demo36 {
    public static void main(String[] args) {
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count=0;
        for(int [] ele:grid)
        {
           for(int i:ele)
           {
               if(i<0)
               {
                   count++;
               }
           }
        }
        System.out.println(count);
    }
}
