package QueueExcercises;

public class implementionQueue {
    static class Node
    {
        int data;
        Node next;


    }

    static Node front=null;
    static Node rear=null;
    static int count=0;
    private static void add(int x)
    {
        Node nn=new Node();
        nn.data=x;
        nn.next=null;
        count++;
        if(front==null)
        {
            front=rear=nn;

        }
        else {
            rear.next=nn;
            rear=rear.next;
        }

    }
    private static int remove()
    {
        if(front==null)
        {
            return -1;
        }
        int x=front.data;
        front=front.next;
        count--;
        return x;
    }
    private static int peek()
    {
        if(front==null)
        {
            return -1;
        }
        return front.data;
    }
    private static int size()
    {
        return count;
    }

    public static void main(String[] args) {


        int a=8;
        int b=14;
        int c=9;
        int d=20;
        add(a);
        add(b);
        add(c);
        add(d);
        println(front,rear);
        remove();
        remove();
        println(front,rear);
        int x=peek();
        System.out.println(x);





    }

    private static void println(Node front, Node rear) {

        while (front!=null)
        {
            System.out.print(front.data +" ");
            front=front.next;
        }
        System.out.println();

        System.out.println(count);
    }

}
