package LinkedlistExcersice;

public class DLLiterate {
    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int x)
        {
            this.data=x;
            prev=null;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        Node head=a;
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("After Deletion in Between Node:");
        int x=3;
        Node t=deleteBetween(head,x);
        while (t!=null)
        {
            System.out.print(t.data +" ");
            t=t.next;
        }
        int p=50;
        Node t2=insertinBeforeTail(head,p);
        System.out.println();
        System.out.println("Before tail insertion:");
        while (t2!=null)
        {
            System.out.print(t2.data +" ");
            t2=t2.next;
        }
    }

    private static Node insertinBeforeTail(Node head, int p) {
        Node nn=new Node(p);
        Node temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        nn.next=temp.prev.next;
        nn.prev=temp.prev;
        temp.prev.next=nn;
        temp.prev=nn;
        return head;
    }



    private static Node deleteBetween(Node head,int d) {
        Node temp=head;
        while (temp.data!=d)
        {
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=null;
        temp.prev=null;
        return head;

    }
}
