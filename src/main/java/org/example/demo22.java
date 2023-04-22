package org.example;

import java.util.ArrayList;

public class demo22 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(0);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
        System.out.println();
        swap(al);

    }

    private static void swap(ArrayList<Integer> al) {
        int p1=0;
        int p2=al.size()-1;
        while(p1<=p2)
        {
            int temp=al.get(p2);
            al.set(p2,al.get(p1));
            al.set(p1,temp);
            p1++;
            p2--;
        }
        System.out.println();
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }


    }
}
