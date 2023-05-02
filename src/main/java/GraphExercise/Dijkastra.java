package GraphExercise;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkastra {
    //static List<int[]>[]adj;

    public static void main(String[] args) {
            /*int A = 6;
            adj=new ArrayList[A];
            int[][] B = { {0, 4, 9},
                {3, 4, 6},
                {1, 2, 1},
                {2, 5, 1},
                {2, 4, 5},
                {0, 3, 7},
                {0, 1, 1},
                {4, 5, 7},
                {0, 5, 1}};
        int C=4;
        int[] d=new int[A];
        for(int i=0;i<A;i++)
            {
                d[i]=Integer.MAX_VALUE;

            }
        for(int [] edges:B)
        {
            int u=edges[0];
            int v=edges[1];
            int w=edges[2];
            adj[u].add(new int[]{v,w});
            adj[v].add(new int[]{u,w});


        }
       PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{C,0});
        d[C]=0;
        while (!pq.isEmpty())
        {
            int[] curr= pq.poll();
            int node= curr[0];
            int dis= curr[1];
            if(d[node]==dis)
            {
                for(int[] edges:adj[node])
                {
                    int v=edges[0];
                    int w=edges[1];

                    if(d[node]+w<d[v])
                    {
                        d[v]=d[node]+w;
                        pq.offer(new int[]{v, dis + w});
                    }
                }
            }


            //System.out.println(u.getKey +" " +u.getValue);

           /* for(int i=0;i<adj.get(u).size();i++)
            {
                Pair v=adj.get(u).get(i);
                int n1= (int) v.getKey;
                int n2= (int) v.getValue;
                if(d[n1]>d[u]+n2)
                {
                    d[n1]=d[u]+n2;
                    pq.add(new Pair<>(d[n1],n1));
                }


            }
        for(int i=0;i<d.length;i++)
        {
            System.out.print(d[i] +" ");
        }
        }


*/
        System.out.println("Hello");
    }
}

