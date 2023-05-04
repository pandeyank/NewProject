package LinkedlistExcersice;
public class ReverseFirstKLL {
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
        Node g=new Node(7);
        Node h1=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h1;
        Node head=a;
        int k=4;
        Node th=head;
        Node temp=head;
        Node rh=null;
        while ((k>0)&&(head!=null))
        {
            temp=head;
            head=head.next;
            temp.next=rh;
            rh=temp;
            k--;

        }
        th.next=head;
        while (rh!=null)
        {
            System.out.print(rh.data +" ");
            rh=rh.next;
        }


    }
}
