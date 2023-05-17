package StackExcercises;

import java.util.Arrays;
import java.util.Stack;

public class firstSmallerImproved {
    static Stack<Integer> st=new Stack<>();
    public static void main(String[] args) {
        int[] arr={4,5,2,10,3,12};
        int n=arr.length;

        int res[]=new int[n];
        firstSmall(arr,res);

    }

    private static void firstSmall(int[] arr, int[] res) {
        int n=arr.length;
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++)
        {
            while (st.size()>0 && arr[i]<st.peek())
            {
                st.pop();
            }
            if(st.size()>0)
            {
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i] +" ");
        }
    }


}
