package HashSet;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s="abcabcbb";
        HashSet<Character> hs=new HashSet<>();
        int maxcount=Integer.MIN_VALUE;
        int count=0;
        int n=s.length();
        for (int i=0;i<n;i++)
        {
            if(!hs.contains(s.charAt(i)))
            {
                hs.add(s.charAt(i));
                count++;
            }
            else {
                count-=1;

            }
            maxcount=Math.max(maxcount,count);
        }
        System.out.println(maxcount);
    }
}
