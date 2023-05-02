package GraphExercise;

public class QueueDemo {
    int arr[];
    int front;
    int rear;
    int size;
    QueueDemo(int capacity)
    {
        arr=new int[capacity];
        front=0;
        rear=0;
        size=0;

    }
    public void enqueue(int data)
    {
        if(rear==arr.length)
        {
            System.out.println("Queue is full");
            System.exit(0);
        }
        arr[rear]=data;
        rear++;
        size++;
    }
    public void dequeue()
    {
        if(size==0)
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        int u=arr[front];
        front++;
        size--;
    }
    public void show()
    {
        for(int i=front;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
