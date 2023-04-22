package org.example;

public class frequencyArray {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "tacg";
        int flag = 0;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq2[str2.charAt(i) - 'a']++;
        }
        for (int i=0;i<26;i++)
        {
            if(freq1[i]!=freq2[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }

    }
}
