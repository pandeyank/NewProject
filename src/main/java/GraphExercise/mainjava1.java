package GraphExercise;

public class mainjava1 {
    public static void main(String[] args) {
        Queue2 q=new Queue2(5);
        q.enqueue(6);
        q.enqueue(8);
        q.dequeue();
        q.dequeue();
        q.enqueue(16);
        q.enqueue(18);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();




        q.print();

    }
}
