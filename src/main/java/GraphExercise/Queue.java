package GraphExercise;

public class Queue<N> {

    int queue[]=new int[5];
    int front;
    int rear;
    int size;
    public Queue(int n)
    {
        front=0;
        rear=-1;
        size=0;

    }
    public void enqueue(int data)
    {
        if(!(isFull() ==1))
        {
            rear++;
            queue[rear]=data;
            size++;
        }



    }
    public void dequeue()
    {
        if(!(isEmpty()==1))
        {
            int u=queue[front];
            front++;
            size--;
            System.out.println(u);

        }



    }
    public int isEmpty()
    {
       return size=0;
    }
    public int isFull()
    {
        return size=5;
    }
    public void show()
    {
        System.out.println("Elements are:");
        if(size==0)
        {
            System.out.println("Queue underflow");
        }
        if(size==5)
        {
            System.out.println("Queue full");
        }
        for(int i=0;i<queue.length;i++)
        {
            System.out.print(queue[i] +" ");
        }
    }
}
