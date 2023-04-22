package org.example;

public class demo9 {
    public static void main(String[] args) {
        String allowed="abc";
        String[] words={"a","b","c","ab","ac","bc","abc"};
        int count=0;
        for(String s:words)
        {

            for(int i=0;i<s.length();i++)
            {
                if (!allowed.contains(s.charAt(i) +" ")) {
                    continue;
                }


            }
            count++;
           /* if(s.contains(allowed))
            {
                count++;
            }*/
            /*for(char c:s.toCharArray())
            {
                System.out.print(c +" ");
            }*/
        }
        System.out.println();
        System.out.println(count);
    }
}
