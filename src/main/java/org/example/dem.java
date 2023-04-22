package org.example;

import java.util.ArrayList;

public class dem {
    public static void main(String[] args) {
       /*> Success!
Running Test Cases...
> TestCase - Easy Failed
Wrong Answer
Your program's output doesn't match the expected output. You can try testing your code with custom input and try putting debug statements in your code.
Your submission failed for the following input
A : 1
B : 1000000
C : [ 1000000, 1000000 ]
A : [ 12, 34, 67, 90 ]
B : 2*/
        int A=1;
        int B=1000000;
        int C[]={1000000, 1000000};
        int n=C.length;
        int l=0;
        for(int i=0;i<n;i++)
        {
            int c=C[i];
            l=Math.max(c,l);
        }
        System.out.println(l);
        int r=C[0];
        for(int i=1;i<n;i++)
        {
            int c=C[i];
            r=r+c;
        }
        System.out.println(r);
        int ans=0;

        while(l<=r)
        {
            int mid=(l+r)/2;
            if(check(mid,C,n,A))
            {
                r=mid-1;
                ans=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        System.out.println(ans*B);


    }

    private static boolean check(int mid, int[] c, int n, int a) {
        int s=0;
        int count=1;
        for(int i=0;i<n;i++)
        {
            s+=c[i];
            if(s>mid)
            {
                s=c[i];
                count++;
            }
            if(count>a)
            {
                return false;
            }
        }
        return true;
    }
}
