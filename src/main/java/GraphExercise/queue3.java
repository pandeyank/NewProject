package GraphExercise;
class Queue1
{
    int [] arr;
    int front;
    int rear;
    int count;
    Queue1(int size)
    {
        arr=new int[size];
        front=0;
        rear=-1;
        count=0;
    }
    public void enqueue(int item)
    {
        if(count==arr.length)
        {
            System.out.println("Overflow");
            System.exit(100);
        }
        rear+=1;
        arr[rear]=item;
        count++;
    }

    public void print() {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
    public int peek()
    {
        return arr[rear];
    }
    public int dequeue()
    {
        if(front==rear)
        {
            System.out.println("Underflow");
            System.exit(100);
        }
        int u=arr[front];
        front+=1;
        count--;
        return u;

    }
}

public class queue3 {
    public static void main(String[] args) {
        Queue1 q1=new Queue1(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(25);
        q1.enqueue(30);
        q1.enqueue(35);
        q1.print();
        System.out.println();
        System.out.println(q1.peek());
        System.out.println();
        System.out.println(q1.dequeue());
        q1.print();



    }
}
