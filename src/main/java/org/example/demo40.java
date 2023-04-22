package org.example;

import java.util.ArrayList;

public class demo40 {
    public static void main(String[] args) {
        /*int[]A = {1, 7, 9,11};
        int []B = {2, 3};*/
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        A.add(1);
        A.add(7);
        A.add(9);
        A.add(11);
        B.add(2);
        B.add(3);

        int n=A.size();
        int m=B.size();
        //int q=0;
        int p1=0;
        int p2=0;
        ArrayList<Integer> al=new ArrayList<>(n+m);
        int z=0;
        while((p1<n)&&(p2<m))
        {
            if(A.get(p1)<B.get(p2))
            {
                al.set(z++,A.get(p1));
                //z++;
                p1++;
            }
            else
            {
                al.set(z++,B.get(p2));
                //z++;
                p2++;
            }
        }
        while(p1<n)
        {
            al.set(z,A.get(p1));
            //res[q++]=A[p1];
            p1++;
            z++;
        }
        while(p2<m)
        {
            al.set(z,B.get(p2));
            z++;
            p2++;
        }
        System.out.println(al.size());
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i) +" ");
        }
    }
}
