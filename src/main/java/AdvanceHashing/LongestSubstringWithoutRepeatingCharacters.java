package AdvanceHashing;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str="abcabdecbb";

        int maxCount=1;
        int n=str.length();
        for(int i=0;i<n-1;i++)
        {
            int count=1;
            HashMap<Character,Integer> hm=new HashMap<>();
            for(int j=i+1;j<n;j++)
            {
                if((str.charAt(i)!=str.charAt(j) && !hm.containsKey(str.charAt(j)) ))
                {

                    count++;
                    if(hm.containsKey(str.charAt(j)))
                    {
                        hm.put(str.charAt(j),hm.get(str.charAt(j)+1));
                    }
                    else {
                        hm.put(str.charAt(j),1);
                    }
                }

            }
            maxCount=Math.max(count,maxCount);
        }
        System.out.println(maxCount);
    }

}
