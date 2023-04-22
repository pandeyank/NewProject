package org.example;

import java.util.Arrays;

public class demo53 {
    public static void main(String[] args) {
        int []A = {-2, -1, 2,4,5};
        int B = 10;
        int n=A.length;
        int bestSum=-1;
        int bestDist=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int currSum=(A[i]+A[j])+A[k];
                int currDist=Math.abs(B-currSum);
                if(currDist<bestDist)
                {
                    bestDist=currDist;
                    bestSum=currSum;

                }
                if(currSum>B)
                {
                    k--;
                }
                else {
                    j++;
                }
            }

        }
        System.out.println(bestSum);;

    }
}
