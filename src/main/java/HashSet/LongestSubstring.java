package HashSet;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="pwwkew";
        int n=s.length();
        int count=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<=hs.size();i++)
        {
            if(!hs.contains(s.charAt(i)))
            {
                hs.add(s.charAt(i));
                count++;
            }
        }
        int e=hs.size();
        int star=0;
        while(e<n)
        {
            if(hs.contains(s.charAt(e)))
            {
                hs.remove(s.charAt(star));
                hs.add(s.charAt(e));
                star++;;
                e++;
            }
            else {
                hs.remove(s.charAt(star));
                hs.add(s.charAt(e));
                star++;
                e++;
                count++;
                count=Math.max(count,hs.size());
            }
        }
        System.out.println(count);
    }
}
