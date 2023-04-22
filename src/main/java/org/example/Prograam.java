package org.example;

import java.util.Vector;

public class Prograam {
    public static void main(String[] args) {

        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        String str="";
        int n=indices.length;
        int [] mat=new int[n];
        for(int i=0;i<n;i++)
        {
            mat[i]=indices[i];
        }
        char[] c=new char[s.length()];
        for(int i=0;i< c.length;i++)
        {
            c[i]=s.charAt(i);
        }
        for (int i=0;i<c.length;i++)
        {
            System.out.print(c[i] +" ");
        }
        for(int i=0;i< mat.length;i++)
        {
            mat[indices[i]]=c[i];
        }
        for (int i=0;i< mat.length;i++)
        {
            System.out.print(i +" ");
        }




    }
}
