package QueueExcercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Firstnonrepeatingchar {

    public static void main(String[] args) {
        String str="echedfc";
        frequency(str);
    }

    private static void frequency(String str) {
        int[] frequency=new int[26];
        Arrays.fill(frequency,0);
        for(int i=0;i<str.length();i++)
        {
            frequency[str.charAt(i)-'a']++;
        }
        for(int i=0;i<frequency.length;i++)
        {
            if(frequency[str.charAt(i)-'a']==1)
            {
                System.out.println(str.charAt(i));
                System.exit(0);
            }
        }




    }
}
