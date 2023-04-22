package org.example;
import java.lang.Math;

public class demo48 {
    public static void main(String[] args) {
        int[]A = {1, 5,2};
        int B = 2;
        int n=A.length;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int ans=Math.abs(A[j]-A[i]);
                System.out.println(ans);
                if(ans==B)
                {
                    count++;
                }

            }
        }
        System.out.println(count);

    }
}
