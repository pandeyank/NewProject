package org.example;

import java.util.HashMap;

public class Mapping {
    public static void main(String[] args) {
        String Ak="aba";
        String Bk="ababbaaba";
        int n1=Ak.length();
        int n2=Bk.length();
        int i=0;
        int j=n1-1;
        int count=0;
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int k=0;k<n1;k++)
        {
            if(hm1.containsKey(Ak.charAt(k)))
            {
                hm1.put(Ak.charAt(k),hm1.get(Ak.charAt(k))+1);

            }
            else
            {
                hm1.put(Ak.charAt(k),1);
            }
        }
        System.out.println(hm1);
        while(j<n2)
        {
            HashMap<Character,Integer> hm2=new HashMap<>();
            for(int k=i;k<=j;k++)
            {
                if(hm2.containsKey(Bk.charAt(k)))
                {
                    hm2.put(Bk.charAt(k),hm2.get(Bk.charAt(k))+1);
                }
                else
                {
                    hm2.put(Bk.charAt(k),1);
                }
            }
            if(hm1.equals(hm2))
            {
                count++;
            }
            j++;
            i++;

        }
        System.out.println(count);
    }
}
