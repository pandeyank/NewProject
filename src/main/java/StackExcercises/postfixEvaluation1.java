package StackExcercises;

import java.util.Stack;

public class postfixEvaluation1 {
    public static void main(String[] args) {
        String str="842-/";
        int n=str.length();
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(isOperator(ch))
            {
                int val2=st.pop();
                int val1=st.pop();
                res=calculateans(val1,val2,ch);
                st.push(res);
            }
            else {
                int num=Integer.parseInt(String.valueOf(ch));
                st.push(num);
            }
        }
        System.out.println(st.pop());
    }

    private static int calculateans(int val1, int val2, char ch) {
        if(ch=='+')
        {
            return val1 + val2;
        }
        if(ch=='-')
        {
            return val1 - val2;
        }
        if(ch=='*')
        {
            return val1 * val2;
        }
        if(ch=='/')
        {
            return val1/val2;
        }
        else
        {
            return -1;
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
