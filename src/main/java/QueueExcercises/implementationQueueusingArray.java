package QueueExcercises;

public class implementationQueueusingArray {
    static class Queue
    {
        static int size=5;
        static int []arr=new int[size];
        static int front;
        static int rear;
        static int count;
        Queue()
        {
            front=rear=-1;
            count=0;
        }
        private static void add(int x)
        {
            count++;
            if(front==-1)
            {
               front=rear=0;
               arr[rear]=x;
               rear++;
            }
            else {

                arr[rear]=x;
                rear++;
            }
        }
        private static int remove()
        {
            int n=arr.length;
            if(front==-1)
            {
                System.out.println("Not possible");
                return -1;
            }
            int x=arr[front];

            front=(front+1)%n;
            count--;
            return x;
        }
        private static int peek()
        {
            return arr[front];
        }
        private static int size()
        {
            return count;
        }
        private static void printMETHOD()
        {
            for(int i=front;i<rear;i++)
            {
                System.out.print(arr[front] +" ");
            }
        }

    }


    public static void main(String[] args) {
        Queue q=new Queue();
        for(int i=1;i<6;i++)
        {
            q.add(i);
        }
        q.printMETHOD();
        System.out.println();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());


    }


}
