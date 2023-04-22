package org.example;

import java.util.HashMap;

public class demo15map {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();

        String[] str={"aman","shyam","vivek","shyam"};
        String str1="Heloo";
        char[] n=str1.toCharArray();
        for(char s:n)
        {
            System.out.print(s +" ");
        }
        System.out.println();
        String p;
        for(String c:str)
        {
            p=c;
            char[] x=p.toCharArray();
            for(char w:x)
            {
                System.out.print(w +" ");
                if(hm.containsKey(w))
                {
                    hm.put(w,hm.get(w)+1);
                }
                else
                {
                    hm.put(w,1);
                }


            }

            System.out.println();




        }
        System.out.println(hm);
        int[] val={10,15,20,30};

        String s="egg";
        String t="add";
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        HashMap<Character,Character> hm2=new HashMap<>();
        for(char w:c1)
        {
            if(!hm2.containsKey(w))
            {
                hm2.put(w,c2[w]);
            }


        }
        System.out.print(hm2 +" ");


    }
}
