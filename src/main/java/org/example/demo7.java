package org.example;

public class demo7 {
    public static void main(String[] args) {
        java.lang.String[] word1 = new java.lang.String[]{"a", "cb"};
        java.lang.String str=" ";
        for(java.lang.String c:word1)
        {
            str+=c;
        }
        System.out.println(str);
        String[] word2 = {"ab", "c"};
        String str1=" ";
        for(String s:word2)
        {
            str1+=s;
        }
        if(str.equals(str1))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }


    }
}
