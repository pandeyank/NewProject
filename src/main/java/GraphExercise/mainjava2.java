package GraphExercise;

public class mainjava2 {
    public static void main(String[] args) {
        QueueDemo q1=new QueueDemo(5);
        q1.enqueue(10);
        q1.dequeue();
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        q1.show();
    }
}
