package org.example;

import java.util.HashSet;

public class hashing {
    public static void main(String[] args) {
        String str="abcabcdd";
        int n=str.length();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                HashSet<Character> hs=new HashSet<>();
                int len=j-i+1;
                for(int k=i;k<=j;k++)
                {
                    hs.add(str.charAt(k));

                }
                if(len==hs.size())
                {
                    ans=Math.max(ans,len);
                }
            }
        }
        System.out.println(ans);
    }
}
