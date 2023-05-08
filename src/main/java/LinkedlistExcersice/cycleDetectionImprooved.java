package LinkedlistExcersice;

public class cycleDetectionImprooved {
    static class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            this.data=x;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=c;
        Node head=a;
        if(cycleDetect(head))
        {
            System.out.println("Cycle Present:");
        }
        else {
            System.out.println("Cycle not Present:");
        }
        
    }

    private static boolean cycleDetect(Node head) {
        Node s=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null)
        {
            s=s.next;
            fast=fast.next.next;
            if(s==fast)
            {
                return true;
            }
        }
        return false;
    }
}
