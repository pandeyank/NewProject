package GraphExercise;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrirityQueueDemo {
    static ArrayList<ArrayList<Integer>> adj;
    static int[] indedeg;
    public static void main(String[] args) {
        int A=6;
        int[][] B={{6,1},{6,5},{5,4},{5,2},{1,2},{1,3}};
        adj=new ArrayList<>(A+1);
        PriorityQueue<Integer> minheap=new PriorityQueue<>(A+1);
        for(int i=0;i<=A;i++)
        {
            indedeg[i]=0;
            adj.add(new ArrayList<>());
        }
        for(int edges[]:B)
        {
            int x=edges[0];
            int y=edges[1];
            adj.get(x).add(y);
            indedeg[y]++;

        }
        for(int i=1;i<=A;i++)
        {
            if(indedeg[i]==0)
            {
                minheap.add(i);
            }
        }
        System.out.print(minheap +" ");

    }
}
