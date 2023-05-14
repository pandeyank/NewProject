package StackExcercises;

import java.util.ArrayList;
import java.util.Stack;

public class postfixEvaluation {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("10");
        al.add("4");
        al.add("2");
        al.add("-");
        al.add("/");
        al.add("6");
        al.add("*");
        al.add("9");
        al.add("+");
        //al.add("*");
        Stack<Integer> st = new Stack<>();
        int res = 0;
        int ans = 0;
        /*for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }*/
        System.out.println();
        for (String s : al) {
            if (isOperator(s)) {
                int val2 = st.pop();
                int val1 = st.pop();
                res = calculate(val1, val2, s);
                st.push(res);
            } else {
                int num = Integer.parseInt(s);
                st.push(num);
            }


        }
        System.out.println(st.pop());
    }

    private static int calculate(int val1, int val2, String s) {
        if(s=="+")
        {
            return val1+val2;
        }
        if(s=="-")
        {
            return val1-val2;
        }
        if(s=="*")
        {
            return val1*val2;
        }
        if(s=="/")
        {
            return val1/val2;
        }
        return (-1);
    }

    private static boolean isOperator(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
        {
            return true;

        }
        return false;
    }




}
