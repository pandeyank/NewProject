package GraphExercise;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue();

        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();

        // add values

        pq1.add(1);

        pq1.add(5);

        pq1.add(3);

        pq1.offer(4);

        pq1.offer(6);

        pq1.offer(2);

        System.out.println("All values: " + pq1);

        pq2.addAll(pq1);
        System.out.println("All values: " + pq2);
    }
}
