package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class stringEqual {
    public static void main(String[] args) {
        String str1="cat";
        String str2="tac";
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        int n=ch1.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(ch1[i] +" ");
        }
        Arrays.sort(ch1);
        String sorted1=String.valueOf(ch1);
        System.out.println(sorted1);
        Arrays.sort(ch2);
        String sorted2=String.valueOf(ch2);
        System.out.println(sorted2);
        if(sorted1.equals(sorted2))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }


    }
}
