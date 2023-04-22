package org.example;

import java.util.HashMap;

public class shaggyDistanceOptimize {
    public static void main(String[] args) {
        int[] A = {7, 1, 3, 4,0,7};
        int n=A.length;
        int res=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(A[i]))
            {
                int j=hm.get(A[i]);
                hm.put(A[i],hm.get(j-i));
                res=Math.min(res,Math.abs(j-i));

            }
            else
            {
                hm.put(A[i],i);
            }

        }
        if(res==2147483647)
        {
            res=-1;
            System.out.println(res);
        }
        else
        {
            System.out.println(res);
        }




    }
}
