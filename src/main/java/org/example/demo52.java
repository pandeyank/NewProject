package org.example;

public class demo52 {
    public static void main(String[] args) {
        int[] A = {1, 4, 5,6};
        int[] B = {2, 3};
        int n=A.length;
        int m=B.length;
        int []z=new int[n+m];
        int p1=0;int p2=0;
        int k=0;
        while((p1<n)&&(p2<m))
        {
            if(A[p1]>B[p2])
            {
                z[k++]=B[p2];
                p2++;
            }
            else
            {
                z[k++]=A[p1];
                p1++;
            }
        }
        while(p1<n)
        {
            z[k++]=A[p1];
            p1++;
        }
        while(p2<m)
        {
            z[k++]=B[p2++];
        }
        for(int i=0;i<z.length;i++)
        {
            System.out.print(z[i] +" ");
        }
        System.out.println();
        int size=z.length;
        System.out.println(size);
        int idx1=-1;
        int idx2=-1;
        int median=0;
        if(size%2==1)
        {
            median=size/2;
            System.out.println("Median is "  +z[median]);
        }
        else
        {
            idx1=size/2-1;
            idx2=idx1+1;
            median=(z[idx1]+z[idx2])/2;
            System.out.println("median is " +median);

        }
    }
}
