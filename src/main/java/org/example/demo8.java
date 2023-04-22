package org.example;

public class demo8 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k=4;
        String [] str=s.split( " ");
        /*for(String s1:str)
        {
            System.out.println(s1);
        }*/
        for(int i=0;i<k;i++)
        {
            System.out.println(str[i]);
        }
    }
}
