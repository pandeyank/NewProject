package GraphExercise;

public class Queue2 {
     int arr[];
     int front;
     int rear;
     int size;
     Queue2(int capacity)
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
             System.out.println("Queue is Empty");
             System.exit(0);
         }
         int u=arr[front];
         front++;
         size--;
         System.out.println(u);
     }
     public void print()
     {
         for(int i=front;i<arr.length;i++)
         {
             System.out.print(arr[i] +" ");
         }
     }
}
