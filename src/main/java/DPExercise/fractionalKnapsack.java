package DPExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;


/*class pair {
    int A;
    int B;
    double ppw;

    pair(int A, int B, double ppw) {
        this.A = A;
        this.B = B;
        this.ppw = ppw;

    }

}
class sortByppw implements Comparator<pair>
{
   public int compare(pair p1,pair p2)
   {
       return (int) (p2.ppw-p1.ppw);
   }
}*/
public class fractionalKnapsack {


    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40 };
        int[] B = {12, 13, 15, 19};
        int  C = 10;
        int n=A.length;
        /*pair[] items=new pair[n];
        for(int i=0;i< items.length;i++)
        {
            pair p=new pair(A[i],B[i],A[i]/B[i]);

            items[i]=p;

        }
        for(int i=0;i<items.length;i++)
        {
            System.out.print(items[i].A +" ");
            System.out.print(items[i].B +" ");
            System.out.print(items[i].ppw +" ");
        }
        Collections.sort(items,new sortByppw());*/




    }
}
