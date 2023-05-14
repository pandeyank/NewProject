package StackExcercises;

import java.util.Stack;

public class balacedparanthesis {
    public static void main(String[] args) {
        String str="{([])}(";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            if(ch==')' && st.peek()=='(')
            {
                st.pop();
            }
            if(ch=='}' && st.peek()=='{')
            {
                st.pop();
            }
            if(ch==']' && st.peek()=='[')
            {
                st.pop();
            }

        }
        if(st.size()==0)
        {
            System.out.println("Balanced Paranthesis");
        }
        else
        {
            System.out.println("Unbalanced");
        }

    }
}
