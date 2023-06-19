package QueueExcercises;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class ReverseElementsImprooved {

    static Stack<Integer> st=new Stack<>();
    static Queue<Integer> q=new LinkedList<>();

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 3;
        reverseKelement(A,B);

    }

    private static void reverseKelement(int[] a, int b) {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            q.add(a[i]);
        }
        int k=0;
        while(k<b)
        {
            st.push(q.poll());
            k++;
        }
        while(st.size()>0)
        {
            int x=st.pop();
            q.add(x);


        }
        int res[]=new int[n-b];
        for(int i=0;i<res.length;i++)
        {
            res[i]=q.poll();
        }
        int p=0;
        while (p<res.length)
        {
            int x=res[p];
            q.add(x);
            p++;
        }
       for(Integer element:q)
       {
           System.out.print(element +" ");
       }


    }
}
