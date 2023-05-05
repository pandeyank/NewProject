package LinkedlistExcersice;

public class RemoveNthNodefromListEnd {
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
        /*A = 1->2->3->4->5
        B = 2*/
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        int B=2;
        Node head=a;
        Node temp=head;
        Node curr=head;
        Node next=head.next;
        int count=0;

        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        if(count<B)
        {
            System.out.println("Deletion not possible");
            System.exit(0);
        }
        if(count>=B)
        {
            int k=count-B;
            if(k==0)
            {
                head.next=null;
                System.out.println("Empty List");
                System.exit(0);
            }
            int tcount=1;
            while (tcount<k)
            {
                curr=curr.next;
                next=next.next;
                tcount++;
            }
            curr.next=next.next;
            next.next=null;
        }

        while (head!=null)
        {
            System.out.print(head.data +" ");
            head=head.next;
        }


    }
}
