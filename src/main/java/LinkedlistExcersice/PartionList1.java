package LinkedlistExcersice;

public class PartionList1 {
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
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        int B=3;
        Node head=a;
        partion1(head,B);
        //System.out.println();
    }

    private static void partion1(Node head, int b) {
        Node smaller=new Node(-1);
        Node greater=new Node(-1);
        Node small=smaller;
        Node graeat=greater;
        Node temp=head;
        int count=0;
        Node p1=smaller;
        Node p2=greater;
        while (temp!=null)
        {
            if(temp.data<b && count<=b)
            {
                small.next=temp;
                small=small.next;
                count++;
            }
            else {
                graeat.next=temp;
                graeat=graeat.next;
            }
            temp=temp.next;
        }
        graeat.next=null;
        p1=p1.next;
        p2=p2.next;
        Node temp2=p1;
        while (temp2.next!=null)
        {
            temp2=temp2.next;
        }
        temp2.next=p2;
        while(p1!=null)
        {
            System.out.print(p1.data +" ");
            p1=p1.next;
        }

    }
}
