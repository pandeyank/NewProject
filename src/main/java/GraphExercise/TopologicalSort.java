package GraphExercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TopologicalSort {
    static ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    static int []indeg;
    public static void main(String[] args) {
        int A = 6;
        int[][] B = {{6, 3},
                {6, 1},
                {5, 1},
                {5, 2},
                {3, 4},
                {4, 2} };
        tpSort(A,B);
    }

    private static void tpSort(int a, int[][] b) {
        ArrayList<Integer> res=new ArrayList<>();
        indeg=new int[a+1];
        adj=new ArrayList<>(a+1);
        for (int i=0;i<=a;i++)
        {
            indeg[i]=0;
            adj.add(new ArrayList<>());
        }
        Queue<Integer> q=new ArrayDeque<>(a+1);
        for(int[] edge:b)
        {
            int c=edge[0];
            int d=edge[1];
            adj.get(c).add(d);
            indeg[d]++;
        }
        for(int i=0;i<=a;i++)
        {
            if(indeg[i]==0)
            {
                q.add(i);
            }
        }
        while (!q.isEmpty())
        {
            int u=q.poll();
            res.add(u);
            for(int i=0;i<adj.get(u).size();i++)
            {
                int v=adj.get(u).get(i);
                indeg[v]--;
                if(indeg[v]==0)
                {
                    q.add(v);
                }
            }

        }
        for(int i=1;i<res.size();i++)
        {
            System.out.print(res.get(i) +" ");
        }

    }
}
