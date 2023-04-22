package org.example;

public class demo47 {
    public static void main(String[] args) {
        int []A = {1, 2, 3, 4, 5};
        int B = 5;
        int n=A.length;
        for(int i=0;i<n;i++)
        {


            for(int j=i;j<n;j++)
            {
                int ans=0;
                for(int k=i;k<=j;k++)
                {
                    ans+=A[k];

                }
                if((ans==B)&&(i!=j))
                {
                    System.out.print(A[i] +" " +A[j]);

                }


            }
            System.out.println();
        }
    }
}
