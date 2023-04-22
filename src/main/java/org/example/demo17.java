package org.example;

import java.util.HashSet;
import java.util.Set;

public class demo17 {
    public static void main(String[] args) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
       String [] words={"gin","zen","gig","msg"};
       HashSet<String> hs=new HashSet<>();
       for(String s:words)
       {
           StringBuilder s1=new StringBuilder();
           for(char c:s.toCharArray())
           {
               System.out.println(s1.append(MORSE[c-'a']));
           }

       }
        System.out.println(hs.size());
    }
}
