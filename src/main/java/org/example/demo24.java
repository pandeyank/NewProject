package org.example;

import java.util.ArrayList;
import java.util.Collections;

//5, 17, 100, 11
public class demo24 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(5);
        al.add(17);
        al.add(100);
        al.add(11);
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
    }
}
