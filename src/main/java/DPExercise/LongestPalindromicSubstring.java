package DPExercise;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s1="bebeeed";
        int n=s1.length();
        int q=0;
        String s2="";
        for(int i=n-1;i>=0;i--)
        {
            s2+=s1.charAt(i);

        }
        System.out.print(s2 +" ");

    }
}
