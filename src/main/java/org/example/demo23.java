package org.example;

import java.util.Arrays;

public class demo23 {
    public static void main(String[] args) {
        int []A={8,5,3,10};
        int []B={5,4,9,2,6,2};
        Arrays.sort(A);
        Arrays.sort(B);
        int n=A.length;
        int m=B.length;
        System.out.println(cntpairs(A,n,m,B));
    }

    private static int cntpairs(int[] a,int n,int m,int []b) {
        int count=0;
        int p1=0;
        int p2=0;
        while((p1<n)&&(p2<m))
        {
            if(a[p1]>b[p2])
            {
                p2++;
                count+=n-p1;

            }
            else
            {
                p1++;
            }
        }
        return count;


    }
}
