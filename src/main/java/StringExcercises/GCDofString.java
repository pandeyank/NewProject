package StringExcercises;

import java.util.HashSet;

public class GCDofString {
    public static void main(String[] args) {
        /*Input: str1 = "ABCABC", str2 = "ABC"
        Output: "ABC"*/
        String str1="ABCABC";
        String str2="ABC";
        String res="";
        int n1=str1.length();
        int n2=str2.length();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            hs.add(str1.charAt(i));
        }
        for(int j=0;j<n2;j++)
        {
            if(hs.contains(str2.charAt(j)))
            {
                res=res+str2.charAt(j);
            }
        }
        for(int i=0;i<res.length();i++)
        {
            System.out.print(res.charAt(i) +" ");
        }

    }
}
