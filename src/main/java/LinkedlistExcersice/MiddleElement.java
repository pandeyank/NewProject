package LinkedlistExcersice;

public class MiddleElement {
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
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node head=a;
        Node temp=head;
        Node slow=head;
        Node fast=head;
        while (((fast.next!=null)&&(fast.next.next!=null)))
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println(slow.data +" ");

    }
}
