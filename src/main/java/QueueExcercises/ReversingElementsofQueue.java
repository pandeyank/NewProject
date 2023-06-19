package QueueExcercises;

import java.util.Stack;

public class ReversingElementsofQueue {
    static Stack<Integer> st=new Stack<>();
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 3;
        reversekelement(A,B);
    }

    private static void reversekelement(int[] a, int b) {
        int n=a.length;
        int res[]=new int[n];
        int k=0;
        while (k<b)
        {
            st.push(a[k]);
            k++;
        }
        int count=0;
        while(st.size()>0)
        {
            int x=st.pop();
            res[count]=x;
            count++;
        }
        for(int i=count;i<n;i++)
        {
            res[i]=a[i];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(res[i] +" ");
        }
    }
}
