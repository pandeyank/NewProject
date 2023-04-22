package org.example;

import java.util.HashSet;

public class hashingSliding {
    public static void main(String[] args) {
        String str="abcghegklmhabk";
        int n=str.length();
        int i=0;
        int j=0;
        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        while(j<n)
        {
            if(hs.contains(str.charAt(j))==false)
            {
                hs.add(str.charAt(j));
                j++;
                ans=Math.max(ans,hs.size());

            }
            else
            {
                hs.remove(str.charAt(i));
                i++;
            }

        }
        System.out.println(ans);
    }
}
