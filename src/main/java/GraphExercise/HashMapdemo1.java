package GraphExercise;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HashMapdemo1 {
    public static void main(String[] args) {
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<Pair<Integer,Integer>>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.getValue-o2.getValue;
            }
        });
        pq.add(new Pair<Integer, Integer>(1,10));
        pq.add(new Pair<Integer, Integer>(2,5));
        pq.add(new Pair<Integer, Integer>(3,15));
        while (!pq.isEmpty())
        {
            Pair<Integer,Integer> higest=pq.poll();
            int x=higest.getKey;
            int u=higest.getValue;
            System.out.println(x);
            System.out.println(u);

        }





    }

    private static class Pair<T, T1> {
     private final T getKey;
     private final T1 getValue;


        private Pair(T first,T1 second) {
            this.getKey=first;
            this.getValue=second;
        }
    }
}

