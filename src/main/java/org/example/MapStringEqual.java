package org.example;

import java.util.HashMap;

public class MapStringEqual {
    public static void main(String[] args) {
        String str1="cat";
        String str2="tac";
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        int n1=str1.length();
        int n2=str2.length();
        for(int i=0;i<n1;i++)
        {
            if(hm1.containsKey(str1.charAt(i)))
            {
                hm1.put(str1.charAt(i),hm1.get(str1.charAt(i))+1);
            }
            else
            {
                hm1.put(str1.charAt(i),1);
            }
        }
        //System.out.println(hm1);
        for(int i=0;i<n2;i++)
        {
            if(hm1.containsKey(str2.charAt(i)))
            {
                hm1.remove(str2.charAt(i),hm1.get(str2.charAt(i)));
            }

        }
        System.out.println(hm1);
        if(hm1.isEmpty())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
