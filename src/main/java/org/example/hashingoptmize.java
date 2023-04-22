package org.example;

import java.util.HashSet;

public class hashingoptmize {
    public static void main(String[] args) {//------------->TC->n*n, SC->n
        String str="abcabcded";
        int n=str.length();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Character> hs=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                if(hs.contains(str.charAt(j))==false)
                {
                    hs.add(str.charAt(j));
                }
                else {
                    break;
                }

            }
            ans=Math.max(ans,hs.size());

        }
        System.out.println(ans);
    }
}
