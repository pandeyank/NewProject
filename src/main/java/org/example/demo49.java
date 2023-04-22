package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class demo49 {
    public static void main(String[] args) {//5
        int []A = {8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3};
        int B = 3;
        int n=A.length;
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(A[i]))
            {
                hm.put(A[i],hm.get(A[i])+1);
            }
            else
            {
                hm.put(A[i],1);
            }

        }
        System.out.println(hm);
        for(Map.Entry <Integer,Integer> entry:hm.entrySet())
        {
            if(hm.containsKey(entry.getKey()+B))
            {
                count++;
            }
            if(B==0)
            {
                if(entry.getValue()>=2)
                {
                    count++;
                }
            }

        }
        System.out.println(count);





    }
}
