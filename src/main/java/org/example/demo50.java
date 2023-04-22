package org.example;

public class demo50 {
    public static void main(String[] args) {
        int[]A = {5, 10, 20, 100, 105};
        int B = 110;
        int n=A.length;
        int count=0;
        int p1=0;
        int p2=n-1;
        while(p1<p2)
        {
            int ans=A[p1]+A[p2];
            if(ans==B)
            {
                count++;
                p1++;
                p2--;
            }
            else if(ans>B)
            {
                p2--;
            }
            else {
                p1++;
            }
        }
        System.out.println(count);



    }
}
