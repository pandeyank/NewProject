package org.example;

public class demo42 {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s="abc";
        int n=s.length();
        int p=0;
        char[] c=new char[n];
        for(int i=0;i<n;i++)
        {
            c[i]=s.charAt(i);
        }
        for (int i=0;i< c.length;i++)
        {
            System.out.print(c[i] +" ");
        }




    }
}
