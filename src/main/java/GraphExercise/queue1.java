package GraphExercise;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>() ;
            for(int i=0;i<5;i++)
            {
                q.add(i);
            }

        System.out.println(q);

    }
}
