package org.example;

public class demo43 {
    public static void main(String[] args) {
        String[] strs = {"alic3","bob","3","4","00000"};
        int n=0;
        for(String str:strs)
        {

            n=Math.max(n,str.length());



        }
        System.out.println(n);
    }
}
