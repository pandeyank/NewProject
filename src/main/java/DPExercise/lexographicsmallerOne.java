package DPExercise;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class lexographicsmallerOne {
    static ArrayList<ArrayList> adj;
    static int[] indeg;

    public static void main(String[] args) {
        int A = 6;
        int[][] B = {{6, 1}, {6, 5}, {5, 4}, {5, 2}, {1, 2}, {1, 3}};
        lexico(A, B);

    }

    private static void lexico(int a, int[][] b) {
        adj = new ArrayList<>(a + 1);
        indeg = new int[a + 1];
        for (int i = 0; i <= a; i++) {
            indeg[i] = 0;
            adj.add(new ArrayList<>());
        }
        for (int edges[] : b) {
            int x = edges[0];
            int y = edges[1];
            adj.get(x).add(y);
            indeg[y]++;
        }
        Queue<Integer> pq = new PriorityQueue<>(a + 1);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (indeg[i] == 0) {
                pq.add(i);
            }
        }
        while (!pq.isEmpty()) {
            int u = pq.poll();
            res.add(u);

            for (int i = 0; i < adj.get(u).size(); i++) {
                int v = (int) adj.get(u).get(i);
                indeg[v]--;
                if (indeg[v] == 0) {
                    pq.add(v);
                }

            }

        }
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
