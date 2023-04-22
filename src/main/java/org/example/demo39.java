package org.example;

import java.util.ArrayList;

public class demo39 {
    public static void main(String[] args) {
        int[]A = {1, 7, 9,11};
        int []B = {2, 3};
        int n=A.length;
        int m=B.length;
        int q=0;
        int[] res=new int[n+m];
        int p1=0;
        int p2=0;
        ArrayList<Integer> al=new ArrayList<>();
        int z=0;
        while((p1<n)&&(p2<m))
        {
            if(A[p1]<B[p2])
            {
                res[q++]=A[p1];
                p1++;
            }
            else
            {
                res[q++]=B[p2];
                p2++;
            }
        }
        while(p1<n)
        {
            res[q++]=A[p1];
            p1++;
        }
        while(p2<m)
        {
            res[q++]=B[p2++];
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i] +" ");
        }
        System.out.println();
        System.out.println("The median is:");
        int s=res.length;
        if(s%2==1)
        {
            int median=s/2;
            System.out.println(res[median]);
        }
        else {
            int s1=(s/2)-1;
            int s2=s1+1;
            int ans=res[s1]+res[s2];
            int median=ans/2;
            System.out.println(median);
        }


    }
}
