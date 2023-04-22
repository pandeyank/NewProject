package org.example;

import java.util.HashMap;

public class MappingOptimize {
    public static void main(String[] args) {
        String str1="toetactic";
        String str2="tictactoe";
        int flag=0;

        HashMap<Character,Integer> hm1=new HashMap<>();
        //HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            if(hm1.containsKey(str1.charAt(i)))
            {
                hm1.put(str1.charAt(i), hm1.get(str1.charAt(i))+1);
            }
            else {
                hm1.put(str1.charAt(i),1);
            }
        }
        System.out.println(hm1);
        if(str1.length()!=str2.length())
        {
            System.out.println("No");
        }
       else {


            for (int i = 0; i < str2.length(); i++) {
                if (hm1.containsKey(str2.charAt(i))) {
                    int val = hm1.get(str2.charAt(i));
                    val = val - 1;
                    if (val == 0) {
                        hm1.remove(str2.charAt(i));
                    }
                   flag=1;
                }
                else
                {
                    flag=0;
                }


            }
            if (flag == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
