package org.example;

import java.util.HashMap;

public class demo16 {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        HashMap<Character,Character> hm2=new HashMap<>();
        for(char w:c1)
        {
            int i=0;
            if(!hm2.containsKey(w))
            {
                hm2.put(w, t.charAt(i));
                i++;
            }



        }
        System.out.print(hm2 +" ");
    }
}
