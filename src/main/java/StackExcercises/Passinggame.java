package StackExcercises;

import java.util.Stack;

public class Passinggame {
    public static void main(String[] args) {
        int A = 10;
        int B = 23;
        int[]C = {86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
        int res=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<C.length;i++)
        {
            if(C[i]!=0)
            {
                st.push(C[i]);

            }
            else
            {
                st.pop();
                res=st.peek();
            }


        }
        System.out.println(res);
    }
}
