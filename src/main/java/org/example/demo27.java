package org.example;

import java.util.Arrays;

public class demo27 {
    public static void main(String[] args) {
        int mat[][] =
                {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};

        int [] result=new int[mat.length];
        int p=0;
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                count = count + mat[i][j];
                result[p]=count;

            }
            p++;

        }
        for(int i=0;i< result.length;i++)
        {
            System.out.print(result[i] +" ");
        }
        System.out.println();
        int temp[]=new int[result.length];
        for(int i=0;i<result.length;i++)
        {
            temp[i]= result[i];
        }
        for(int i=0;i< result.length;i++)
        {
            System.out.print(temp[i] +" ");
        }
        Arrays.sort(temp);
        System.out.println();
        for(int i=0;i< result.length;i++)
        {
            System.out.print(temp[i] +" ");
        }
        int c=0;
        int z=0;
        boolean []b=new boolean[result.length];
        for(int i=0;i<b.length;i++)
        {
            b[i]=false;
        }
        System.out.println();
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i] +" ");
        }
        System.out.println();
        int count=0;

        while(c< result.length)
        {
            if((temp[c]==result[z]))
            {
                System.out.print(z +" ");
                z=0;
                c++;


            }
            else {
                z++;
            }
        }










    }
}
