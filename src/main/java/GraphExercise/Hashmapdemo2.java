package GraphExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.List;

public class Hashmapdemo2 {
    List<Pair<List<Integer>, List<Integer>>> adj = new ArrayList<>();
    public static void main(String[] args) {
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<Pair<Integer, Integer>>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.distance-o2.distance;
            }
        });
        pq.add(new Pair<>(0,4));
        pq.add(new Pair<>(3,45));
        pq.add(new Pair<>(1,2));
        while (!pq.isEmpty())
        {
            Pair<Integer,Integer> hig=pq.poll();
            int u= hig.node;
            int v= hig.distance;
            System.out.println(u +" " +v);
        }



    }

    private static class Pair<T, T1> {
        private final T node;
        private final T1 distance;
        Pair(T node,T1 distance)
        {
            this.node=node;
            this.distance=distance;

        }
    }


}
