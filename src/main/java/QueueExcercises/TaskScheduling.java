package QueueExcercises;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduling {
    static Queue<Integer> q=new ArrayDeque<>();

    public static void main(String[] args) {
        int[]A = {2, 3, 1, 5, 4};
        int[]B = {1, 3, 5, 4, 2};
        scheduleJobs(A,B);
    }

    private static void scheduleJobs(int[] a, int[] b) {
        for(int i=0;i<a.length;i++)
        {
            q.add(a[i]);
        }
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            while (b[i]!=q.peek())
            {
                int x=q.poll();
                q.add(x);
                count++;
            }
            if(b[i]==q.peek())
            {
                int x=q.poll();
                count++;
            }
        }
        System.out.println(count);
    }
}
