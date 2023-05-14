package StackExcercises;

import java.util.Stack;

public class doubleTrouble {
    public static void main(String[] args) {
        String str="abbcbbcacx";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(st.size()>0 && st.peek()==c)
            {
                st.pop();
            }
            else {
                st.push(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(" ");
        while (st.size()>0)
        {
            stringBuilder.append(st.pop());
        }
        System.out.println(stringBuilder.reverse());

    }
}
