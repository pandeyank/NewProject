package StackExcercises;

import java.util.Stack;

public class doubleTrouble1 {
    public static void main(String[] args) {
        String str="abbd";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(st.size()>0 && st.peek()==ch)
            {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder(" ");
        while (st.size()>0)
        {
            sb.append(st.pop());
        }
        System.out.println(sb.reverse());
    }
}
