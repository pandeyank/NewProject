package StackExcercises;

import java.util.Stack;

public class infix2postfix {
    public static void main(String[] args) {
        String str="a+b*c";
        Stack<Character> st=new Stack<>();
        String res=" ";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                res+=ch;
            }

            if(ch=='(')
            {
                st.push(ch);
            }
            if(ch==')')
            {
                while (!st.isEmpty() && st.peek()=='(')
                {
                    res+=st.peek();
                    st.pop();
                }
                st.push(ch);
            }
            else {
                while (st.size()>0 && prec(ch)<=prec(st.peek()))
                {
                    res+=st.peek();
                    st.pop();
                }
                st.push(ch);
            }















        }
        while (!st.isEmpty())
        {
            res+=st.peek();
            st.pop();
        }

        System.out.println(res);

    }

    private static int prec(char ch) {
        if(ch=='+' || ch=='-')
        {
            return 1;
        }
        if(ch=='*' || ch=='/')
        {
            return 2;
        }
        if(ch=='^')
        {
            return 3;
        }
        return -1;
    }
}
