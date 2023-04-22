package DPExercise;

import java.util.Arrays;
import java.util.Comparator;

class pair
{
    int profit;
    int weight;
    double ratio;
}

public class fractionalKnapsack1 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40};
        int[] B = {12, 13, 15, 19};
        int C = 10;
        int n=A.length;
        pair[] D=new pair[n];
        for(int i=0;i<n;i++)
        {
           pair x=new pair();
           x.profit=A[i];
           x.weight=B[i];
           x.ratio=(double) A[i]/ (double) B[i];
           D[i]=x;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(D[i].profit +" "+D[i].weight +" "+D[i].ratio +" ");
        }
        Arrays.sort(D, new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                return Double.compare(o2.ratio,o1.ratio);
            }
        });
        System.out.println();
        System.out.println();
        double ans=0;
        int cap=C;
        for(int i=0;i<n;i++)
        {
            if(cap>=D[i].weight)
            {
                ans+=D[i].profit;
                cap-=D[i].weight;
            }
            else
            {
                ans+=(cap*D[i].ratio);
                cap=0;
            }

        }
        System.out.println(ans);



    }
}
