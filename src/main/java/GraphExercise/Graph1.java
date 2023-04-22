package GraphExercise;

import java.util.ArrayList;

public class Graph1 {
    static int max=1009;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean vis[];
    public static void main(String[] args) {
        int []A={1, 1, 2};
        int n=A.length;
        int B=2;
        int C=1;
        int s=C;
        int d=B;
        int count=0;
        adj=new ArrayList<ArrayList<Integer>>(n+1);
        vis=new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            vis[i]=false;
            adj.add(new ArrayList<Integer>());


        }
        for(int edge:A)
        {
            adj.get(edge).add(edge);



        }
        for(int i=0;i<adj.size();i++)
        {
            System.out.print(adj.get(i) +" ");
        }
        System.out.println();
        Dfs(adj,vis,s);



    }

    private static void Dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int s) {
        if(vis[s]==true)
        {
            return;
        }
        vis[s]=true;
        System.out.println(s);
        for(int i=0;i<adj.get(s).size();i++)
        {
            System.out.println("Hello");

            int v=adj.get(s).get(i);
            if(vis[v]==false)
            {
                Dfs(adj,vis,v);
            }

        }
        for(int i=0;i<vis.length;i++)
        {
            System.out.print(vis[i] +" ");
        }

    }
}
