package StackExcercises;

import java.util.Stack;

public class redundentBraces {
    public static void main(String[] args) {
        String str="((a+b))";
        Stack<Character> st=new Stack<>();
        int n=str.length();
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
            }
            if(isOperator(ch))
            {
                st.push(ch);
            }
            if(ch==')')
            {
                if(!st.isEmpty() && st.peek()=='(')
                {
                    flag=true;
                    System.exit(0);
                }
                while (!st.isEmpty() && st.pop()!='(')
                {
                    flag=false;
                    st.pop();
                }
            }

        }
        if(flag==true)
        {
            System.out.println("Redundant --->Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    private static boolean isOperator(char ch) {
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
            return true;
        }
        return false;


    }
}
