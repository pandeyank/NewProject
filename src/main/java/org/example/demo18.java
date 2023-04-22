package org.example;

public class demo18 {
    public static void main(String[] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
        int count=0;
        for(String s:words)
        {
            char[] c=s.toCharArray();
            int i=0;
            int j=c.length-1;


            if (c[i]!=c[j])
            {
                continue;
            }
            else {
                i++;
                j--;

                //System.out.println(s);
            }
            if(count==0)
            {
                System.out.println(s);
            }

        }



    }
}
