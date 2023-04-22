package AdvanceHashing;

import java.util.HashSet;

public class longestSeqHashing {
    public static void main(String[] args) {
        int[] a = {3,8,2,1,9,6,5,6,7,2};
        int n=a.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);

        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int x=a[i];
            if(!hs.contains(x-1))
            {
                int len=0;
                int y=x;
                while(hs.contains(y))
                {
                    len++;
                    y++;
                }
                ans=Math.max(ans,len);
            }
        }
        System.out.println(ans);
    }
}
